package com.drewsonne.cloudformationjenkins;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.cloudformation.AmazonCloudFormation;
import com.amazonaws.services.cloudformation.AmazonCloudFormationClient;
import com.amazonaws.services.cloudformation.model.Capability;


public class CloudformationStack {
	
	protected AmazonCloudFormation stackbuilder;
	
	public CloudformationStack(AWSCredentials credentials) {
		stackbuilder = new AmazonCloudFormationClient(credentials);
	}
	
	public String name;
	
	public boolean exists() {
		return true;
	}

	public boolean isProcessing() {
		return true;
	}
	
	public boolean notInProgress() {
		return true;
	}
	
	public boolean create(String template_body, Capability capability) {
		return false;
	}
	
	public boolean update(String template_body, Capability[] capability) {
		return false;
	}

	public void reload() {
		// TODO Auto-generated method stub
		
	}

	public String status() {
		// TODO Auto-generated method stub
		return "";
	}

}
