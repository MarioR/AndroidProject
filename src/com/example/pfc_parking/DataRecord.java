package com.example.pfc_parking;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class DataRecord extends ActionBarActivity {
	String valor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data_record);
		
		TextView mytext = (TextView) findViewById(R.id.tvView3);
		Intent intent = getIntent();
		valor = intent.getStringExtra("Name");
		mytext.setText(valor+", here's your list of activities.");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.data_record, menu);
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
