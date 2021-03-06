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

package br.ufpe.cin.da.salada.service.impl;

import java.util.Date;

import br.ufpe.cin.da.salada.model.Sorteio;
import br.ufpe.cin.da.salada.service.base.SorteioLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the sorteio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link br.ufpe.cin.da.salada.service.SorteioLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author thecleydyr
 * @see br.ufpe.cin.da.salada.service.base.SorteioLocalServiceBaseImpl
 * @see br.ufpe.cin.da.salada.service.SorteioLocalServiceUtil
 */
public class SorteioLocalServiceImpl extends SorteioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link br.ufpe.cin.da.salada.service.SorteioLocalServiceUtil} to access the sorteio local service.
	 */
	
	public void cadastrarSorteio(String nome, Date dataAbertura, Date dataFechamento, ServiceContext ctx) throws SystemException {
		long sorteioId = counterLocalService.increment(Sorteio.class.toString());
		
		Sorteio sorteio = sorteioPersistence.create(sorteioId);
		sorteio.setNome(nome);
		sorteio.setDataAbertura(dataAbertura);
		sorteio.setDataFechamento(dataFechamento);
		
		sorteioPersistence.update(sorteio);
	}
}