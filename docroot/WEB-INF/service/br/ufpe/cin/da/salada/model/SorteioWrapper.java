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
		attributes.put("dataAbertura", getDataAbertura());
		attributes.put("dataFechamento", getDataFechamento());
		attributes.put("nome", getNome());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sorteioId = (Long)attributes.get("sorteioId");

		if (sorteioId != null) {
			setSorteioId(sorteioId);
		}

		Date dataAbertura = (Date)attributes.get("dataAbertura");

		if (dataAbertura != null) {
			setDataAbertura(dataAbertura);
		}

		Date dataFechamento = (Date)attributes.get("dataFechamento");

		if (dataFechamento != null) {
			setDataFechamento(dataFechamento);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
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
	* Returns the data abertura of this sorteio.
	*
	* @return the data abertura of this sorteio
	*/
	@Override
	public java.util.Date getDataAbertura() {
		return _sorteio.getDataAbertura();
	}

	/**
	* Sets the data abertura of this sorteio.
	*
	* @param dataAbertura the data abertura of this sorteio
	*/
	@Override
	public void setDataAbertura(java.util.Date dataAbertura) {
		_sorteio.setDataAbertura(dataAbertura);
	}

	/**
	* Returns the data fechamento of this sorteio.
	*
	* @return the data fechamento of this sorteio
	*/
	@Override
	public java.util.Date getDataFechamento() {
		return _sorteio.getDataFechamento();
	}

	/**
	* Sets the data fechamento of this sorteio.
	*
	* @param dataFechamento the data fechamento of this sorteio
	*/
	@Override
	public void setDataFechamento(java.util.Date dataFechamento) {
		_sorteio.setDataFechamento(dataFechamento);
	}

	/**
	* Returns the nome of this sorteio.
	*
	* @return the nome of this sorteio
	*/
	@Override
	public java.lang.String getNome() {
		return _sorteio.getNome();
	}

	/**
	* Sets the nome of this sorteio.
	*
	* @param nome the nome of this sorteio
	*/
	@Override
	public void setNome(java.lang.String nome) {
		_sorteio.setNome(nome);
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
	public int compareTo(br.ufpe.cin.da.salada.model.Sorteio sorteio) {
		return _sorteio.compareTo(sorteio);
	}

	@Override
	public int hashCode() {
		return _sorteio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<br.ufpe.cin.da.salada.model.Sorteio> toCacheModel() {
		return _sorteio.toCacheModel();
	}

	@Override
	public br.ufpe.cin.da.salada.model.Sorteio toEscapedModel() {
		return new SorteioWrapper(_sorteio.toEscapedModel());
	}

	@Override
	public br.ufpe.cin.da.salada.model.Sorteio toUnescapedModel() {
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