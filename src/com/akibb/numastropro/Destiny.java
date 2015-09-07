package com.akibb.numastropro;





import com.akibb.numastropro.R;
import com.searchboxsdk.android.StartAppSearch;
import com.startapp.android.publish.StartAppAd;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Destiny extends Activity implements OnClickListener {

	EditText d,m,y;
	Button sub;
	int n=-1,mi=0;
	private StartAppAd startAppAd = new StartAppAd(this);
	@Override
	public void onPause() {
	super.onPause();
	
	}
	
	@Override
	public void onResume(){
	super.onResume();
	startAppAd.onResume();
	}
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.destiny);
		
		StartAppSearch.showSearchBox(this);//search box add
		
		intialise();
		
		sub.setOnClickListener(this);
	}

	private void oneDigit() {
		// TODO Auto-generated method stub
		
		
	}

	private void intialise() {
		// TODO Auto-generated method stub
		d=(EditText)findViewById(R.id.etDay);
		m=(EditText)findViewById(R.id.etMonth);
		y=(EditText)findViewById(R.id.etYear);
		sub=(Button)findViewById(R.id.bSub);
	
		
	}

	

	@Override
	public void onClick(View arg0)
	{
		// TODO Auto-generated method stub
        String nn=d.getText().toString();
		String month=m.getText().toString();
		
		try {
		    n= Integer.parseInt(nn);
		 mi=Integer.parseInt(month);
		} catch(NumberFormatException nfe) {
		  // Handle parse error.
		}
		if(n>0 && n<=31 && mi>0 && mi<=12 && d.length()>0 && m.length()>0 && y.length()>3)
		{
	    while(n>9)
	    {
	    	n=(n/10)+(n%10);
	    }
		Bundle sendData=new Bundle();
		sendData.putInt("key_data", (n-1));
		Intent startOC=new Intent(Destiny.this,Perdict.class);
		startOC.putExtras(sendData);
		startActivity(startOC);
		}
		else
		{
			Context context = getApplicationContext();
			Toast toast=Toast.makeText(context, "Please enter your valid date of birth ",1000);
			toast.show();
		}
	}
	
	@Override
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
			String value="Numerology was brought forward by Kiro a person who get this knowledge by a tribe during one of his voyage he used n tested it in his life n introduced it to the rest of the world" +
					"Monolank: 23/03/2013 = 2+3 = 6" +
					"This app takes Date of birth as input n provide all numro facts to user as per his DOB." +
					"Be the lucky no.,days,months,color n many other things.";
			Data.putString("say", value);
			Intent start=new Intent(Destiny.this,About.class);
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
