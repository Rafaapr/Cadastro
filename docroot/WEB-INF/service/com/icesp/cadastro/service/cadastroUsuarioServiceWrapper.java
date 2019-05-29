/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.icesp.cadastro.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link cadastroUsuarioService}.
 * </p>
 *
 * @author    ln00704
 * @see       cadastroUsuarioService
 * @generated
 */
public class cadastroUsuarioServiceWrapper implements cadastroUsuarioService,
	ServiceWrapper<cadastroUsuarioService> {
	public cadastroUsuarioServiceWrapper(
		cadastroUsuarioService cadastroUsuarioService) {
		_cadastroUsuarioService = cadastroUsuarioService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _cadastroUsuarioService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cadastroUsuarioService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cadastroUsuarioService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public cadastroUsuarioService getWrappedcadastroUsuarioService() {
		return _cadastroUsuarioService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedcadastroUsuarioService(
		cadastroUsuarioService cadastroUsuarioService) {
		_cadastroUsuarioService = cadastroUsuarioService;
	}

	public cadastroUsuarioService getWrappedService() {
		return _cadastroUsuarioService;
	}

	public void setWrappedService(cadastroUsuarioService cadastroUsuarioService) {
		_cadastroUsuarioService = cadastroUsuarioService;
	}

	private cadastroUsuarioService _cadastroUsuarioService;
}