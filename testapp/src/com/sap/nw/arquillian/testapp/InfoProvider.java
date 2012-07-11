package com.sap.nw.arquillian.testapp;

import javax.ejb.Stateless;

@Stateless
public class InfoProvider implements InfoProviderLocal {
	public String getInfo() {
		return "Valuable info!";
	}
}
