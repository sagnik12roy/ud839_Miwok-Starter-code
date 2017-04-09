package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.getColor;

/**
 * Created by KARNA on 4/4/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    private int colorresourceid;
    public WordAdapter(Activity context, ArrayList<Word>words,int id) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        colorresourceid=id;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
    }


       Word currentWord=getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.gettranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set t his text on the number TextView
        defaultTextView.setText(currentWord.getactual());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasimage()) {
              icon.setImageResource(currentWord.getImageresourceid());
            icon.setVisibility(View.VISIBLE);
        }
        else
        {
            icon.setVisibility(View.GONE);
        }
        //selecting the theme of the  document//
        View textContainer = listItemView.findViewById(R.id.container);
                // Find the color that the resource ID maps to
                        int color = getColor(getContext(), colorresourceid);
                // Set the background color of the text container View
                        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView



        return listItemView;
    }

    }
