package utp.fisc.dpc.ds6.basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class EliminarUsuario extends AppCompatActivity {

    DBAdapter db;
    int numberID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_usuario);
        Intent intent = getIntent();
        db = new DBAdapter(this);
    }

    public void deleteContact () {

        db.open();
        if (db.deleteContact(numberID))
            Toast.makeText(this, "Delete successful.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();

    }

    public void buttonPressed(View view){
       AsignarVariables();
       deleteContact();
    }

    public void AsignarVariables(){
        EditText idCampo = (EditText) findViewById(R.id.editText5);
        numberID = Integer.parseInt(idCampo.getText().toString());
    }

}
