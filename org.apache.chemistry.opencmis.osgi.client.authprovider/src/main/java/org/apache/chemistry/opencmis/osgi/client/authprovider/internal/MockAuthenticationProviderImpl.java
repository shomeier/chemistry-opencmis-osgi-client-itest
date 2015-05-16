/**
 *
 */
package org.apache.chemistry.opencmis.osgi.client.authprovider.internal;

import java.util.List;
import java.util.Map;

import javax.xml.ws.handler.HandlerResolver;

import org.apache.chemistry.opencmis.client.bindings.spi.StandardAuthenticationProvider;
import org.w3c.dom.Element;

/**
 * @author SHomeier
 */
public class MockAuthenticationProviderImpl extends StandardAuthenticationProvider
{
	protected void activate()
	{
		System.out.println("Activated MockAuthenticationProviderImpl!");

	}

	public Map<String, List<String>> getHTTPHeaders(String url)
	{
		System.out.println("Mock AuthProvider getHTTPHeaders");
		return super.getHTTPHeaders(url);
	}

	public Element getSOAPHeaders(Object portObject)
	{
		System.out.println("Mock AuthProvider getSOAPHeaders");
		return super.getSOAPHeaders(portObject);
	}

	public HandlerResolver getHandlerResolver()
	{
		System.out.println("Mock AuthProvider getHandlerResolver");
		return super.getHandlerResolver();
	}

	public void putResponseHeaders(String url, int statusCode, Map<String, List<String>> headers)
	{
		System.out.println("Mock AuthProvider putResponseHeaders");
	}
}
