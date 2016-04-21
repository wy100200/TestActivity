package com.example.testactivity;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class DActivity extends ActionBarActivity {
	private TextView turnToNextAc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_4);
		turnToNextAc = (TextView) findViewById(R.id.nextAc);
		turnToNextAc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(DActivity.this, AActivity.class);
				startActivity(it);
			}
		});
	}
	
}
