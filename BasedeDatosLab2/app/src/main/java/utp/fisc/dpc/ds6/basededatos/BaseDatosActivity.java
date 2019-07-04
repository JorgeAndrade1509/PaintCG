package utp.fisc.dpc.ds6.basededatos;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

/*

public class BaseDatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos);
    }
}
*/


public class BaseDatosActivity extends AppCompatActivity {
    DBAdapter db;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos);
        db = new DBAdapter(this);

        //---Create a contact---
        /*
 db.open();
 long id = db.insertContact("Elba Valderrama", "elbav@ds.net");
 id = db.insertContact("Maria Carrizo", "maria@hotmail.com");
 db.close();
 */


 /*
 //--get all contacts---
 db.open();
 Cursor c = db.getAllContacts();
 if (c.moveToFirst())
 {
 do {
 DisplayContact(c);
 } while (c.moveToNext());
 }
 db.close();
 */

/*
 //---get a contact---
 db.open();
 Cursor c = db.getContact(2);
 if (c.moveToFirst())
 DisplayContact(c);
 else
 Toast.makeText(this, "No contact found", Toast.LENGTH_LONG).show();
 db.close();
 */

 /*
 //---update contact--- yaaaa
 db.open();
 if (db.updateContact(1, "Elba del Carmen", "elbavb@yahoo.com"))
 Toast.makeText(this, "Update successful.", Toast.LENGTH_LONG).show();
 else
 Toast.makeText(this, "Update failed.", Toast.LENGTH_LONG).show();
 db.close();
 */

 /*
 //---delete a contact---   YAAAA
 db.open();
 if (db.deleteContact(1))
 Toast.makeText(this, "Delete successful.", Toast.LENGTH_LONG).show();
 else
 Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
 db.close();
 */

        //---get all contacts--- YAAAA
       /*

        db.open();
        Cursor c = db.getAllContacts();
        if (c.moveToFirst())
        {
            do {
                DisplayContact(c);
            } while (c.moveToNext());
        }
        db.close();

        */
    }

    public void DisplayContact(Cursor c)
    {
        Toast.makeText(this,
                "id: " + c.getString(0) + "\n" +
                        "Name: " + c.getString(1) + "\n" +
                        "Email: " + c.getString(2),
                Toast.LENGTH_LONG).show();
    }

    public void createContact (View view) {

        Intent intent = new Intent(this, AgregarUsuario.class);
        startActivity(intent);

        /*db.open();
        long id = db.insertContact("Elba Valderrama", "elbav@ds.net");
        id = db.insertContact("Maria Carrizo", "maria@hotmail.com");
        db.close();
        */
    }

    public void deleteContact (View view) {


        Intent intent = new Intent(this, EliminarUsuario.class);
        startActivity(intent);


        /*
        db.open();
        if (db.deleteContact(1))
            Toast.makeText(this, "Delete successful.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();
        */
    }

    public void getAllContacts (View view){
        db.open();
        Cursor c = db.getAllContacts();
        if (c.moveToFirst())
        {
            do {
                DisplayContact(c);
            } while (c.moveToNext());
        }
        db.close();
    }

    public void updateContact (View view){

        Intent intent = new Intent(this, ActualizarUsuario.class);
        startActivity(intent);

       /* db.open();
        if (db.updateContact(1, "Elba del Carmen", "elbavb@yahoo.com"))
            Toast.makeText(this, "Update successful.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Update failed.", Toast.LENGTH_LONG).show();
        db.close();
        */
    }

    public void getOneContact (View view) {

        Intent intent = new Intent(this, VerContacto.class);
        startActivity(intent);
        /*db.open();
        Cursor c = db.getContact(2);
        if (c.moveToFirst())
            DisplayContact(c);
        else
            Toast.makeText(this, "No contact found", Toast.LENGTH_LONG).show();
        db.close();
        */
    }


}