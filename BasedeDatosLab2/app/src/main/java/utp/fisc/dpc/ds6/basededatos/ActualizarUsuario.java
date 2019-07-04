package utp.fisc.dpc.ds6.basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class ActualizarUsuario extends AppCompatActivity {
    DBAdapter db;
    String nombre="";
    String correo="";
    int numberID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_usuario);
        Intent intent = getIntent();
        db = new DBAdapter(this);
    }

    public void buttonPressed(View view){
        AsignarVariables();
        updateContact();
    }

    public void updateContact (){

       db.open();
        if (db.updateContact(numberID, nombre, correo))
            Toast.makeText(this, "Update successful.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Update failed.", Toast.LENGTH_LONG).show();
        db.close();
    }

    public void AsignarVariables(){
        EditText fieldNombre = (EditText) findViewById(R.id.editText7);
        EditText fieldCorreo = (EditText) findViewById(R.id.editText8);

        EditText idCampo = (EditText) findViewById(R.id.editText9);
        numberID = Integer.parseInt(idCampo.getText().toString());

        nombre = fieldNombre.getText().toString();
        correo = fieldCorreo.getText().toString();
    }

}
