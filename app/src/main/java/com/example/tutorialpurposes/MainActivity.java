package com.example.tutorialpurposes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean imageSide = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_attempt_two);

        final Button swapButton = (Button) findViewById(R.id.swapButton);
        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchSide();
            }

        });}

        public void switchSide(){
            imageSide = !imageSide;
            TextView tutorialText = (TextView) findViewById(R.id.tutorial_textmessage);
            ImageView tutorialImage = (ImageView) findViewById(R.id.lane);
            if (imageSide){
                tutorialText.setText(R.string.tutorial_message);
                tutorialImage.setImageDrawable(this.getResources().getDrawable(R.drawable.lane));
            }else{
                tutorialText.setText(R.string.alternative_message);
                tutorialImage.setImageDrawable(this.getResources()
                        .getDrawable(R.drawable.banana_r_tutorial));

            }
        }

}
