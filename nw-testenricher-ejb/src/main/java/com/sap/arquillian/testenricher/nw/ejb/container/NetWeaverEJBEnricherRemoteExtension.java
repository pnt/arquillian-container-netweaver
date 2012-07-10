package main.java.com.sap.arquillian.testenricher.nw.ejb.container;

import main.java.com.sap.arquillian.testenricher.nw.ejb.NetWeaverEJBInjectionEnricher;

import org.jboss.arquillian.container.test.spi.RemoteLoadableExtension;
import org.jboss.arquillian.test.spi.TestEnricher;

public class NetWeaverEJBEnricherRemoteExtension implements
		RemoteLoadableExtension {

	@Override
	public void register(ExtensionBuilder builder) {
		// only load if EJB is on ClassPath
		if (Validate.classExists("javax.ejb.EJB")) {
			builder.service(TestEnricher.class, NetWeaverEJBInjectionEnricher.class);
		}
	}

}
