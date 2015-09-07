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

public class Match extends Activity implements OnItemSelectedListener 
{

String s[]={"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra","Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};
Spinner sp1,sp2;
TextView sign,comp;
String sTv="";
int p1,p2,c,a=1,b=1;
int m100[]={51,15,19,91,28,82,26,62,210,102,37,73,311,113,35,53,410,104,48,84,412,124,59,95,610,106,17,71,711,117,86,68,812,128,34,43,14,41,45,54};
int m0[]={112,121,13,31,16,61,14,41,21,12,29,92,24,42,32,23,312,123,49,94,510,105,512,125,67,76,611, 116,78,87,81,18,89,98,910,109};	
String per[]={"Perfect Match \nCompatabilty meter: 100%",
		"Can be a nice couple \nCompatabilty meter: 50%",
		"Total Mismatch \nCompatabilty meter: 0%"};

private StartAppAd startAppAd = new StartAppAd(this);
@Override
public void onPause() {
super.onPause();
}

protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.match);
		
		StartAppSearch.showSearchBox(this);//search box add
		intialise();
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(Match.this,android.R.layout.simple_spinner_item,s);
		sp1.setAdapter(adapter);
		sp1.setOnItemSelectedListener(this);
		sp2.setAdapter(adapter);
		sp2.setOnItemSelectedListener(this);
		
	}
	private void intialise() {
		// TODO Auto-generated method stub
		sp1=(Spinner)findViewById(R.id.spM1);
		sp2=(Spinner)findViewById(R.id.spM2);
		sign=(TextView)findViewById(R.id.tvTT);
		comp=(TextView)findViewById(R.id.tvCC);
		
	}
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.spM1:
			p1=sp1.getSelectedItemPosition();
			a=p1+1;
			break;
			case R.id.spM2:
			p2=sp2.getSelectedItemPosition();
			b=p2+1;
			break;
		}
		sTv=s[a-1]+"-"+s[b-1];
		sign.setText(sTv);
		
		if((b)>9)
			c=(a*100)+(b);
		else
			c=((a)*10)+(b);
		comp.setText(""+c);
		compatibilty(c);

	}
	private void compatibilty(int c2) {
		// TODO Auto-generated method stub
		int flag=1,i;
		for(i=0;i<m100.length;i++)
		{
			if(c2==m100[i])
			{
				flag=0;
			}
		}
		if( flag==1)
			for(i=0;i<m0.length;i++)
			{
				if(c2==m0[i])
				{
					flag=2;
				}
			}	
		comp.setText(per[flag]);
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
			String value="Matchmaking is the process of matching two people together, usually for the purpose of marriage" +
				"\nWe bring a simple sun sign match app for u all based on views of some famous astrologers we fed data to compare sun signs of you and your partner, so just enter sun signs to check your compatibility with your mate.";
			Data.putString("say", value);
			Intent start=new Intent(Match.this,About.class);
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