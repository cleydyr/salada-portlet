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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Sorteio in entity cache.
 *
 * @author thecleydyr
 * @see Sorteio
 * @generated
 */
public class SorteioCacheModel implements CacheModel<Sorteio>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{sorteioId=");
		sb.append(sorteioId);
		sb.append(", dataAbertura=");
		sb.append(dataAbertura);
		sb.append(", dataFechamento=");
		sb.append(dataFechamento);
		sb.append(", nome=");
		sb.append(nome);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sorteio toEntityModel() {
		SorteioImpl sorteioImpl = new SorteioImpl();

		sorteioImpl.setSorteioId(sorteioId);

		if (dataAbertura == Long.MIN_VALUE) {
			sorteioImpl.setDataAbertura(null);
		}
		else {
			sorteioImpl.setDataAbertura(new Date(dataAbertura));
		}

		if (dataFechamento == Long.MIN_VALUE) {
			sorteioImpl.setDataFechamento(null);
		}
		else {
			sorteioImpl.setDataFechamento(new Date(dataFechamento));
		}

		if (nome == null) {
			sorteioImpl.setNome(StringPool.BLANK);
		}
		else {
			sorteioImpl.setNome(nome);
		}

		sorteioImpl.resetOriginalValues();

		return sorteioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sorteioId = objectInput.readLong();
		dataAbertura = objectInput.readLong();
		dataFechamento = objectInput.readLong();
		nome = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(sorteioId);
		objectOutput.writeLong(dataAbertura);
		objectOutput.writeLong(dataFechamento);

		if (nome == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nome);
		}
	}

	public long sorteioId;
	public long dataAbertura;
	public long dataFechamento;
	public String nome;
}