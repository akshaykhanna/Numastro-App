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

public class AboutUs  extends Activity 
{
	
    
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.developers);
		
		
		
	}
	
	@Override
	public void onPause() {
	super.onPause();
	finish();
	}
}
 

