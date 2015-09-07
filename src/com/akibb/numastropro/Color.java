package com.akibb.numastropro;



import com.akibb.numastropro.R;
import com.searchboxsdk.android.StartAppSearch;
import com.startapp.android.publish.StartAppAd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Color extends Activity implements OnItemSelectedListener 
{
	
	Spinner sp1;
	String color[]={"Red","Orange","Yellow","Green","Blue","Indigo","Voilet","Black","White"};
	String value[]={"Red \nGive sensation of blood n fire it reveals passion, action, pleasure, love in life." +
			"Planet Mars is its ruling planet." +
			"Suite the ARIES & No. 1 is suitable for red loving ones." +
			"Shows power.",
"ORANGE" +
"\nBlend of aggressiveness and harmony, shows aspiration, social people & intelligence." +
"\nPlanet Mercury is its ruling planet." +
"\nSuite Gemini & No. 2 and 4 are suitable for u." +
"\nShows satisfaction.",

"YELLOW" +
"\nWorshipped as sun, shows radiativity, clarity in life, positivity, confidence n good vision." +
"\nSUN is its ruling body." +
"\nSuite LEO & No. 1 and 3 are suitable for u." +
"\nShows focus.",
	"GREEN" +
	"\nGives a fresh soothing feeling, shows love with nature, sentimentality, health n compassion." +
	"\nPlanet Venus & Earth are its ruling planets." +
	"\nSuite Libra n Taurus & No. 4 and 6 are suitable for u." +
	"\nShows acceptance.",
	"BLUE" +
	"\nFeeling of sky open minded, freedom loving, imaginative, sensitive & balance in life." +
	"\nPlanet Jupiter is its ruling planet." +
	"\nSuite Sagittarius & No. 5 is suitable for u." +
	"\nShows expansion.",
	"INDIGO" +
	"\nLike blue but deep in energy, deep emotions, strength in life, expressive & clarity in life." +
	"\nPlanet Saturn & Neptune are its ruling planet." +
	"\nSuite Capricorn n Pisces & No. 5 and 7 are suitable for u." +
	"\nShows deepness.",
	"VIOLET" +
	"\nReflects sleepy sunsets, fragility," +
	"\ndevotion, peace, high ideals in life," +
	"\nbalance & sensitivity. Planet" +
	"\nMercury is its ruling planet" +
	"\nSuite Aquarius n Cancer & No. 12" +
	"\nand 7 are suitable for u." +
	"\nShows revolution.",
	"BLACK" +
	"\nShow depth n the variations, formality, dignity, force, stability ,convention & zero tolerance." +
	"\nPlanet Saturn & Pluto is its ruling planet." +
	"\nSuite Capricorn n Scorpio & No. 2 and 4 are suitable for u." +
	"\nShows endlessness.",
	"WHITE" +
	"\nShows brilliance n peace at same time, purity, innocence, assertive , establishes clarity in life." +
	"\nPlanet Mercury & Moon are its ruling bodies." +
	"\nSuite Virgo & No. 1 and 6 are suitable for u." +
	"\nShows illuminence.",};
	TextView tv;
	int p=0;
	
	private StartAppAd startAppAd = new StartAppAd(this);
	@Override
	public void onPause() {
	super.onPause();
	}
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.color);
		StartAppSearch.showSearchBox(this);//search box add
		intialise();
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(Color.this,android.R.layout.simple_spinner_item,color);
		sp1.setAdapter(adapter);
		sp1.setOnItemSelectedListener(this);
	}
	private void intialise() 
	{
		// TODO Auto-generated method stub
		sp1=(Spinner)findViewById(R.id.spinner1);
		tv=(TextView)findViewById(R.id.tvColor);
	}
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		p=sp1.getSelectedItemPosition();
		tv.setText(value[p]);
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	public boolean onCreateOptionsMenu(android.view.Menu menu)

	{
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater capactiveButtonMenu=getMenuInflater();
	    capactiveButtonMenu.inflate(R.menu.avant_grade_menu, menu);
	    return true;
	    
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		
		case R.id.aboutapp:
			
			Bundle Data=new Bundle();
			String value="Color describe a lot about u in life, ur favourite colr tell a lot about u ur future." +
				"\nChoose a color to know more about urself n about ur favourite color may be.";
			Data.putString("say", value);
			Intent start=new Intent(Color.this,About.class);
			start.putExtras(Data);
			startActivity(start);
			break;
		
		
		
		case R.id.Exit:
			startAppAd.showAd(); // show the ad
			startAppAd.loadAd(); // load the next ad
			finish();
			break;
		}
		return false;
		
	}
}
