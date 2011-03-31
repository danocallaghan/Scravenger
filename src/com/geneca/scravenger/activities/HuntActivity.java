package com.geneca.scravenger.activities;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.geneca.scravenger.R;
import com.geneca.scravenger.models.Hunt;
import com.geneca.scravenger.utils.SerialUtils;
import com.geneca.scravenger.utils.Utils;

public class HuntActivity extends Activity {
	private static final String TAG = "HuntActivity";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		InputStream inputStream;
		try {
			inputStream = Utils.getInputStreamOfAsset(this, "mockHunt.xml");
			Hunt h = SerialUtils.deserialize(Hunt.class, inputStream);
			Log.d(TAG, "Hunt name = " + h.getName());
		} catch (IOException e) {
			Log.e(TAG, "Exception opening asset!", e);
		}
	}
}