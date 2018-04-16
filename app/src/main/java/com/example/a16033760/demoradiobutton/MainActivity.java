package com.example.a16033760.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOK;
    RadioGroup rgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = (Button)findViewById(R.id.button1);


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rgBtn = (RadioGroup)findViewById(R.id.radioGroup1);

                int selectedButton = rgBtn.getCheckedRadioButtonId();

                RadioButton rBtn = (RadioButton)findViewById(selectedButton);

                Toast.makeText(getBaseContext(), rBtn.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
