package com.example.android.valequizapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/01.
 */

public class WordAdapter extends ArrayAdapter {

    private int mColorResourceId;


    /**
     * Creat a new {@link WordAdapter} object
     *
     * @param context is the current (i.e. Activity) that the adapter is being created in
     * @param words   is the list of {@link Word}s to be display
     */

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_item, parent, false);
        }
        Word currentWord = (Word) getItem(position);
//       AndroidFlavor currentAndroidFlavor = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.valequizapp_text_view);
        miwokTextView.setText(currentWord.getMiworkTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
        return listItemView;


    }
}
