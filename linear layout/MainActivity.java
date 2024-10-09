package com.example.linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText username, password, address, age;
    private RadioGroup gender;
    private Button submit;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        address = findViewById(R.id.address);
        age = findViewById(R.id.age);
        gender = findViewById(R.id.gender);
        submit = findViewById(R.id.submit);
        output = findViewById(R.id.output);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String addr = address.getText().toString();
                String ageValue = age.getText().toString();
                String genderValue = ((RadioButton) findViewById(gender.getCheckedRadioButtonId())).getText().toString();

                String result = "Username: " + user + "\nPassword: " + pass + "\nAddress: " + addr +
                        "\nGender: " + genderValue + "\nAge: " + ageValue;

                output.setText(result);
            }
        });
    }
}
