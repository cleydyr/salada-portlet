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

package br.ufpe.cin.da.salada.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MensagemService}.
 *
 * @author thecleydyr
 * @see MensagemService
 * @generated
 */
public class MensagemServiceWrapper implements MensagemService,
	ServiceWrapper<MensagemService> {
	public MensagemServiceWrapper(MensagemService mensagemService) {
		_mensagemService = mensagemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mensagemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mensagemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mensagemService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MensagemService getWrappedMensagemService() {
		return _mensagemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMensagemService(MensagemService mensagemService) {
		_mensagemService = mensagemService;
	}

	@Override
	public MensagemService getWrappedService() {
		return _mensagemService;
	}

	@Override
	public void setWrappedService(MensagemService mensagemService) {
		_mensagemService = mensagemService;
	}

	private MensagemService _mensagemService;
}