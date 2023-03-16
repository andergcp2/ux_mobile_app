package com.schoolarm.mobile_app;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;



	public class edit_time_activity extends Activity {

	
	private View _bg__edit_time_ek2;
	private TextView label_text_ek23;
	private TextView label_text_ek24;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_time);

		
		_bg__edit_time_ek2 = (View) findViewById(R.id._bg__edit_time_ek2);
		label_text_ek23 = (TextView) findViewById(R.id.label_text_ek23);
		label_text_ek24 = (TextView) findViewById(R.id.label_text_ek24);
	}
}
	
	