package com.akibb.numastropro;

import com.akibb.numastropro.R;
import com.searchboxsdk.android.StartAppSearch;
import com.startapp.android.publish.StartAppAd;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Perdict  extends Activity{
	
	String p[]={" 1 \n Lucky months= jan, march, july, august, sept, oct, dec \n" +
			"Lucky Day = Sun,WED,THU Lucky Days= 1 3 5 7 10 11 12 14 16 19 21 23 25 28 30 \n" +
			"Lucky color= pink orange light brown golden yellow \n" +
			"Unlucky color= blue black  dark red Stone= amber pukhraj in golden ring \n " +
			"Ruling body= SUN Personality = Like to do look good always stress on it. \n " +
			"Decorating the surrounding is also habbit. Friendly people. In short party people.\n",
 
"2: \n" +
"Lucky months= feb april june sept nov \n" +
"Lucky Day = mon tues fri \n" +
"Lucky Days= 2 4 6 9 11 13 15 18 20 22 24 26 29 31 \n" +
"Lucky color= green yellow light blue \n" +
"Unlucky color= black red blue \n" +
"Stone= Pearl diamond in silver ring \n" +
"Ruling body= MOON \n" +
"Personality = Simple, quite ,serious people. They Speak less specific n live simple life life with less harsh decisions in life for others.",

" 3:" +
"\n Lucky months= march,may, july, sept, oct, dec" +
"\n Lucky Day = Sun tue wed thu" +
"\nLucky Days= 1 3 5 7 9 10 11 12 14 18 21 23 25 27 30" +
"\nLucky color= yellow green pink" +
"\nUnlucky color= blue black" +
"\nStone= pukhraj in golden ring" +
"\nRuling body= JUPITER" +
"\nPersonality = They are goal achieving people once goal set do anything to achieve it, serious n like loneliness in life.",

"4:" +
"\nLucky months= feb april june aug sept nov" +
"\nLucky Day = mon tue fri" +
"\nLucky Days= 2 4 6 8 9 13 17 20 22 24 26 27 29 31" +
"\nLucky color= blue red grey" +
"\nUnlucky color=black" +
"\nStone=pearl diamond coral  in silver ring" +
"\nRuling body= URANUS" +
"\nPersonality = Greedy people like money n its sources want to collect as much as possible. In short born to earn money generally has very less friends.",	
	
"5:" +
"\nLucky months= jan, march,may, july, august, sept,oct, dec" +
"\nLucky Day = Sun,WED,sat" +
"\nLucky Days= 1 3 5 7 10 11 12 14 16 19 21 23 25 28 30" +
"\nLucky color= white green yellow brown" +
"\nUnlucky color= red" +
"\nStone= diamond Neelam in golden/platinum ring" +
"\nRuling body= MERCURY" +
"\nPersonality = Thoughtful happy with good sense of humour have huge friend circle very good thinkable mind can achieve anything using it.",
	
"6:" +
"\nLucky months= feb april june sept nov" +
"\nLucky Day = mon tue fri" +
"\nLucky Days= 2 4 6 9 15 18 20 22 24 26 27 29 31" +
"\nLucky color= pink  light blue white brown" +
"\nUnlucky color= blue black red voilet" +
"\nStone= diamond pearl panna  in silver ring" +
"\nRuling body= VENUS" +
"\nPersonality = Hardworking, simple, quite, sensitive like to donate as per possibility. They live a simple n happy life.",
	
"7:\nLucky months= jan, march,may, july, august, sept, oct, dec" +
"\nLucky Day = sun mon wed thu" +
"\nLucky Days= 1 3 5 7 8 9 10 14 16 17 18 19 21 22 23 25 26 27 28 30" +
"\nLucky color= yellow green white pink" +
"\nUnlucky color= dark black   dark red  black" +
"\nStone= pearl  pukhraj in golden ring" +
"\nRuling body= NEPTUNE" +
"\nPersonality = Shy , quite people when angry they really be bad but generally calm like to support others.",

"8:" +
"\nLucky months= jan, march, july, august, sept, oct, dec" +
"\nLucky Day = wed thu sat" +
"\nLucky Days= 1 3 5 7 8 12 13 14 16 17 21 22 23 25 26 30 31" +
"\nLucky color= green black blue brown voilet" +
"\nUnlucky color= red white pink" +
"\nStone= neelam diamond in golden ring" +
"\nPersonality = Competative hardworking life face lots of problem but never loss emotionally try to succed." +
"\nRuling body= SATURN",
	
"9:" +
"\nLucky months= feb mar april june july sept nov dec" +
"\nLucky Day = mon tue thu fri" +
"\nLucky Days= 1 2 3 4 6 7 9 11 12 13 15 20 22 23 25 26 27 28 30 31" +
"\nLucky color= pink red white yellow" +
"\nUnlucky color= black green" +
"\nStone= pukhraj in golden ring or pearl in silver ring" +
"\nRuling body= MARS" +
"\nPersonality = Like to give n take gifts, good orators good at their work no enemy can defeat them hardworking."
};

	TextView tvQ;
	private StartAppAd startAppAd = new StartAppAd(this);
	@Override
	public void onPause() {
	super.onPause();
	//finish();
	}
	
	
	
@Override
	protected void onCreate(Bundle savedInstanceState)
   {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perdict);
		
		StartAppSearch.showSearchBox(this);//search box add
		
		tvQ=(TextView)findViewById(R.id.tvQ);
		
		Bundle getData=getIntent().getExtras();
		  int getBread=getData.getInt("key_data");
		  tvQ.setText(p[getBread]);
	}
	
	

}
