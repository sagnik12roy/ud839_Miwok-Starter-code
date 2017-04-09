package com.example.android.miwok;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","apa",R.drawable.family_father,R.raw.family_father));
        words.add(new Word("Mother","ata",R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("Son","angsi",R.drawable.family_son,R.raw.family_son));
        words.add(new Word("Daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("Older Brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("Younger Brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("Older Sister","tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("Younger Sister","kollitti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("Granddmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("Grandfather","paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter Adapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                MediaPlayer mMediaPlayer = MediaPlayer.create(FamilyMembers.this, word.getAudioresourceid());
                mMediaPlayer.start();
            }

        })


    ;};
}


