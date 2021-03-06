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
import br.ufpe.cin.da.salada.service.SorteioLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Sorteio service. Represents a row in the &quot;salada_Sorteio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SorteioImpl}.
 * </p>
 *
 * @author thecleydyr
 * @see SorteioImpl
 * @see br.ufpe.cin.da.salada.model.Sorteio
 * @generated
 */
public abstract class SorteioBaseImpl extends SorteioModelImpl
	implements Sorteio {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sorteio model instance should use the {@link Sorteio} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SorteioLocalServiceUtil.addSorteio(this);
		}
		else {
			SorteioLocalServiceUtil.updateSorteio(this);
		}
	}
}