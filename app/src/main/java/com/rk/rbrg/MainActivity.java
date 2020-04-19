package com.rk.rbrg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup RG_Contoh1_IDJAVA;
    RelativeLayout L_RelativeLayout_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RG_Contoh1_IDJAVA = findViewById(R.id.RG_Contoh1_IDXML);
        L_RelativeLayout_IDJAVA = findViewById(R.id.L_RelativeLayout_IDXML);

        RG_Contoh1_IDJAVA.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.RB_Contoh1_IDXML:
                        L_RelativeLayout_IDJAVA.setBackgroundColor(Color.RED);
                        break;
                    case R.id.RB_Contoh2_IDXML:
                        L_RelativeLayout_IDJAVA.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.RB_Contoh3_IDXML:
                        L_RelativeLayout_IDJAVA.setBackgroundColor(Color.GREEN);
                        break;
                }
            }
        });

    }
}
