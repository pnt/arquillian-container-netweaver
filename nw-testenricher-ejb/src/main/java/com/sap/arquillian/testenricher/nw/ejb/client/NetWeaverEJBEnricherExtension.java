package main.java.com.sap.arquillian.testenricher.nw.ejb.client;

import main.java.com.sap.arquillian.testenricher.nw.ejb.NetWeaverEJBInjectionEnricher;

import org.jboss.arquillian.container.test.spi.client.deployment.AuxiliaryArchiveAppender;
import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.arquillian.test.spi.TestEnricher;

public class NetWeaverEJBEnricherExtension implements LoadableExtension {

	@Override
	public void register(ExtensionBuilder builder) {
		builder.service(AuxiliaryArchiveAppender.class, NetWeaverEJBEnricherArchiveAppender.class);
	      
	      // only load if EJB is on ClassPath
	      if(Validate.classExists("javax.ejb.EJB"))
	      {
	         builder.service(TestEnricher.class, NetWeaverEJBInjectionEnricher.class);         
	      }
		
	}

}
