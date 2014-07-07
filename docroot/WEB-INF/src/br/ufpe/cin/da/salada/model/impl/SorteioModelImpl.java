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

package br.ufpe.cin.da.salada.model.impl;

import br.ufpe.cin.da.salada.model.Sorteio;
import br.ufpe.cin.da.salada.model.SorteioModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Sorteio service. Represents a row in the &quot;salada_Sorteio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link br.ufpe.cin.da.salada.model.SorteioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SorteioImpl}.
 * </p>
 *
 * @author thecleydyr
 * @see SorteioImpl
 * @see br.ufpe.cin.da.salada.model.Sorteio
 * @see br.ufpe.cin.da.salada.model.SorteioModel
 * @generated
 */
public class SorteioModelImpl extends BaseModelImpl<Sorteio>
	implements SorteioModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sorteio model instance should use the {@link br.ufpe.cin.da.salada.model.Sorteio} interface instead.
	 */
	public static final String TABLE_NAME = "salada_Sorteio";
	public static final Object[][] TABLE_COLUMNS = {
			{ "sorteioId", Types.BIGINT },
			{ "dataInicio", Types.TIMESTAMP },
			{ "dataFim", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table salada_Sorteio (sorteioId LONG not null primary key,dataInicio DATE null,dataFim DATE null)";
	public static final String TABLE_SQL_DROP = "drop table salada_Sorteio";
	public static final String ORDER_BY_JPQL = " ORDER BY sorteio.sorteioId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY salada_Sorteio.sorteioId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.br.ufpe.cin.da.salada.model.Sorteio"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.br.ufpe.cin.da.salada.model.Sorteio"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.br.ufpe.cin.da.salada.model.Sorteio"));

	public SorteioModelImpl() {
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

	@Override
	public long getSorteioId() {
		return _sorteioId;
	}

	@Override
	public void setSorteioId(long sorteioId) {
		_sorteioId = sorteioId;
	}

	@Override
	public Date getDataInicio() {
		return _dataInicio;
	}

	@Override
	public void setDataInicio(Date dataInicio) {
		_dataInicio = dataInicio;
	}

	@Override
	public Date getDataFim() {
		return _dataFim;
	}

	@Override
	public void setDataFim(Date dataFim) {
		_dataFim = dataFim;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Sorteio.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Sorteio toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Sorteio)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SorteioImpl sorteioImpl = new SorteioImpl();

		sorteioImpl.setSorteioId(getSorteioId());
		sorteioImpl.setDataInicio(getDataInicio());
		sorteioImpl.setDataFim(getDataFim());

		sorteioImpl.resetOriginalValues();

		return sorteioImpl;
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

		if (!(obj instanceof Sorteio)) {
			return false;
		}

		Sorteio sorteio = (Sorteio)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Sorteio> toCacheModel() {
		SorteioCacheModel sorteioCacheModel = new SorteioCacheModel();

		sorteioCacheModel.sorteioId = getSorteioId();

		Date dataInicio = getDataInicio();

		if (dataInicio != null) {
			sorteioCacheModel.dataInicio = dataInicio.getTime();
		}
		else {
			sorteioCacheModel.dataInicio = Long.MIN_VALUE;
		}

		Date dataFim = getDataFim();

		if (dataFim != null) {
			sorteioCacheModel.dataFim = dataFim.getTime();
		}
		else {
			sorteioCacheModel.dataFim = Long.MIN_VALUE;
		}

		return sorteioCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{sorteioId=");
		sb.append(getSorteioId());
		sb.append(", dataInicio=");
		sb.append(getDataInicio());
		sb.append(", dataFim=");
		sb.append(getDataFim());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("br.ufpe.cin.da.salada.model.Sorteio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sorteioId</column-name><column-value><![CDATA[");
		sb.append(getSorteioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataInicio</column-name><column-value><![CDATA[");
		sb.append(getDataInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dataFim</column-name><column-value><![CDATA[");
		sb.append(getDataFim());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Sorteio.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Sorteio.class
		};
	private long _sorteioId;
	private Date _dataInicio;
	private Date _dataFim;
	private Sorteio _escapedModel;
}