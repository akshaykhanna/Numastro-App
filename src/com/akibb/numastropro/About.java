package com.akibb.numastropro;

import com.akibb.numastropro.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class About extends Activity 
{
	TextView tvQ;
    
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
tvQ=(TextView)findViewById(R.id.tvArec);
		
		Bundle getData=getIntent().getExtras();
		  String getBread=getData.getString("say");
		  tvQ.setText(getBread);
		
	}
	@Override
	public void onPause() {
	super.onPause();
	finish();
	}
	
}
