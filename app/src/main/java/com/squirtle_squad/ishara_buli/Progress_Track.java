package com.example.myapplication;

public class Progress_Track {
    static public int letters[]=new int[38];
    public int learnt;
    static public int score;
    public int progress;
    public int give_progress(int i)
    {
        progress=i;
       return 1;
    }
    public void reset()
    {
        for(int i=0;i<38;i++)
        {
            letters[i]=0;
        }
    }
    public int learn(int i)
    {
        letters[i]=1;
        return 1;
    }
    public int unlearn(int i)
    {
        letters[i]=0;
        return 0;
    }
    public int letters_learnt()
    {
        int sum=0;
        for(int i=0;i<38;i++)
        {
            if(letters[i]==1){sum++;}
        }
        learnt=sum;
        return sum;
    }
    public int min_index()
    {
        int min=40;
        for(int i=0;i<38;i++)
        {
            if(letters[i]==1){
                if(i<min){min=i;}
            }
        }
        return min;
    }

}
