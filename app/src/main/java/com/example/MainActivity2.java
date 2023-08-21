package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.summation.MainActivity;
import com.example.summation.R;

public class MainActivity2 extends AppCompatActivity {

    private Button button2;
    private TextView firstname;
    private TextView lastname;
    private TextView phonenumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstname = findViewById(R.id.textView1);
        lastname = findViewById(R.id.textView2);
        phonenumber = findViewById(R.id.textView3);
        button2 = findViewById(R.id.button2);

        Intent intent = getIntent();
        if (intent != null) {
            String firstName = intent.getStringExtra("firstName");
            String lastName = intent.getStringExtra("lastName");
            String phoneNumber = intent.getStringExtra("phoneNumber");

            firstname.setText("First Name: " + firstName);
            lastname.setText("Last Name: " + lastName);
            phonenumber.setText("Phone: " + phoneNumber);
        }
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
        }
    });
}
}


