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
		
		try {
			// Use Util method to fetch stream to mockHunt.xml, pass a valid android Context
			// (http://developer.android.com/reference/android/content/Context.html)
			// to give it access to android's assets folder
			InputStream inputStream = Utils.getInputStreamOfAsset(this, "mockHunt.xml");
			
			// Use the SerialUtils method to inflate the inputStream's xml into a hunt.
			// Pass the class you wish returned and the input stream we've already opened
			Hunt h = SerialUtils.deserialize(Hunt.class, inputStream);
			
			// just to prove it worked, log the name of the hunt. this shows up
			// in the LogCat view
			Log.d(TAG, "Hunt name = " + h.getName());
		} catch (IOException e) {
			// Here is where we catch the exception thrown by the Utils.getInputStreamOfAsset
			// method. We would normally want to do something more useful than just logging it
			// but since our activity doesn't do anything yet, we'll just log it.
			Log.e(TAG, "Exception opening asset!", e);
		}
	}
}