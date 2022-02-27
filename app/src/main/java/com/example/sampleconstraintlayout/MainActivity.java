package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnlogin dengan Componen button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel btnlogin dengan Componen editext1 pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel btnlogin dengan Componen editext2 pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //menyimpan input user di edittext email ke dalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password ke dalam variabel password
                password = edpassword.getText().toString();


                if (nama.isEmpty() && password.isEmpty()){
                    Toast.makeText( MainActivity.this, "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else if (nama.equals("admin@mail.com") && password.equals("abc")) {
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_LONG).show();
                } else if (nama != "admin@mail.com" && password.equals("abc")) {
                        Toast.makeText(MainActivity.this, "Email yang anda masukkan salah", Toast.LENGTH_LONG).show();
                } else if (nama.equals("admin@mail.com") && password != "abc") {
                        Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_LONG).show();
                } else (nama != "admin@mail.com" && password != "abc"){
                    Toast.makeText(MainActivity.this, "Email dan Password Salah", Toast.LENGTH_LONG).show();
                }



            }


        });

    }

}