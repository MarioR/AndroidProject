package com.example.pfc_parking;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Initial extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_initial);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.initial, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
	/*	if(id == R.id.entrarApp){
			finish();
			cambioActivity();
			return true;
		}
		else{*/
			if (id == R.id.action_settings) {
				return true;
			}
		//}

		return super.onOptionsItemSelected(item);
	}
	
	
	public void cambioActivity(View v){
		
		finish();
		
		Intent act = new Intent(this, Index.class);
		 
		startActivity(act);
		
	}
	
	
	public void salirApp(View v){
		
		finish();
		
	}
	
}
