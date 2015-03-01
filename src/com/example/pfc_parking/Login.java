package com.example.pfc_parking;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends ActionBarActivity {

	EditText name;
	EditText pass;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		
		//El programa peta al tener esto del NAME  PASS
		name= (EditText) findViewById(R.id.userName);
		pass= (EditText) findViewById(R.id.password);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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
	
	
	public void logSession (View v){
			
		String x,y;
		String space= " ";

		x= name.getText().toString();
		y= pass.getText().toString();
			
		if( !(x.equalsIgnoreCase("")) && !(y.equalsIgnoreCase("")) ){
			
			finish();
			
		//	Intent act = new Intent(this, UserMenu.class);
			Intent intent = new Intent(getApplicationContext(), UserInformation.class);
			intent.putExtra("Name", x);
			startActivity(intent);
		//	startActivity(act);

		}
		
	}
	
	public void returnIndex(View v){

		finish();
		
		Intent act = new Intent(this, Index.class);
		 
		startActivity(act);
		
	}
	
	
}
