package com.geneca.scravenger.models;

import java.util.Date;

public class Player {
	private String _FirstName;
	private String _LastName;
	private String _NickName;
	private Integer _ID;
	
	public String get_FirstName() {
		return _FirstName;
	}
	public void set_FirstName(String _FirstName) {
		this._FirstName = _FirstName;
	}
	public String get_LastName() {
		return _LastName;
	}
	public void set_LastName(String _LastName) {
		this._LastName = _LastName;
	}
	public String get_NickName() {
		return _NickName;
	}
	public void set_NickName(String _NickName) {
		this._NickName = _NickName;
	}
	public Integer get_ID() {
		return _ID;
	}
	public void set_ID(Integer _ID) {
		this._ID = _ID;
	}
	
}
