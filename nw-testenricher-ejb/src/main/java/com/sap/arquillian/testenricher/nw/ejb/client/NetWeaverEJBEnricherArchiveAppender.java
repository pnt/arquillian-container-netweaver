package main.java.com.sap.arquillian.testenricher.nw.ejb.client;

import main.java.com.sap.arquillian.testenricher.nw.ejb.NetWeaverEJBInjectionEnricher;
import main.java.com.sap.arquillian.testenricher.nw.ejb.container.NetWeaverEJBEnricherRemoteExtension;

import org.jboss.arquillian.container.test.spi.RemoteLoadableExtension;
import org.jboss.arquillian.container.test.spi.client.deployment.CachedAuxilliaryArchiveAppender;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;

public class NetWeaverEJBEnricherArchiveAppender extends
		CachedAuxilliaryArchiveAppender {

	@Override
	protected Archive<?> buildArchive() {
		{
			return ShrinkWrap
					.create(JavaArchive.class,
							"arquillian-testenricher-nw-ejb.jar")
					.addPackage(NetWeaverEJBInjectionEnricher.class.getPackage())
					.addClass(NetWeaverEJBEnricherRemoteExtension.class)
					.addAsServiceProvider(RemoteLoadableExtension.class,
							NetWeaverEJBEnricherRemoteExtension.class);
		}
	}

}
