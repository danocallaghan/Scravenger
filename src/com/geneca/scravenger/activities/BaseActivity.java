package com.geneca.scravenger.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {
	private static final String TAG = "BaseActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, this.getClass().getSimpleName() + "'s onCreate() reached");
		super.onCreate(savedInstanceState);		
	}	
	
	@Override
	protected void onPause() {
		Log.d(TAG, this.getClass().getSimpleName() + "'s onPause() reached");
		super.onPause();
	}
	
	@Override
	protected void onResume() {
		Log.d(TAG, this.getClass().getSimpleName() + "'s onResume() reached");
		super.onResume();
	}
}
