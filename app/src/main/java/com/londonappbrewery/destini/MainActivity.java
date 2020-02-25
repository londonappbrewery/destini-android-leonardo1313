package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mAnswerButtonTop;
    private Button mAnswerButtonBottom;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTextView = findViewById(R.id.storyTextView);
            mAnswerButtonTop = findViewById(R.id.buttonTop);
            mAnswerButtonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mAnswerButtonTop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mStoryIndex == 1 || mStoryIndex == 2) {
                        mStoryTextView.setText(R.string.T3_Story);
                        mAnswerButtonTop.setText(R.string.T3_Ans1);
                        mAnswerButtonBottom.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }else if (mStoryIndex == 3){
                        mStoryTextView.setText(R.string.T6_End);
                        mAnswerButtonTop.setVisibility(View.GONE);
                        mAnswerButtonBottom.setVisibility(View.GONE);
                    }

                }
            });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mAnswerButtonBottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mStoryIndex == 1) {
                        mStoryTextView.setText(R.string.T2_Story);
                        mAnswerButtonTop.setText(R.string.T2_Ans1);
                        mAnswerButtonBottom.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                    }else if (mStoryIndex == 2){
                        mStoryTextView.setText(R.string.T4_End);
                        mAnswerButtonTop.setVisibility(View.GONE);
                        mAnswerButtonBottom.setVisibility(View.GONE);
                    }
                    else if (mStoryIndex == 3){
                        mStoryTextView.setText(R.string.T5_End);
                        mAnswerButtonTop.setVisibility(View.GONE);
                        mAnswerButtonBottom.setVisibility(View.GONE);
                    }
                }
            });

    }
}
