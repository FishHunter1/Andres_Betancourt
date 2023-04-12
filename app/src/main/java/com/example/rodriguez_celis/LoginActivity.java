package com.example.rodriguez_celis;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class LoginActivity {
}
public void clickIniciarSesion(View view){
    String PASS = "123456";
    String USER = "andres";

    String passUser = etPassword.getText().toString();
    String userUser = etUsuario.getText().toString();

    if(PASS.equals(passUser)&&USER.equals(userUser)){
        Intent miIntent= new Intent(this,MainActivity.class);
        startActivity(miIntent);
        finish();
    }else{
        Toast.makeText(this,"CREDENCIALES INCORRECTAS",Toast).show();
    }
}