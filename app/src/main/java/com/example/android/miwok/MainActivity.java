/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
            }
                                   }
        );


        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener(){

                                       @Override

                                       public void onClick(View view){
                                           Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                                           startActivity(colorIntent);
                                       }
                                   }
        );

        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener(){

                                      @Override

                                      public void onClick(View view){
                                          Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                                          startActivity(familyIntent);
                                      }
                                  }
        );

        TextView phrase = (TextView) findViewById(R.id.phrases);

        phrase.setOnClickListener(new View.OnClickListener(){

                                      @Override

                                      public void onClick(View view){
                                          Intent phraseIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                                          startActivity(phraseIntent);
                                      }
                                  }
        );
    }

   /*public void openColorsActivity(View view){
        Intent startColorsActivity = new Intent(this, ColorsActivity.class);
        startActivity(startColorsActivity);
    }

    public void openFamilyActivity(View view){
        Intent startFamilyActivity = new Intent(this, FamilyActivity.class);
        startActivity(startFamilyActivity);
    }



    public void openNumbersActivity(View view){
        Intent startNumbersActivity = new Intent(this, NumbersActivity.class);
        startActivity(startNumbersActivity);
    }
    public void openPhrasesActivity(View view){
        Intent startPhrasesActivity = new Intent(this, PhrasesActivity.class);
        startActivity(startPhrasesActivity);
    }
    */



}
