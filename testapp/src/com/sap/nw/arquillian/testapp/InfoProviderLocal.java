package com.sap.nw.arquillian.testapp;

import javax.ejb.Local;

@Local
public interface InfoProviderLocal {
	public String getInfo();
}
