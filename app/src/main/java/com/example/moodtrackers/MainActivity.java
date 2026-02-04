package com.example.moodtrackers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Declare variables
    private EditText moodInput;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure your XML file is named activity_main.xml

        // 2. Initialize variables
        moodInput = findViewById(R.id.moodInput);
        submitButton = findViewById(R.id.submitButton);
        resultText = findViewById(R.id.resultText);

        // 3. Set Click Listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mood = moodInput.getText().toString();

                if (mood.isEmpty()) {
                    resultText.setText("Please enter a mood!");
                } else {
                    resultText.setText("Today is a " + mood + " day!");

                    // Optional: Clear the input after submitting
                    // moodInput.setText("");
                }
            }
        });
    }
}
