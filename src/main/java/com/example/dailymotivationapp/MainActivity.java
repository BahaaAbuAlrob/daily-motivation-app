package com.example.dailymotivationapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] quotes = {
            "The best time to start was yesterday. The next best time is now.",
            "Believe you can and you're halfway there.",
            "Don’t wait. The time will never be just right.",
            "Push yourself, because no one else is going to do it for you.",
            "Success is what happens after you survive all your mistakes.",
            "Dream it. Wish it. Do it.",
            "Stay positive, work hard, make it happen."
    };

    TextView quoteText;
    Button refreshButton;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteText = findViewById(R.id.quoteText);
        refreshButton = findViewById(R.id.refreshButton);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = random.nextInt(quotes.length);
                quoteText.setText(quotes[index]);
            }
        });
    }
}
