package com.itis.homework3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_EMAIL = "email";
    public static final String EXTRA_IMAGE = "image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the data passed from the RecyclerView
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        int image = getIntent().getIntExtra(EXTRA_IMAGE, 0);

        // Set the data to the views in the detail activity
        TextView nameTextView = findViewById(R.id.detail_name);
        TextView emailTextView = findViewById(R.id.detail_email);
        ImageView imageView = findViewById(R.id.detail_image);

        nameTextView.setText(name);
        emailTextView.setText(email);
        imageView.setImageResource(image);
    }
}