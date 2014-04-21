package com.example.charttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		Intent intent = new AverageTemperatureChart().execute(this);
//		startActivity(intent);
		
		LinearLayout linearLayout = (LinearLayout)findViewById(R.id.chart);
		linearLayout.addView(new AverageTemperatureChart().execute(this));
		int test=9;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		
		return true;
	}

}
