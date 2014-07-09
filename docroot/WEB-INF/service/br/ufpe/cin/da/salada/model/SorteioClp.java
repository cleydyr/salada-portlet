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

import br.ufpe.cin.da.salada.service.ClpSerializer;
import br.ufpe.cin.da.salada.service.SorteioLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author thecleydyr
 */
public class SorteioClp extends BaseModelImpl<Sorteio> implements Sorteio {
	public SorteioClp() {
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
	public long getPrimaryKey() {
		return _sorteioId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSorteioId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sorteioId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getSorteioId() {
		return _sorteioId;
	}

	@Override
	public void setSorteioId(long sorteioId) {
		_sorteioId = sorteioId;

		if (_sorteioRemoteModel != null) {
			try {
				Class<?> clazz = _sorteioRemoteModel.getClass();

				Method method = clazz.getMethod("setSorteioId", long.class);

				method.invoke(_sorteioRemoteModel, sorteioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDataAbertura() {
		return _dataAbertura;
	}

	@Override
	public void setDataAbertura(Date dataAbertura) {
		_dataAbertura = dataAbertura;

		if (_sorteioRemoteModel != null) {
			try {
				Class<?> clazz = _sorteioRemoteModel.getClass();

				Method method = clazz.getMethod("setDataAbertura", Date.class);

				method.invoke(_sorteioRemoteModel, dataAbertura);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDataFechamento() {
		return _dataFechamento;
	}

	@Override
	public void setDataFechamento(Date dataFechamento) {
		_dataFechamento = dataFechamento;

		if (_sorteioRemoteModel != null) {
			try {
				Class<?> clazz = _sorteioRemoteModel.getClass();

				Method method = clazz.getMethod("setDataFechamento", Date.class);

				method.invoke(_sorteioRemoteModel, dataFechamento);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNome() {
		return _nome;
	}

	@Override
	public void setNome(String nome) {
		_nome = nome;

		if (_sorteioRemoteModel != null) {
			try {
				Class<?> clazz = _sorteioRemoteModel.getClass();

				Method method = clazz.getMethod("setNome", String.class);

				method.invoke(_sorteioRemoteModel, nome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSorteioRemoteModel() {
		return _sorteioRemoteModel;
	}

	public void setSorteioRemoteModel(BaseModel<?> sorteioRemoteModel) {
		_sorteioRemoteModel = sorteioRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _sorteioRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_sorteioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SorteioLocalServiceUtil.addSorteio(this);
		}
		else {
			SorteioLocalServiceUtil.updateSorteio(this);
		}
	}

	@Override
	public Sorteio toEscapedModel() {
		return (Sorteio)ProxyUtil.newProxyInstance(Sorteio.class.getClassLoader(),
			new Class[] { Sorteio.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SorteioClp clone = new SorteioClp();

		clone.setSorteioId(getSorteioId());
		clone.setDataAbertura(getDataAbertura());
		clone.setDataFechamento(getDataFechamento());
		clone.setNome(getNome());

		return clone;
	}

	@Override
	public int compareTo(Sorteio sorteio) {
		long primaryKey = sorteio.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SorteioClp)) {
			return false;
		}

		SorteioClp sorteio = (SorteioClp)obj;

		long primaryKey = sorteio.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{sorteioId=");
		sb.append(getSorteioId());
		sb.append(", dataAbertura=");
		sb.append(getDataAbertura());
		sb.append(", dataFechamento=");
		sb.append(getDataFechamento());
		sb.append(", nome=");
		sb.append(getNome());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("br.ufpe.cin.da.salada.model.Sorteio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sorteioId</column-name><column-value><![CDATA[");
		sb.append(getSorteioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataAbertura</column-name><column-value><![CDATA[");
		sb.append(getDataAbertura());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataFechamento</column-name><column-value><![CDATA[");
		sb.append(getDataFechamento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nome</column-name><column-value><![CDATA[");
		sb.append(getNome());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _sorteioId;
	private Date _dataAbertura;
	private Date _dataFechamento;
	private String _nome;
	private BaseModel<?> _sorteioRemoteModel;
}