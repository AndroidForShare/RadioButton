package com.pram.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rbGroup;
    RadioButton rbYes, rbNo, rbMaybe;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbGroup = (RadioGroup) findViewById(R.id.rbGroup);
        rbYes = (RadioButton) findViewById(R.id.rbYes);
        rbNo = (RadioButton) findViewById(R.id.rbNo);
        rbMaybe = (RadioButton) findViewById(R.id.rbMaybe);
        btnOk = (Button) findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rbGroup.getCheckedRadioButtonId()) {
                    case R.id.rbYes:
                        Toast.makeText(MainActivity.this, rbYes.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbNo:
                        Toast.makeText(MainActivity.this, rbNo.getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbMaybe:
                        Toast.makeText(MainActivity.this, rbMaybe.getText(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
