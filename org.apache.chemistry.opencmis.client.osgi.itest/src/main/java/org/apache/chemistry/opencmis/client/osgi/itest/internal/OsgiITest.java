/**
 *
 */
package org.apache.chemistry.opencmis.client.osgi.itest.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.chemistry.opencmis.client.api.Repository;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.enums.BindingType;

/**
 * @author SHomeier
 */
public class OsgiITest
{
	private SessionFactory sessionFactory;

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
		final Map<String, String> connectionParams = createConnectionParams();
		// Session session = this.sessionFactory.createSession(connectionParams);
		List<Repository> repositories = this.sessionFactory.getRepositories(connectionParams);

		for (Repository repository : repositories)
		{
			System.out.println("ID : " + repository.getId());
		}

		new Thread(new Runnable()
		{

			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				for (int i = 0; i < 25; i++)
				{
					Session createSession = sessionFactory.createSession(connectionParams);
					try
					{
						Thread.sleep(5000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	private Map<String, String> createConnectionParams()
	{
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put(SessionParameter.USER, "admin");
		parameters.put(SessionParameter.PASSWORD, "admin");
		parameters.put(SessionParameter.ATOMPUB_URL, "http://cmis.alfresco.com/cmisatom");
		parameters.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
		parameters.put(SessionParameter.REPOSITORY_ID, "e38e1925-6ef0-4871-aacd-284bc72c2a30");
		parameters.put(SessionParameter.AUTHENTICATION_PROVIDER_CLASS,
			"org.apache.chemistry.opencmis.osgi.client.authprovider.internal.MockAuthenticationProviderImpl");
		parameters.put(SessionParameter.OBJECT_FACTORY_CLASS,
			"org.apache.chemistry.opencmis.osgi.client.objectfactory.internal.MockObjectFactoryImpl");

		// if you want to explicit connect to a known repository then use
		// SessionParameter.REPOSITORY_ID
		// parameters.put(SessionParameter.REPOSITORY_ID, "repository_id_here");

		return parameters;
	}
}
