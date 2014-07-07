/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.ufpe.cin.da.salada.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Sorteio service. Represents a row in the &quot;salada_Sorteio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link br.ufpe.cin.da.salada.model.impl.SorteioModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link br.ufpe.cin.da.salada.model.impl.SorteioImpl}.
 * </p>
 *
 * @author thecleydyr
 * @see Sorteio
 * @see br.ufpe.cin.da.salada.model.impl.SorteioImpl
 * @see br.ufpe.cin.da.salada.model.impl.SorteioModelImpl
 * @generated
 */
public interface SorteioModel extends BaseModel<Sorteio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sorteio model instance should use the {@link Sorteio} interface instead.
	 */

	/**
	 * Returns the primary key of this sorteio.
	 *
	 * @return the primary key of this sorteio
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sorteio.
	 *
	 * @param primaryKey the primary key of this sorteio
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sorteio ID of this sorteio.
	 *
	 * @return the sorteio ID of this sorteio
	 */
	public long getSorteioId();

	/**
	 * Sets the sorteio ID of this sorteio.
	 *
	 * @param sorteioId the sorteio ID of this sorteio
	 */
	public void setSorteioId(long sorteioId);

	/**
	 * Returns the data inicio of this sorteio.
	 *
	 * @return the data inicio of this sorteio
	 */
	public Date getDataInicio();

	/**
	 * Sets the data inicio of this sorteio.
	 *
	 * @param dataInicio the data inicio of this sorteio
	 */
	public void setDataInicio(Date dataInicio);

	/**
	 * Returns the data fim of this sorteio.
	 *
	 * @return the data fim of this sorteio
	 */
	public Date getDataFim();

	/**
	 * Sets the data fim of this sorteio.
	 *
	 * @param dataFim the data fim of this sorteio
	 */
	public void setDataFim(Date dataFim);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Sorteio sorteio);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Sorteio> toCacheModel();

	@Override
	public Sorteio toEscapedModel();

	@Override
	public Sorteio toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}