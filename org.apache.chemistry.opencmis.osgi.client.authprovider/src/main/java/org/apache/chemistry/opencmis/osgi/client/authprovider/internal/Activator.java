package org.apache.chemistry.opencmis.osgi.client.authprovider.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{
	@Override
	public void start(BundleContext context) throws Exception
	{
		System.out.println("Starting Mock Authentication Provider Bundle ...");

		// fake some initialization process ...
		Thread.sleep(1000);

		System.out.println("Started Mock Authentication Provider Bundle!");
	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		System.out.println("Stopping Mock Authentication Provider Bundle ...");
	}
}
