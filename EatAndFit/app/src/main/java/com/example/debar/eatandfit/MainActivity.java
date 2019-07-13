package com.example.debar.eatandfit;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button LoginBtn;
    public EditText email, pass;
    private Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callDB();

        email = (EditText) findViewById(R.id.EmailBox);
        pass = (EditText) findViewById(R.id.PasswordBox);

        LoginBtn = (Button) findViewById(R.id.Login);
        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkLog(email.getText().toString(), pass.getText().toString())) {

                    Intent login = new Intent(MainActivity.this, Menu.class);
                    startActivity(login);
                    email.setText(null);
                    pass.setText(null);
                    email.setHint("Email");
                    pass.setHint("Password");

                }
            }
        });
        SignUp = (Button) findViewById(R.id.SignUp);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainActivity.this, SignUp.class);
                startActivity(signup);
            }
        });


    }

    public boolean checkLog(String name, String pass) {
        SQLiteDatabase db2 = openOrCreateDatabase("DATABASE", MODE_PRIVATE, null);
        final Cursor cursor = db2.rawQuery("SELECT * FROM profile WHERE EMAIL LIKE '" + name + "' AND PASSWORD LIKE '" + pass + "'", null);
        if (cursor.moveToFirst()) {
            Toast.makeText(getApplicationContext(), "correct", Toast.LENGTH_LONG).show();

            db2.close();
            return true;
        } else {
            Toast.makeText(getApplicationContext(), "incorrect", Toast.LENGTH_LONG).show();
            db2.close();
            return false;
        }

    }

    public void callDB() {
        SQLiteDatabase db = openOrCreateDatabase("DATABASE", MODE_PRIVATE, null);
        //db.execSQL("DROP TABLE IF EXISTS profile");

        db.execSQL("CREATE TABLE IF NOT EXISTS profile (FNAME VARCHAR,LNAME VARCHAR,EMAIL VARCHAR,PASSWORD VARCHAR," +
                "CONFIRMPASS VARCHAR);");

        db.execSQL("INSERT INTO profile VALUES ('debashis','ray','debaray14@gmail.com','12345','12345')");
//        db.execSQL("INSERT INTO profile VALUES ('"+fname+"','"+lname+"','debaray14@gmail.com','1234')");


        db.close();
    }


}
