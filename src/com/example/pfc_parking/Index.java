package com.example.pfc_parking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Index extends Activity {

	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.indice);

	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) { 
		MenuInflater inflater = getMenuInflater(); 
		inflater.inflate(R.menu.index, menu); 
		return true;
	}
*/
	public boolean onOptionsItemSelected(MenuItem item) { 
		switch (item.getItemId()) {
			
		/*	case R.id.registro: 
				finish();
				startActivity(new Intent(this, Principal.class)); 
				return true;
			*/
			case R.id.volver: 
				finish();
				return true;
			
			default:
				return super.onOptionsItemSelected(item); 
		}
	}
	
	
	public void registrarse(View v){
	
		//finish();
		
		Intent act = new Intent(this, Registration.class);
		
		startActivity(act);
		
	}
	
	
	public void volver(View v){

		finish();
		
		Intent act = new Intent(this, Initial.class);
		 
		startActivity(act);
		
	}
	
	public void login(View v){
		
		finish();
		
		Intent act = new Intent(this, Login.class);
		
		startActivity(act);
		
		
	}
}
