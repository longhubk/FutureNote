package com.example.futurenote;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView text_app_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_app_name = findViewById(R.id.text_name_app);
        findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    text_app_name.setText(R.string.test);
                    Log.v("Tag", "Button Change is pressed");
//                    int sum = 0;
//                    for (int i = 1; i < 10; i++) {
//                        sum += i;
//                        Log.v("Tag", "Sum: " + sum);
//                    }
                    String str = "";
                    double value = Double.parseDouble(str);
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        });
        findViewById(R.id.btn_change_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                Log.v("Tag", "Button Change Activity is pressed");
            }
        });
        Log.v("Tag", "Program running");
    }
}
