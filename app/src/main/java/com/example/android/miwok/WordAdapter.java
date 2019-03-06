package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private Context mContext;
    private ArrayList<Word> words;

    public WordAdapter(Context context , ArrayList<Word> wordList){

        super(context,0,wordList);
        mContext = context;
        words = wordList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listWordsView = convertView;
        if(listWordsView == null){
            listWordsView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = words.get(position);
        TextView defaultText = (TextView) listWordsView.findViewById(R.id.default_text_view);
        defaultText.setText(currentWord.getmDefaultTranslation());

        TextView miwokText = (TextView) listWordsView.findViewById(R.id.miwok_text_view);
        miwokText.setText(currentWord.getmMiwokTranslation());





        return listWordsView;
    }
}
