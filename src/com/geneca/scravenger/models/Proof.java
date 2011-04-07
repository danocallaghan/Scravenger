package com.geneca.scravenger.models;

public abstract class Proof extends BaseModel{
    
    private Leg leg;
    private boolean isValid;
    
	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Leg getLeg() {
		return leg;
	}
	
	public abstract Proof GetProof();

	public static boolean SubmitProof(Proof proof)
    {
    	//Send the proof to the cloud (REST API)
    	
    	//return false for now
		return false;
    	
    }

	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean getIsValid() {
		return isValid;
	}

}
