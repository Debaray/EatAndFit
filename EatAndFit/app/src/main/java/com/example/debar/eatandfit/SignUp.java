package com.example.debar.eatandfit;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

   private Button signup;
   public  String first_name,last_name,sign_email,sign_password,sign_confirmpassword;
   public  EditText fname,lname,emailsign,passwordsign,cpasswordsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signup = (Button) findViewById(R.id.SignUp_2nd);
        fname = (EditText)findViewById(R.id.FtNameBox) ;
        lname = (EditText)findViewById(R.id.LtNameBox);
        emailsign = (EditText)findViewById(R.id.EmailBoxSign) ;
        passwordsign = (EditText)findViewById(R.id.PasswordBoxSIgn);
        cpasswordsign = (EditText)findViewById(R.id.ConfirmPassBoxSign) ;


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(check(passwordsign.getText().toString(),cpasswordsign.getText().toString()))
                {
                    first_name =  fname.getText().toString();
                    Log.d("checkdb","demo1"+first_name);

                    last_name =  lname.getText().toString();
                    sign_email =  emailsign.getText().toString();
                    sign_password = passwordsign.getText().toString();
                    sign_confirmpassword =  cpasswordsign.getText().toString();

                    Log.d("checkdb","demo1"+first_name);

                    callDB(first_name ,last_name,sign_email,sign_password,sign_confirmpassword);
                    fname.setText(null);
                    lname.setText(null);
                    emailsign.setText(null);
                    passwordsign.setText(null);
                    cpasswordsign.setText(null);
                    Intent sign = new Intent(SignUp.this, MainActivity.class);
                    startActivity(sign);
                    fname.setHint("First Name");
                    lname.setHint("Last Name");
                    emailsign.setHint("Email");
                    passwordsign.setHint("Password");
                    cpasswordsign.setHint("Confirm Password");
                }
            }
        });
    }
    public boolean check(String pass,String cpass)
    {

            if(pass.equals(cpass) && !pass.equals("") && !cpass.equals(""))
            {
                 Toast.makeText(getApplicationContext(),"Accepted",Toast.LENGTH_LONG).show();


            return true;
        }else
        {
            Toast.makeText(getApplicationContext(),"Password And Confirm Password is not correct",Toast.LENGTH_LONG).show();

            return false;
        }


    }
    public void callDB(String f_name ,String l_name,String s_email,String s_password,String s_confirmpassword)
    {
        SQLiteDatabase db =openOrCreateDatabase("DATABASE",MODE_PRIVATE,null);
        //db.execSQL("DROP TABLE IF EXISTS profile");
        Log.d("checkdb","demo"+f_name);
        db.execSQL("CREATE TABLE IF NOT EXISTS profile (FNAME VARCHAR,LNAME VARCHAR,EMAIL VARCHAR,PASSWORD VARCHAR," +
                "CONFIRMPASS VARCHAR);");


        db.execSQL("INSERT INTO profile VALUES ('"+ f_name+"','"+ l_name+"','"+s_email+"','"+s_password+"'" +
                ",'"+s_confirmpassword+"')");


        db.close();
    }
}
