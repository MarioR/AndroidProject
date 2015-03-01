package com.example.pfc_parking;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class UserInformation extends ActionBarActivity {
	String valor;
	String frase;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_information);
		
/*		Bundle extra = getIntent().getExtras();
		if(extra!=null){
			valor = extra.getString("Name");
		}
		frase = "Bienvenido "+valor;
		//LinearLayout lview = (LinearLayout)findViewById(R.id.activity_user_information); 
		 */
/*		LinearLayout lview = new LinearLayout(this);
		TextView mytext = new TextView(this);
		mytext.setText(frase);
		lview.addView(mytext);
		setContentView(lview);
	*/
		TextView mytext = (TextView) findViewById(R.id.tvView);
		Intent intent = getIntent();
		valor = intent.getStringExtra("Name");
		mytext.setText("Wellcome "+valor);		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_information, menu);
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
	
	public void doAnActivity(View v){

		finish();

		Intent intent = new Intent(getApplicationContext(), UserMenu.class);
		intent.putExtra("Name", valor);
		startActivity(intent);
	}
	
	
	public void userDataContact(View v){
		
		finish();
		
		Intent intent = new Intent(this, DataContact.class);
		intent.putExtra("Name", valor);
		startActivity(intent);
		
	}
	
	public void actRecord(View v){
		
		finish();
		
		Intent intent = new Intent(this, DataRecord.class);
		intent.putExtra("Name", valor);
		startActivity(intent);
		
	}
	
	public void exitSession (View v){

		finish();
		
		Intent act = new Intent(this, Index.class);
		 
		startActivity(act);
		
	}

}


/*
	- quiero hacer que al iniciar sesión, el nombre que contiene, se le pase a esta actividad, la cual mostrará en pantalla el valor
	  que tendrá la variable.
*/