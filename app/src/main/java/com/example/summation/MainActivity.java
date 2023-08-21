package com.example.summation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.MainActivity2;

public class MainActivity extends AppCompatActivity {

    private EditText name1;
    private EditText name2;
    private EditText phone;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name1 = findViewById(R.id.editTextName);
        name2 = findViewById(R.id.editTextName2);
        phone = findViewById(R.id.editTextPhone);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = name1.getText().toString();
                String lastName = name2.getText().toString();
                String phoneNumber = phone.getText().toString();

                if(firstName.isEmpty()||lastName.isEmpty()||phoneNumber.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Fill all the fields",Toast.LENGTH_LONG).show();
                    return;
                }


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("firstName",  firstName);
                intent.putExtra("lastName",  lastName);
                intent.putExtra("phoneNumber", phoneNumber);

                startActivity(intent);
            }
        });
    }
}

