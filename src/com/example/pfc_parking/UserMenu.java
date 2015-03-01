package com.example.pfc_parking;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class UserMenu extends ActionBarActivity {
	String valor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_menu);
		
		
		TextView mytext = (TextView) findViewById(R.id.tvView2);
		Intent intent = getIntent();
		valor = intent.getStringExtra("Name");
		mytext.setText(valor+", What do you want to do?");
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_menu, menu);
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
	
	
	public void goBack(View v){

		finish();
		
		Intent intent = new Intent(getApplicationContext(), UserInformation.class);
		intent.putExtra("Name", valor);
		startActivity(intent);
		
	}
	

	
	//Esta funcion hará consulta a la base de datos/mapa para ver que parking hay cerca de la posición del dispositivo
	
	public void listOfParkings (View v){
		

		finish();
		
		Intent act = new Intent(this, ListOfParking.class);
		 
		startActivity(act);
		
	}
	
	public void seePosition (View v){
		
		goToUrl ("https://maps.google.es/"); 

		//finish();
		
		//Intent act = new Intent(this, Index.class);
		 
		//startActivity(act);
		
	}
	
	private void goToUrl (String url) {
		Uri uriUrl = Uri.parse(url);
		Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl); 
		startActivity(launchBrowser);
	} 
	
}
