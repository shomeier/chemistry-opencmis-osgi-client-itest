/**
 *
 */
package org.apache.chemistry.opencmis.osgi.client.objectfactory.internal;

import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.chemistry.opencmis.client.api.ChangeEvent;
import org.apache.chemistry.opencmis.client.api.ChangeEvents;
import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.ObjectFactory;
import org.apache.chemistry.opencmis.client.api.ObjectType;
import org.apache.chemistry.opencmis.client.api.OperationContext;
import org.apache.chemistry.opencmis.client.api.Policy;
import org.apache.chemistry.opencmis.client.api.Property;
import org.apache.chemistry.opencmis.client.api.QueryResult;
import org.apache.chemistry.opencmis.client.api.Rendition;
import org.apache.chemistry.opencmis.client.api.SecondaryType;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.commons.data.Ace;
import org.apache.chemistry.opencmis.commons.data.Acl;
import org.apache.chemistry.opencmis.commons.data.ContentStream;
import org.apache.chemistry.opencmis.commons.data.ObjectData;
import org.apache.chemistry.opencmis.commons.data.ObjectList;
import org.apache.chemistry.opencmis.commons.data.Properties;
import org.apache.chemistry.opencmis.commons.data.PropertyData;
import org.apache.chemistry.opencmis.commons.data.RenditionData;
import org.apache.chemistry.opencmis.commons.data.RepositoryInfo;
import org.apache.chemistry.opencmis.commons.definitions.PropertyDefinition;
import org.apache.chemistry.opencmis.commons.definitions.TypeDefinition;
import org.apache.chemistry.opencmis.commons.enums.Updatability;

/**
 * @author SHomeier
 */
public class MockObjectFactoryImpl implements ObjectFactory
{
	protected void activate()
	{
		System.out.println("Activating MockObjectFactory ...");

		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Activated MockObjectFactory!");
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertAces(java .util.List)
	 */
	@Override
	public Acl convertAces(List<Ace> arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertChangeEvent
	 * (org.apache.chemistry.opencmis.commons.data.ObjectData)
	 */
	@Override
	public ChangeEvent convertChangeEvent(ObjectData arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertChangeEvents (java.lang.String,
	 * org.apache.chemistry.opencmis.commons.data.ObjectList)
	 */
	@Override
	public ChangeEvents convertChangeEvents(String arg0, ObjectList arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertContentStream
	 * (org.apache.chemistry.opencmis.commons.data.ContentStream)
	 */
	@Override
	public ContentStream convertContentStream(ContentStream arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertObject(
	 * org.apache.chemistry.opencmis.commons.data.ObjectData, org.apache.chemistry.opencmis.client.api.OperationContext)
	 */
	@Override
	public CmisObject convertObject(ObjectData arg0, OperationContext arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertPolicies (java.util.List)
	 */
	@Override
	public List<String> convertPolicies(List<Policy> arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertProperties
	 * (org.apache.chemistry.opencmis.client.api.ObjectType, java.util.Collection,
	 * org.apache.chemistry.opencmis.commons.data.Properties)
	 */
	@Override
	public Map<String, Property<?>> convertProperties(ObjectType arg0, Collection<SecondaryType> arg1, Properties arg2)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertProperties (java.util.Map,
	 * org.apache.chemistry.opencmis.client.api.ObjectType, java.util.Collection, java.util.Set)
	 */
	@Override
	public Properties convertProperties(Map<String, ?> arg0, ObjectType arg1, Collection<SecondaryType> arg2,
		Set<Updatability> arg3)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertQueryProperties
	 * (org.apache.chemistry.opencmis.commons.data.Properties)
	 */
	@Override
	public List<PropertyData<?>> convertQueryProperties(Properties arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertQueryResult
	 * (org.apache.chemistry.opencmis.commons.data.ObjectData)
	 */
	@Override
	public QueryResult convertQueryResult(ObjectData arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertRendition (java.lang.String,
	 * org.apache.chemistry.opencmis.commons.data.RenditionData)
	 */
	@Override
	public Rendition convertRendition(String arg0, RenditionData arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RepositoryInfo convertRepositoryInfo(RepositoryInfo arg0)
	{
		System.out.println("convertRepositoryInfo called");
		return arg0;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#convertTypeDefinition
	 * (org.apache.chemistry.opencmis.commons.definitions.TypeDefinition)
	 */
	@Override
	public ObjectType convertTypeDefinition(TypeDefinition arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#createAce(java .lang.String, java.util.List)
	 */
	@Override
	public Ace createAce(String arg0, List<String> arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#createAcl(java .util.List)
	 */
	@Override
	public Acl createAcl(List<Ace> arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#createContentStream (java.lang.String, long, java.lang.String,
	 * java.io.InputStream)
	 */
	@Override
	public ContentStream createContentStream(String arg0, long arg1, String arg2, InputStream arg3)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#createContentStream (java.lang.String, long, java.lang.String,
	 * java.io.InputStream, boolean)
	 */
	@Override
	public ContentStream createContentStream(String arg0, long arg1, String arg2, InputStream arg3, boolean arg4)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#createProperty
	 * (org.apache.chemistry.opencmis.commons.definitions.PropertyDefinition, java.util.List)
	 */
	@Override
	public <T> Property<T> createProperty(PropertyDefinition<T> arg0, List<T> arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#getTypeFromObjectData
	 * (org.apache.chemistry.opencmis.commons.data.ObjectData)
	 */
	@Override
	public ObjectType getTypeFromObjectData(ObjectData arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.chemistry.opencmis.client.api.ObjectFactory#initialize(org .apache.chemistry.opencmis.client.api.Session,
	 * java.util.Map)
	 */
	@Override
	public void initialize(Session arg0, Map<String, String> arg1)
	{
		System.out.println("Initialize called");
	}

}
