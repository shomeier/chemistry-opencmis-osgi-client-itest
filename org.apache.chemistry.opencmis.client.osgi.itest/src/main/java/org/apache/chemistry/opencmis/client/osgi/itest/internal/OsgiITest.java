package org.apache.chemistry.opencmis.client.osgi.itest.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.chemistry.opencmis.client.api.Repository;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.data.RepositoryInfo;
import org.apache.chemistry.opencmis.commons.enums.BindingType;

public class OsgiITest extends Thread
{
	private SessionFactory sessionFactory;

	Map<String, String> connectionParams;

	protected void bindSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
		System.out.println("Bound SessionFactory");
	}

	protected void unbindSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = null;
	}

	protected void activate()
	{
		System.out.println("Activating OsgiITest ...");
		this.connectionParams = createConnectionParams();
		List<Repository> repositories = this.sessionFactory.getRepositories(connectionParams);

		for (Repository repository : repositories)
		{
			System.out.println("ID : " + repository.getId());
		}

		start();
	}

	protected void deactivate()
	{
		System.out.println("DEACTIVATING OSGiITest...");
		this.interrupt();
	}

	public void run()
	{
		// repeat the following testing steps 25 times with a sleep
		// this gives you time to do some testing on console (uninstall/stop/start bundles)
		try
		{
			for (int i = 0; i < 25; i++)
			{
				// create a session via SessionFactory OSGi Service
				Session session = sessionFactory.createSession(connectionParams);
				// get the repository info 10 times with a pause of 1 second for each call
				for (int j = 0; j < 10; j++)
				{
					RepositoryInfo repositoryInfo = session.getRepositoryInfo();
					System.out.println("-> " + repositoryInfo.getDescription());
					Thread.sleep(1000);
				}
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Interrupted!!");
		}
	}

	private Map<String, String> createConnectionParams()
	{
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(SessionParameter.USER, "admin");
		parameters.put(SessionParameter.PASSWORD, "admin");
		parameters.put(SessionParameter.ATOMPUB_URL, "http://cmis.alfresco.com/cmisatom");
		parameters.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
		parameters.put(SessionParameter.REPOSITORY_ID, "45c8a9e9-ae77-474c-ab9e-8d425896d8c1");

		// provide our mock authentication provider and object factory class names
		// parameters.put(SessionParameter.AUTHENTICATION_PROVIDER_CLASS,
		// "org.apache.chemistry.opencmis.client.osgi.authprovider.internal.MockAuthenticationProviderImpl");
		// parameters.put(SessionParameter.OBJECT_FACTORY_CLASS,
		// "org.apache.chemistry.opencmis.client.osgi.objectfactory.internal.MockObjectFactoryImpl");

		parameters.put(SessionParameter.AUTHENTICATION_PROVIDER_CLASS,
			"org.apache.chemistry.opencmis.client.osgi.twoinone.Mock2n1AuthProvider");
		parameters.put(SessionParameter.OBJECT_FACTORY_CLASS,
			"org.apache.chemistry.opencmis.client.osgi.twoinone.Mock2n1ObjFactory");

		return parameters;
	}
}
