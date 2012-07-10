package main.java.com.sap.arquillian.testenricher.nw.ejb;

import java.text.MessageFormat;
import java.util.Properties;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;

import main.java.com.sap.arquillian.container.nw.remote.NetWeaverRemoteConfiguration;

import org.jboss.arquillian.core.spi.Validate;
import org.jboss.arquillian.test.spi.TestEnricher;
import org.jboss.arquillian.testenricher.ejb.EJBInjectionEnricher;

public class NetWeaverEJBInjectionEnricher extends EJBInjectionEnricher {

	private static final NetWeaverRemoteConfiguration config = new NetWeaverRemoteConfiguration();

	private static final Logger log = Logger.getLogger(TestEnricher.class
			.getName());

	@Override
	protected String[] resolveJNDINames(Class<?> fieldType, String mappedName,
			String beanName) {
		MessageFormat msg = new MessageFormat(
				"Trying to resolve JNDI name for field \"{0}\" with mappedName=\"{1}\" and beanName=\"{2}\"");
		log.finer(msg.format(new Object[] { fieldType, mappedName, beanName }));

		Validate.notNull(fieldType, "EJB enriched field cannot to be null.");

		boolean isMappedNameSet = hasValue(mappedName);
		boolean isBeanNameSet = hasValue(beanName);

		if (isMappedNameSet && isBeanNameSet) {
			throw new IllegalStateException(
					"@EJB annotation attributes 'mappedName' and 'beanName' cannot be specified at the same time.");
		}

		String[] jndiNames;

		// If set, use only mapped name or bean name to lookup the EJB.
		if (isMappedNameSet) {
			jndiNames = new String[] { mappedName };
		} else if (isBeanNameSet) {
			jndiNames = new String[] {
					"ejb:/appName=JavaEE/FirstTest, jarName=FirstTest.jar, beanName=InfoProvider, interfaceName=com.sap.nw.arquillian.testapp.InfoProviderLocal",
					"ejb:/beanName=" + beanName + ", interfaceName="
							+ "com.sap.nw.arquillian.testapp." + beanName
							+ "Local", "ejb:/beanName=" + beanName };
		} else {
			// TODO: These names are not spec compliant; fieldType needs to be a
			// bean type here, but usually is just an interface of a bean. These
			// seldom work.
			// Kristiyan: All hope is lost ...
			jndiNames = new String[] {
					"java:global/test.ear/test/" + fieldType.getSimpleName()
							+ "Bean",
					"java:global/test.ear/test/" + fieldType.getSimpleName(),
					"java:global/test/" + fieldType.getSimpleName(),
					"java:global/test/" + fieldType.getSimpleName() + "Bean",
					"java:global/test/" + fieldType.getSimpleName()
							+ "/no-interface",
					"test/" + fieldType.getSimpleName() + "Bean/local",
					"test/" + fieldType.getSimpleName() + "Bean/remote",
					"test/" + fieldType.getSimpleName() + "/no-interface",
					fieldType.getSimpleName() + "Bean/local",
					fieldType.getSimpleName() + "Bean/remote",
					fieldType.getSimpleName() + "/no-interface",
					// WebSphere Application Server Local EJB default binding
					"ejblocal:" + fieldType.getCanonicalName(),
					// WebSphere Application Server Remote EJB default binding
					fieldType.getCanonicalName() };
		}
		return jndiNames;
	}

	@Override
	protected Context createContext() throws Exception {
		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY,
				"com.sap.engine.services.jndi.InitialContextFactoryImpl");
		props.put(Context.PROVIDER_URL, config.getBindAddress() + ":50004");
		props.put(Context.SECURITY_PRINCIPAL, config.getUser());
		props.put(Context.SECURITY_CREDENTIALS, config.getPass());
		props.put(Context.URL_PKG_PREFIXES, "com.sap.engine.services");

		InitialContext ctx = new InitialContext(props);

		return ctx;
	};

	private boolean hasValue(String string) {
		if (string != null && (!string.trim().equals(""))) {
			return true;
		} else {
			return false;
		}
	}
}
