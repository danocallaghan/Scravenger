package com.geneca.scravenger.models;

import java.util.Date;

public class Hunt {
	private String _City;
	private String _State;
	private String _Name;
	private Date _StartTime;
	private Date _EndTime;
	
	
	public void setCity(String City){ _City = City;}
	public String getCity(){return _City;}
	public void setState(String State){	_State = State;	}
	public String getState(){return _State;	}
	public void setName(String Name){ _Name = Name;	}
	public String getName(){return _Name;}
	public void setStartTime(Date StartTime){_StartTime = StartTime;}
	public Date getStartTime(){return _StartTime;}
	public void setEndTime(Date EndTime){_EndTime = EndTime;}
	public Date getEndTime(){return _EndTime;}

}
