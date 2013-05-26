package com.sap.nw.arquillian.test;

import static org.junit.Assert.assertNotNull;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.sap.nw.arquillian.testapp.InfoProvider;
import com.sap.nw.arquillian.testapp.InfoProviderLocal;

@RunWith(Arquillian.class)
public class FirstTest {

	@EJB
	InfoProviderLocal info;

	@Deployment
	public static JavaArchive createDeployment() {
		return ShrinkWrap.create(JavaArchive.class, "FirstTest.jar")
				.addClasses(InfoProvider.class, InfoProviderLocal.class);
	}

	@Test
	public void shouldReturnString() throws Exception {
		assertNotNull(info);
		assertNotNull(info.getInfo());
	}
}
