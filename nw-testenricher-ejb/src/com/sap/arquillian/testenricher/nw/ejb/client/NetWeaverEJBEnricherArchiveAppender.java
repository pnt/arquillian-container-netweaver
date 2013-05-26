package com.sap.arquillian.testenricher.nw.ejb.client;

import org.jboss.arquillian.container.test.spi.RemoteLoadableExtension;
import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

import com.sap.arquillian.testenricher.nw.ejb.NetWeaverEJBInjectionEnricher;
import com.sap.arquillian.testenricher.nw.ejb.container.NetWeaverEJBEnricherRemoteExtension;

public class NetWeaverEJBEnricherArchiveAppender implements
		AuxiliaryArchiveAppender {

	@Override
	public Archive<?> createAuxiliaryArchive() {

		return ShrinkWrap
				.create(JavaArchive.class, "arquillian-testenricher-nw-ejb.jar")
				.addPackage(NetWeaverEJBInjectionEnricher.class.getPackage())
				.addClass(NetWeaverEJBEnricherExtension.class)
				.addClass(NetWeaverEJBEnricherRemoteExtension.class)
				.addAsServiceProvider(LoadableExtension.class,
						NetWeaverEJBEnricherExtension.class)
				.addAsServiceProvider(RemoteLoadableExtension.class,
						NetWeaverEJBEnricherRemoteExtension.class);
	}
}
