package com.example.android.valequizapp;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/01.
 */

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwork translation for the word
     */
    private String mMiworkTranslation;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static  final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource ID for the word*/
    private int mAudioResourceId;

//    /**
//     * Return the image resource ID for the word.
//     */
//    public int getImageResourceId() {
//        return mImageResourceId;





    /**
     * Create  a new Word object
     *  @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     //* @param  audioResourceId is the resource ID for the audio file associated with this word.
     *
     */

    public Word(String defaultTranslation,String miworkTranslation ) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        //mAudioResourceId= audioResourceId;
    }
    /**
     * Create  a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param  miworkTranslation is the word in Miwork language
     *
     *
     *@param  imageResourceId is the drawable resource ID for the image associated with the word
     */

    public Word(String defaultTranslation, String miworkTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId= audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwork translation of the word.
     */
    public String getMiworkTranslation() {
        return mMiworkTranslation;}


    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this word.
     *
     */

    public  boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;}

    /**
     * Return the audio resource ID of the word.
     * @return
     */

    public int getmAudioResourceId(){return mAudioResourceId; }

}
