package com.sap.arquillian.testenricher.nw.ejb.container;

import org.jboss.arquillian.container.test.spi.RemoteLoadableExtension;
import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.arquillian.test.spi.TestEnricher;
import org.jboss.arquillian.testenricher.ejb.EJBInjectionEnricher;

import com.sap.arquillian.testenricher.nw.ejb.NetWeaverEJBInjectionEnricher;
import com.sap.arquillian.testenricher.nw.ejb.client.NetWeaverEJBEnricherArchiveAppender;

public class NetWeaverEJBEnricherRemoteExtension implements
		RemoteLoadableExtension {

	@Override
	public void register(ExtensionBuilder builder) {
		builder.service(AuxiliaryArchiveAppender.class,
				NetWeaverEJBEnricherArchiveAppender.class);

		// only load if EJB is on ClassPath
		if (Validate.classExists("javax.ejb.EJB")) {
			builder.override(TestEnricher.class, EJBInjectionEnricher.class,
					NetWeaverEJBInjectionEnricher.class);
		}
	}

}
