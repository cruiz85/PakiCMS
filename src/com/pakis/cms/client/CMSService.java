package com.pakis.cms.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.ArrayList;

import com.pakis.cms.shared.Paki;

@RemoteServiceRelativePath("contactsService")
public interface CMSService extends RemoteService {

	public Paki savePaki(Paki paki);
	
	public ArrayList<Paki> getAllPakis();
}
