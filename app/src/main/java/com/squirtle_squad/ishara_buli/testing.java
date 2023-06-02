package com.squirtle_squad.ishara_buli;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squirtle_squad.ishara_buli.ml.Model;

import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class testing extends AppCompatActivity {

    Button camera, gallery;
    ImageView imageView;
    TextView result;
    TextView performance;
    TextView score;
    com.example.myapplication.Progress_Track pt=new com.example.myapplication.Progress_Track();
    TextView letter;
    int imageSize = 224;
    Button next;


    int b=pt.learn(1);
    int a=pt.learn(2);
    int c=pt.learn(3);
    int d=pt.learn(4);
    int e=pt.learn(5);
    int f=pt.learn(6);
    int cnt=0;
    final int[] min = {40};
    final int[] finalMin=min;
    int signs_learnt=pt.letters_learnt();



    int min2=pt.min_index();

    String[] classes = {"অ/ য়","আ", "ই/ঈ", "উ/ঊ", "ঋ/ র/ ড়/ ঢ় " ,"এ","ঐ","ও","ঔ",
            "ক","খ","গ", "ঘ","ঙ","চ", "ছ", "জ/য" ,"ঝ", "ঞ","ট",
            "ঠ", "ড" , "ঢ" ,"ণ/ন ","ত" ,"থ","দ", "ধ", "প",
            "ফ", "ব/ভ" ,"ম" ,"ল" ,"শ/ষ/স", "হ", "ং", "ঃ","ঁ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        camera = findViewById(R.id.button);
        gallery = findViewById(R.id.button2);

        result = findViewById(R.id.result);
        imageView = findViewById(R.id.imageView);
        performance=findViewById(R.id.performance);
        score=findViewById(R.id.Score);
        letter=findViewById(R.id.letter);
        int learnt_letters[]=new int[38];
        for(int i=0;i<38;i++){ learnt_letters[i]=0;}

        for(int i=0;i<38;i++)
        {
            if(pt.letters[i]==1){
                      learnt_letters[i]=1;
                      if(i< min2){
                          min2 =i;}
            }
        }
        finalMin[0] = min2;


        next=findViewById(R.id.Next_SIgn);
        letter.setText(classes[min2]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int next=40;
                for(int j = finalMin[0] +1; j<38; j++)
                {
                    if(pt.letters[j]==1){next=j; finalMin[0] =j; break;
                }

                }
                if(next==40)
                {
                    int b=pt.give_progress(cnt);
                    pt.score=cnt;
//                    Intent return_home=new Intent(getApplicationContext(),learn.class);
//                    startActivity(return_home);
                }
                letter.setText(classes[finalMin[0]]);
                imageView.setImageDrawable(null);
                performance.setText("");


            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                    Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(cameraIntent, 3);
                } else {
                    requestPermissions(new String[]{Manifest.permission.CAMERA}, 100);
                }
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(cameraIntent, 1);
            }
        });
    }

    public void classifyImage(Bitmap image){
        try {
            Model model = Model.newInstance(getApplicationContext());

            // Creates inputs for reference.
            TensorBuffer inputFeature0 = TensorBuffer.createFixedSize(new int[]{1, 224, 224, 3}, DataType.FLOAT32);
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4 * imageSize * imageSize * 3);
            byteBuffer.order(ByteOrder.nativeOrder());

            int[] intValues = new int[imageSize * imageSize];
            image.getPixels(intValues, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
            int pixel = 0;
            //iterate over each pixel and extract R, G, and B values. Add those values individually to the byte buffer.
            for(int i = 0; i < imageSize; i ++){
                for(int j = 0; j < imageSize; j++){
                    int val = intValues[pixel++]; // RGB
                    byteBuffer.putFloat(((val >> 16) & 0xFF) * (1.f / 1));
                    byteBuffer.putFloat(((val >> 8) & 0xFF) * (1.f / 1));
                    byteBuffer.putFloat((val & 0xFF) * (1.f / 1));
                }
            }

            inputFeature0.loadBuffer(byteBuffer);

            // Runs model inference and gets result.
            Model.Outputs outputs = model.process(inputFeature0);
            TensorBuffer outputFeature0 = outputs.getOutputFeature0AsTensorBuffer();

            float[] confidences = outputFeature0.getFloatArray();
            // find the index of the class with the biggest confidence.
            int maxPos = 0;
            float maxConfidence = 0;
            for (int i = 0; i < confidences.length; i++) {
                if (confidences[i] > maxConfidence) {
                    maxConfidence = confidences[i];
                    maxPos = i;
                }
            }
            //String[] classes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
              //      "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
                //    "30", "31", "32", "33", "34", "35", "36", "37"};


            result.setText("ছবিটি হলো: "+ classes[maxPos]);
            if(classes[maxPos] == classes[finalMin[0]])
            {
                cnt++;
                performance.setText("আপনার ইশারাটি  সঠিক!");
                score.setText("স্কোর: "+Integer.toString(cnt)+" / "+signs_learnt);
            }
            else
            {
                int b=pt.unlearn(finalMin[0]);
                performance.setText("আপনার ইশারাটি  ভুল হয়েছ।");
                score.setText("স্কোর: "+Integer.toString(cnt)+" / "+signs_learnt);

            }

            // Releases model resources if no longer used.
            model.close();
        } catch (IOException e) {
            // TODO Handle the exception
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode == RESULT_OK){
            if(requestCode == 3){
                Bitmap image = (Bitmap) data.getExtras().get("data");
                int dimension = Math.min(image.getWidth(), image.getHeight());
                image = ThumbnailUtils.extractThumbnail(image, dimension, dimension);
                imageView.setImageBitmap(image);

                image = Bitmap.createScaledBitmap(image, imageSize, imageSize, false);
                classifyImage(image);
            }else{
                Uri dat = data.getData();
                Bitmap image = null;
                try {
                    image = MediaStore.Images.Media.getBitmap(this.getContentResolver(), dat);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                imageView.setImageBitmap(image);

                image = Bitmap.createScaledBitmap(image, imageSize, imageSize, false);
                classifyImage(image);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
