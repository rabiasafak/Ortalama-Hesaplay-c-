package com.example.ifelse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText vize;
    EditText final1;
    TextView sonuc;
    Button hesapla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       vize=findViewById(R.id.vize_edt);
       final1=findViewById(R.id.final_edt);
       hesapla=findViewById(R.id.btn_hesapla);
       sonuc=findViewById(R.id.sonuc_txt);

       hesapla.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Double tutucu=Double.parseDouble(vize.getText().toString());
               Double tutucu2=Double.parseDouble(final1.getText().toString());
               Double sonucson=(tutucu*0.4+tutucu2*0.6);
               sonuc.setText(sonucson.toString());

         }
       });
    }
}