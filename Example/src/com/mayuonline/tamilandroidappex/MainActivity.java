package com.mayuonline.tamilandroidappex;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.mayuonline.tamilandroidunicodeutil.TamilUtil;

public class MainActivity extends Activity {
	//Declaring the TextViews
	TextView bamini;
	TextView tscii;
	TextView anjal;
	TextView tab;
	TextView tam;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Initializing TextViews
		bamini = (TextView)findViewById(R.id.textViewBamini);
		tscii = (TextView)findViewById(R.id.textViewTscii);
		anjal = (TextView)findViewById(R.id.textViewAnjal);
		tab = (TextView)findViewById(R.id.textViewTab);
		tam = (TextView)findViewById(R.id.textViewTam);
		
		// Unicode Strings
		String strBamini = "வணக்கம் பாமினி";
		String strTscii = "வணக்கம் திஸ்கி";
		String strAnjal = "வணக்கம் அஞ்சல்";
		String strTab = "வணக்கம் டாப்";
		String strTam = "வணக்கம் டாம்";
		
		// Typefaces
		Typeface tfBamini = Typeface.createFromAsset(getAssets(),"fonts/Bamini.ttf");
		Typeface tfTscii = Typeface.createFromAsset(getAssets(),"fonts/SaiVrishintscii.ttf");
		Typeface tfAnjal = Typeface.createFromAsset(getAssets(),"fonts/Murasuit.ttf");
		Typeface tfTab = Typeface.createFromAsset(getAssets(),"fonts/tabkovai.ttf");
		Typeface tfTam = Typeface.createFromAsset(getAssets(),"fonts/TAMGobi.ttf");
		
		
		// Setting Typeface to TextViews
		bamini.setTypeface(tfBamini);
		tscii.setTypeface(tfTscii);
		anjal.setTypeface(tfAnjal);
		tab.setTypeface(tfTab);
		tam.setTypeface(tfTam);
		
		// Converting String from Unicode
		String strConBamini = TamilUtil.convertToTamil(TamilUtil.BAMINI, strBamini);
		String strConTscii = TamilUtil.convertToTamil(TamilUtil.TSCII, strTscii);
		String strConAnjal = TamilUtil.convertToTamil(TamilUtil.ANJAL, strAnjal);
		String strConTab = TamilUtil.convertToTamil(TamilUtil.TAB, strTab);
		String strConTam = TamilUtil.convertToTamil(TamilUtil.TAM, strTam);
		
		// Setting converted text to TextViews
		bamini.setText(strConBamini);
		tscii.setText(strConTscii);
		anjal.setText(strConAnjal);
		tab.setText(strConTab);
		tam.setText(strConTam);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
