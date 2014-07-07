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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sorteio}.
 * </p>
 *
 * @author thecleydyr
 * @see Sorteio
 * @generated
 */
public class SorteioWrapper implements Sorteio, ModelWrapper<Sorteio> {
	public SorteioWrapper(Sorteio sorteio) {
		_sorteio = sorteio;
	}

	@Override
	public Class<?> getModelClass() {
		return Sorteio.class;
	}

	@Override
	public String getModelClassName() {
		return Sorteio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sorteioId", getSorteioId());
		attributes.put("dataInicio", getDataInicio());
		attributes.put("dataFim", getDataFim());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sorteioId = (Long)attributes.get("sorteioId");

		if (sorteioId != null) {
			setSorteioId(sorteioId);
		}

		Date dataInicio = (Date)attributes.get("dataInicio");

		if (dataInicio != null) {
			setDataInicio(dataInicio);
		}

		Date dataFim = (Date)attributes.get("dataFim");

		if (dataFim != null) {
			setDataFim(dataFim);
		}
	}

	/**
	* Returns the primary key of this sorteio.
	*
	* @return the primary key of this sorteio
	*/
	@Override
	public long getPrimaryKey() {
		return _sorteio.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sorteio.
	*
	* @param primaryKey the primary key of this sorteio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sorteio.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sorteio ID of this sorteio.
	*
	* @return the sorteio ID of this sorteio
	*/
	@Override
	public long getSorteioId() {
		return _sorteio.getSorteioId();
	}

	/**
	* Sets the sorteio ID of this sorteio.
	*
	* @param sorteioId the sorteio ID of this sorteio
	*/
	@Override
	public void setSorteioId(long sorteioId) {
		_sorteio.setSorteioId(sorteioId);
	}

	/**
	* Returns the data inicio of this sorteio.
	*
	* @return the data inicio of this sorteio
	*/
	@Override
	public java.util.Date getDataInicio() {
		return _sorteio.getDataInicio();
	}

	/**
	* Sets the data inicio of this sorteio.
	*
	* @param dataInicio the data inicio of this sorteio
	*/
	@Override
	public void setDataInicio(java.util.Date dataInicio) {
		_sorteio.setDataInicio(dataInicio);
	}

	/**
	* Returns the data fim of this sorteio.
	*
	* @return the data fim of this sorteio
	*/
	@Override
	public java.util.Date getDataFim() {
		return _sorteio.getDataFim();
	}

	/**
	* Sets the data fim of this sorteio.
	*
	* @param dataFim the data fim of this sorteio
	*/
	@Override
	public void setDataFim(java.util.Date dataFim) {
		_sorteio.setDataFim(dataFim);
	}

	@Override
	public boolean isNew() {
		return _sorteio.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sorteio.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sorteio.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sorteio.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sorteio.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sorteio.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sorteio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sorteio.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sorteio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sorteio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sorteio.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SorteioWrapper((Sorteio)_sorteio.clone());
	}

	@Override
	public int compareTo(Sorteio sorteio) {
		return _sorteio.compareTo(sorteio);
	}

	@Override
	public int hashCode() {
		return _sorteio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Sorteio> toCacheModel() {
		return _sorteio.toCacheModel();
	}

	@Override
	public Sorteio toEscapedModel() {
		return new SorteioWrapper(_sorteio.toEscapedModel());
	}

	@Override
	public Sorteio toUnescapedModel() {
		return new SorteioWrapper(_sorteio.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sorteio.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sorteio.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sorteio.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SorteioWrapper)) {
			return false;
		}

		SorteioWrapper sorteioWrapper = (SorteioWrapper)obj;

		if (Validator.equals(_sorteio, sorteioWrapper._sorteio)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Sorteio getWrappedSorteio() {
		return _sorteio;
	}

	@Override
	public Sorteio getWrappedModel() {
		return _sorteio;
	}

	@Override
	public void resetOriginalValues() {
		_sorteio.resetOriginalValues();
	}

	private Sorteio _sorteio;
}