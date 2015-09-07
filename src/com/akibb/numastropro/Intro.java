package com.akibb.numastropro;




import com.akibb.numastropro.R;
import com.searchboxsdk.android.StartAppSearch;
import com.startapp.android.publish.StartAppAd;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;


public class Intro extends Activity 
{
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
 
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		
		StartAppAd.init(this, "108700521", "211254360");
		StartAppSearch.init(this, "108700521", "211254360");
		//PostCallManager.init(this, "108700521", "108700521");
		setContentView(R.layout.start);//Setting starting layout 
		
		Thread timer= new Thread()
		{

			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				
				try
				{
					sleep(3000);//layout will be displayed for 3sec
					
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
					
				}
				finally
				{
					
					Intent sta2= new Intent("com.akibb.numastropro.MENU");//Finally it will start menu activity
					startActivity(sta2);
					
				}
			
				
				
			}
		
		};
		timer.start();
		
		
		
		
		
	}
	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		
		
	}
	
	

}
