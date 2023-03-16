package com.schoolarm.mobile_app;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;



	public class login_activity extends Activity {

	
	private View _bg__login_ek2;
	private TextView schoolarm;
	private TextView subtitulo1;
	private TextView subtitulo1_ek1;
	private TextView placeholder_text_ek1;
	private TextView label_text_ek1;
	private ImageView icon;
	private TextView supporting_text_ek1;
	private TextView placeholder_text_ek3;
	private TextView label_text_ek3;
	private ImageView icon_ek1;
	private TextView supporting_text_ek3;
	private TextView label_text_ek4;
	private TextView label_text_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		
		_bg__login_ek2 = (View) findViewById(R.id._bg__login_ek2);
		schoolarm = (TextView) findViewById(R.id.schoolarm);
		subtitulo1 = (TextView) findViewById(R.id.subtitulo1);
		subtitulo1_ek1 = (TextView) findViewById(R.id.subtitulo1_ek1);
		placeholder_text_ek1 = (TextView) findViewById(R.id.placeholder_text_ek1);
		label_text_ek1 = (TextView) findViewById(R.id.label_text_ek1);
		icon = (ImageView) findViewById(R.id.icon);
		supporting_text_ek1 = (TextView) findViewById(R.id.supporting_text_ek1);
		placeholder_text_ek3 = (TextView) findViewById(R.id.placeholder_text_ek3);
		label_text_ek3 = (TextView) findViewById(R.id.label_text_ek3);
		icon_ek1 = (ImageView) findViewById(R.id.icon_ek1);
		supporting_text_ek3 = (TextView) findViewById(R.id.supporting_text_ek3);
		label_text_ek4 = (TextView) findViewById(R.id.label_text_ek4);
		label_text_ek5 = (TextView) findViewById(R.id.label_text_ek5);
	}
}
	
	