package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This is toast", Toast.LENGTH_SHORT).show();
//                Toast.makeText(context:MainActivity.this,text:"hello world",Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                if(s==null)
                    Toast.makeText(MainActivity.this, "Please Enter the value properly", Toast.LENGTH_SHORT).show();

                else {
                    int kms = Integer.parseInt(s);


                    double miles = kms / 1.609;
                    textView.setText("aprroximated miles are" + miles);
                }
            }
        });

    }
}