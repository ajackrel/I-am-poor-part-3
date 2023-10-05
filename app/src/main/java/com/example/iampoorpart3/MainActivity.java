/*
NAME:
DATE:
ASSIGNMENT: I AM POOR PART 3
 */

/*
ASSIGNMENT: I AM POOR PART 3
-convert the component tree to CONSTRAINT LAYOUT (NOTE: Do not use Linear Layout for this assignment)
-Rebuild the I am Poor app from part 2, but add the following:
    -add a EditText XML component (NUMBER is probably the most appropriate)
        -in the HINT attribute - enter 'How many gold bars do you own?' (without quotes)
    -add an event listener to the button
    -when user touches the button (with a event listener) the:
        -check the number the user enters - if more than 0, text changes from I AM POOR to I AM RICH
    -add comments to every method and variable you have added. Yes, everything YOU ADDED
    -add doc comment at top of .java with all necessary info.
-Commit and push to your repos to submit assignment

 */

package com.example.iampoorpart3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        number = findViewById(R.id.editTextNumber);

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //AS YOU CAN SEE - YOU HAVE TO CONVERT TO A STRING, THEN PARSE/CAST TO AN INT
                //TextEdit CAN DISPLAY ONLY STRINGS (NO DOUBLES OR INT)
                //***************************************************
                //BE CAREFUL PROCEEDING!!!!!!!!!!!!!!!!!!!!!!!!!!
                //YOU MUST PARSE/CAST FOR THE APP TO WORK
                //IF YOU GET CRASHES (IE, THE APP DISAPPEARS FROM THE SCREEN)
                //CHECK YOUR CASTING!!!!
                Integer.parseInt(number.getText().toString());

                text.setText(number.getText().toString());

            }

        });


    }
}