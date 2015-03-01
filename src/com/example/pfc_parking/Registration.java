package com.example.pfc_parking;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends ActionBarActivity {

	EditText name;
	EditText password;
	EditText idcard;
	EditText telephone;
	EditText email;
	EditText carlicense;
	EditText creditcard;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		
		name= (EditText) findViewById(R.id.nameUser);
		password= (EditText) findViewById(R.id.password);
		idcard= (EditText) findViewById(R.id.idCard);
		telephone= (EditText) findViewById(R.id.telephone);
		email= (EditText) findViewById(R.id.emailUser);
		carlicense= (EditText) findViewById(R.id.carLicense);
		creditcard= (EditText) findViewById(R.id.creditCard);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registration, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	public void validar(View v){
		
		String nombre;
		String pass;
		String dni;
		String telefono;
		String correo;
		String carneConducir;
		String tarjetaCredito;

		nombre= name.getText().toString();
		pass = password.getText().toString();
		dni = idcard.getText().toString();
		telefono = telephone.getText().toString();
		correo = email.getText().toString();
		carneConducir = carlicense.getText().toString();
		tarjetaCredito = creditcard.getText().toString();
		
		
	/*	Toast.makeText(Registration.this, nombre, Toast.LENGTH_LONG).show();
		Toast.makeText(Registration.this, pass, Toast.LENGTH_LONG).show();
		Toast.makeText(Registration.this, dni, Toast.LENGTH_LONG).show();
		Toast.makeText(Registration.this, telefono, Toast.LENGTH_LONG).show();
		Toast.makeText(Registration.this, correo, Toast.LENGTH_LONG).show();
		Toast.makeText(Registration.this, carneConducir, Toast.LENGTH_LONG).show();
		Toast.makeText(Registration.this, tarjetaCredito, Toast.LENGTH_LONG).show();
		
	*/	
		
		if((!(nombre.equalsIgnoreCase(""))) && (!(pass.equalsIgnoreCase(""))) && (!(dni.equalsIgnoreCase(""))) && (!(telefono.equalsIgnoreCase(""))) && (!(correo.equalsIgnoreCase(""))) && (!(carneConducir.equalsIgnoreCase(""))) && (!(tarjetaCredito.equalsIgnoreCase("")))){
			
				finish();
			//	Intent act = new Intent(this, Index.class);
				 
			//	startActivity(act);
			
		}
				 		
	}	
	
	public void returnBack(View v){

		finish();
		
		Intent act = new Intent(this, Index.class);
		 
		startActivity(act);
		
	}
	
	
}
