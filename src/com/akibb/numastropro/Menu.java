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
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity implements OnClickListener 
{
   
	private StartAppAd startAppAd = new StartAppAd(this);
	@Override
	public void onResume(){
	super.onResume();
	startAppAd.onResume();
	}
	@Override
	public void onBackPressed() {
	startAppAd.onBackPressed();
	super.onBackPressed();
	}
	@Override
	public void onPause() {
	super.onPause();
	startAppAd.onPause();
	}
	Button des,mac,col,exit;
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);// Setting of menu layout
		
		StartAppSearch.showSearchBox(this);//search box add
		
		intialise(); // intialise the buttton
		des.setOnClickListener(this);
		mac.setOnClickListener(this);
		col.setOnClickListener(this);
		exit.setOnClickListener(this);
		
	}
	
	private void intialise() 
	{
		// TODO Auto-generated method stub
		des=(Button)findViewById(R.id.bDes); //linking button with layouts via there id's
		mac=(Button)findViewById(R.id.bMac);
		col=(Button)findViewById(R.id.bCol);
		exit=(Button)findViewById(R.id.bE);
	}

	@Override
	public void onClick(View i) {
		// TODO Auto-generated method stub
		switch(i.getId()) // Activation of respective button using switch case
		{
		case R.id.bDes:
			startAppAd.showAd(); // show the ad
			startAppAd.loadAd(); // load the next ad
			Intent sta2= new Intent("com.akibb.numastropro.DESTINY");
			startActivity(sta2);
			break;
		case R.id.bCol:
			startAppAd.showAd(); // show the ad
			startAppAd.loadAd(); // load the next ad
			Intent sta1= new Intent("com.akibb.numastropro.COLOR");
			startActivity(sta1);
			break;
		case R.id.bMac:
			startAppAd.showAd(); // show the ad
			startAppAd.loadAd(); // load the next ad
			Intent sta3= new Intent("com.akibb.numastropro.MATCH");
			startActivity(sta3);
			break;
		case R.id.bE:
			startAppAd.showAd(); // show the ad
			startAppAd.loadAd(); // load the next ad
			finish();
			break;
		
		}
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu)

	{
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater capactiveButtonMenu=getMenuInflater();
	    capactiveButtonMenu.inflate(R.menu.main_menu, menu);
	    return true;
	    
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		
		
		case R.id.credits:
			Intent aboutus=new Intent("com.akibb.numastropro.ABOUTUS");
			startActivity(aboutus);
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

