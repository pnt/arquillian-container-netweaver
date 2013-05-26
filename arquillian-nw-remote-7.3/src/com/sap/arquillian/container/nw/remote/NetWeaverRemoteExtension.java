package com.sap.arquillian.container.nw.remote;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.core.spi.LoadableExtension;

public class NetWeaverRemoteExtension implements LoadableExtension {

	@Override
	public void register(ExtensionBuilder builder) {
		builder.service(DeployableContainer.class,
				NetWeaverRemoteContainer.class);
	}

}
