package com.example.android.miwok;

/**
 * Created by KARNA on 4/3/2017.
 */

public class Word {

    private String actual;
    private String translation;
    private static final int car = -1;
    private int imageresourceid=car;
    private int audioresourceid;

    public Word(String mom,String dad)
    {
        actual=mom;
        translation=dad;
    }

    public Word(String mom,String dad,int image,int bus)
    {
        actual=mom;
        translation=dad;
        imageresourceid=image;
        audioresourceid=bus;
    }
 public String  getactual()
 {
     return actual;
 }
 public String gettranslation()
 {
     return translation;
 }
 public int getImageresourceid(){return imageresourceid;}
 public boolean hasimage(){
        return imageresourceid != car;
    }
 public int getAudioresourceid(){return audioresourceid;}
}
