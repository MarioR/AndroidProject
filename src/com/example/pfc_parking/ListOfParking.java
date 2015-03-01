package com.example.pfc_parking;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListOfParking extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_of_parking);
		
        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();  

        datos.add(new Lista_entrada("Golden Sun", "Saga de juegos de rol en los cuales la alquimia es la base del mundo y los faros elementales deben ser encendidos (en la primera parte debes evitar que se enciendan) para salvar al mundo.", "GS1,GS2, GSDD"));
        datos.add(new Lista_entrada("Dragon Age", "Saga de rol de los cuales hay Dragon Age Origins, Dragon Age Awakening (expansión de primero), diferentes packs con más misiones, y el Dragon age 2, con sus packs de misiones especiales. En noviembre sale Dragon Age Inquisition.","DAO, DAA, DA2, DAI"));		
        datos.add(new Lista_entrada("Final Fantasy X", "Juego de rol en el cual los personales principales son Tidus y Yuna. Deben salvar al mundo de Sinh con la ayuda de Wakka, Lulu, Kimari, Auron y Riku.", "FFX"));
        datos.add(new Lista_entrada("Assasins Creed","Saga de juegos de rol en la que una persona, a través de una máquina llamada Animus, que observa su adn, revive hechos vividos por su antepasado, ya sea en las Cruzadas, el Renacimiento, o la Guerra de la Independencia Estadounidense, por ejemplo","AS, AS2, ASB, ASR, AS3, ASBF"));
        
        
        ListView lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new Lista_adaptador(this, R.layout.entrada, datos){
			@Override
			public void onEntrada(Object entrada, View view) {
		            TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior); 
		            texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima()); 

		            TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior); 
		            texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo()); 

		            TextView texto_inferior_entrada2 = (TextView) view.findViewById(R.id.textView_inferior2); 
		            texto_inferior_entrada2.setText(((Lista_entrada) entrada).get_textoDebajo2());
			}

		});
        
        lista.setOnItemClickListener(new OnItemClickListener() { 
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion); 

                CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo();
                Toast toast = Toast.makeText(ListOfParking.this, texto, Toast.LENGTH_LONG);
                toast.show();
            }
         });
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_of_parking, menu);
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
}
