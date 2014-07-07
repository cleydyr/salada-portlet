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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author thecleydyr
 * @generated
 */
public class SorteioSoap implements Serializable {
	public static SorteioSoap toSoapModel(Sorteio model) {
		SorteioSoap soapModel = new SorteioSoap();

		soapModel.setSorteioId(model.getSorteioId());
		soapModel.setDataInicio(model.getDataInicio());
		soapModel.setDataFim(model.getDataFim());

		return soapModel;
	}

	public static SorteioSoap[] toSoapModels(Sorteio[] models) {
		SorteioSoap[] soapModels = new SorteioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SorteioSoap[][] toSoapModels(Sorteio[][] models) {
		SorteioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SorteioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SorteioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SorteioSoap[] toSoapModels(List<Sorteio> models) {
		List<SorteioSoap> soapModels = new ArrayList<SorteioSoap>(models.size());

		for (Sorteio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SorteioSoap[soapModels.size()]);
	}

	public SorteioSoap() {
	}

	public long getPrimaryKey() {
		return _sorteioId;
	}

	public void setPrimaryKey(long pk) {
		setSorteioId(pk);
	}

	public long getSorteioId() {
		return _sorteioId;
	}

	public void setSorteioId(long sorteioId) {
		_sorteioId = sorteioId;
	}

	public Date getDataInicio() {
		return _dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		_dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return _dataFim;
	}

	public void setDataFim(Date dataFim) {
		_dataFim = dataFim;
	}

	private long _sorteioId;
	private Date _dataInicio;
	private Date _dataFim;
}