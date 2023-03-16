package com.schoolarm.mobile_app;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;



	public class edit_name_activity extends Activity {

	
	private View _bg__edit_name_ek2;
	private TextView placeholder_text_ek15;
	private TextView label_text_ek26;
	private ImageView icon_ek27;
	private TextView supporting_text_ek15;
	private TextView subtitulo1_ek32;
	private TextView label_text_ek27;
	private TextView label_text_ek28;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_name);

		
		_bg__edit_name_ek2 = (View) findViewById(R.id._bg__edit_name_ek2);
		placeholder_text_ek15 = (TextView) findViewById(R.id.placeholder_text_ek15);
		label_text_ek26 = (TextView) findViewById(R.id.label_text_ek26);
		icon_ek27 = (ImageView) findViewById(R.id.icon_ek27);
		supporting_text_ek15 = (TextView) findViewById(R.id.supporting_text_ek15);
		subtitulo1_ek32 = (TextView) findViewById(R.id.subtitulo1_ek32);
		label_text_ek27 = (TextView) findViewById(R.id.label_text_ek27);
		label_text_ek28 = (TextView) findViewById(R.id.label_text_ek28);
	}
}
	
	