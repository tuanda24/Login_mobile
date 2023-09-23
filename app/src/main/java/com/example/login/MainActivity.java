package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
//        EditText editTextQMK = findViewById(R.id.editTextQMK);
        Button buttonLogin = findViewById(R.id.buttonLogin);
        Button buttonSupport =findViewById(R.id.buttonSupport);
        Button buttonClose =findViewById(R.id.buttonClose);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("admin") && password.equals("admin")) {
                    AlertDialog.Builder builder =  new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Login Access");
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();

                } else {
                    AlertDialog.Builder builder =  new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Login Fail");
                    builder.setMessage("User account or password incorrect");
                    builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });
        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =  new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Do you want exit?");
                builder.setMessage("Select Option");
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.setPositiveButton("Ok!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
    }
}