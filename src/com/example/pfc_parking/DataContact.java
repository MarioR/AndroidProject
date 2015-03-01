package com.example.pfc_parking;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DataContact extends ActionBarActivity {
	String valor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data_contact);
		
		TextView mytext = (TextView) findViewById(R.id.tvView4);
		Intent intent = getIntent();
		valor = intent.getStringExtra("Name");
		mytext.setText(valor+", here are your contact data.");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.data_contact, menu);
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
}
