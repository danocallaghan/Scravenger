package com.geneca.scravenger.utils;

import java.io.InputStream;

import com.geneca.scravenger.models.BaseModel;
import com.geneca.scravenger.models.Hunt;
import com.geneca.scravenger.models.Leg;
import com.geneca.scravenger.models.Player;
import com.geneca.scravenger.models.User;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Utilities for serialization and deserialization
 * @author Daniel.Hill
 *
 */
public class SerialUtils {
	private static final String TAG = "SerialUtils";
	
	private static XStream xstream;
	
	/**
	 * Inflates a model from an input stream pointing to a valid
	 * xml representation of a model.
	 * 
	 * @param inputStream InputStream of valid xml representation of a model
	 * @return BaseModel subclass inflated from the xml InputStream
	 */
	public static <T extends BaseModel> T deserialize(Class<T> type, InputStream inputStream) {
		XStream x = getXStream();
		return type.cast(x.fromXML(inputStream));
	}
	
	/**
	 * Serializes a model into an xml string representation.
	 *  
	 * @param model the model to be serialized
	 * @return String with xml representation of model
	 */
	public static String serialize(BaseModel model) {
		XStream x = getXStream();
		return x.toXML(model);
	}
	
	/**
	 * Used internally to inflate xstream objects for efficiency
	 * @return
	 */
	private static XStream getXStream() {
		// if xstream already created, return it
		if (xstream != null) return xstream;
		
		// else, create new, save and return
		xstream = new XStream(new DomDriver());
		
		// add aliases for all domain objects here! Aliases tell XStream to not use
		// fully qualified classNames in the xml ("com.geneca.scravenger.models.Hunt")
		xstream.alias(Hunt.class.getSimpleName().toLowerCase(), Hunt.class);
		xstream.alias(Leg.class.getSimpleName().toLowerCase(), Leg.class);
		xstream.alias(Player.class.getSimpleName().toLowerCase(), Player.class);
		xstream.alias(User.class.getSimpleName().toLowerCase(), User.class);
		
		return xstream;
	}

}
