package com.pakis.cms.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.util.ArrayList;
import com.pakis.cms.client.CMSService;
import com.pakis.cms.shared.Paki;

@SuppressWarnings("serial")
public class CMSServiceImpl extends RemoteServiceServlet implements CMSService {

	@Override
	public Paki savePaki(Paki paki) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Paki> getAllPakis() {
		// TODO Auto-generated method stub
		return null;
	}

}
