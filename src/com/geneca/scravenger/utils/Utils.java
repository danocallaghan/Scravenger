package com.geneca.scravenger.utils;

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * Standard Utilities class. Add any utility methods here as needed.
 * 
 * @author Daniel.Hill
 *
 */
public class Utils {
	/**
	 * Helper method to open an input stream to an file in the assets directory
	 * from the filename and current android context
	 * @param context Context of the current Android UI (Activity, Service, etc)
	 * @param assetName String - unqualified file name, (ie "mockHunt.xml" not "assets/mockHunt.xml")
	 * @return
	 * @throws IOException Throws IOException if file isn't found/cannot be opened
	 */
	public static InputStream getInputStreamOfAsset(Context context, String assetName) throws IOException {
		AssetManager am = context.getAssets();
		return am.open(assetName);
	}
}
