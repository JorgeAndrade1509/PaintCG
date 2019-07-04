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


public class AgregarUsuario extends AppCompatActivity {

    DBAdapter db;
    String nombre="";
    String correo="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_usuario);
       db = new DBAdapter(this);
        Intent intent = getIntent();
    }

    public void DisplayContact(Cursor c)
    {
        Toast.makeText(this,
                "id: " + c.getString(0) + "\n" +
                        "Name: " + c.getString(1) + "\n" +
                        "Email: " + c.getString(2),
                Toast.LENGTH_LONG).show();
    }

    public void buttonPressed(View view){
        AsignarVariables();
        createContact();
        Toast.makeText(this, "Usuario " + nombre + " agregado.", Toast.LENGTH_LONG).show();
    }

    public void AsignarVariables(){
        EditText fieldNombre = (EditText) findViewById(R.id.editText);
        EditText fieldCorreo = (EditText) findViewById(R.id.editText2);

         nombre = fieldNombre.getText().toString();
         correo = fieldCorreo.getText().toString();
    }

    public void createContact () {
        db.open();
        long id = db.insertContact(nombre,correo);
        db.close();
    }



}
