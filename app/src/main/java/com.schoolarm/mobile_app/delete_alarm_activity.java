package com.schoolarm.mobile_app;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;

import com.schoolarm.mobile_app.R;

	public class delete_alarm_activity extends Activity {

	
	private View _bg__delete_alarm_ek2;
	private TextView subtitulo1_ek34;
	private TextView label_text_ek33;
	private TextView label_text_ek34;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.delete_alarm);

		
		_bg__delete_alarm_ek2 = (View) findViewById(R.id._bg__delete_alarm_ek2);
		subtitulo1_ek34 = (TextView) findViewById(R.id.subtitulo1_ek34);
		label_text_ek33 = (TextView) findViewById(R.id.label_text_ek33);
		label_text_ek34 = (TextView) findViewById(R.id.label_text_ek34);
	
		
		//custom code goes here
	
	}
}
	
	