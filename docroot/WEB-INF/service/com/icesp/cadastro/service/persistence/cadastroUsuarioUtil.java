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

package com.icesp.cadastro.service.persistence;

import com.icesp.cadastro.model.cadastroUsuario;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the cadastro usuario service. This utility wraps {@link cadastroUsuarioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ln00704
 * @see cadastroUsuarioPersistence
 * @see cadastroUsuarioPersistenceImpl
 * @generated
 */
public class cadastroUsuarioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(cadastroUsuario cadastroUsuario) {
		getPersistence().clearCache(cadastroUsuario);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<cadastroUsuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<cadastroUsuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<cadastroUsuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static cadastroUsuario update(cadastroUsuario cadastroUsuario,
		boolean merge) throws SystemException {
		return getPersistence().update(cadastroUsuario, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static cadastroUsuario update(cadastroUsuario cadastroUsuario,
		boolean merge, ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(cadastroUsuario, merge, serviceContext);
	}

	/**
	* Caches the cadastro usuario in the entity cache if it is enabled.
	*
	* @param cadastroUsuario the cadastro usuario
	*/
	public static void cacheResult(
		com.icesp.cadastro.model.cadastroUsuario cadastroUsuario) {
		getPersistence().cacheResult(cadastroUsuario);
	}

	/**
	* Caches the cadastro usuarios in the entity cache if it is enabled.
	*
	* @param cadastroUsuarios the cadastro usuarios
	*/
	public static void cacheResult(
		java.util.List<com.icesp.cadastro.model.cadastroUsuario> cadastroUsuarios) {
		getPersistence().cacheResult(cadastroUsuarios);
	}

	/**
	* Creates a new cadastro usuario with the primary key. Does not add the cadastro usuario to the database.
	*
	* @param cpf the primary key for the new cadastro usuario
	* @return the new cadastro usuario
	*/
	public static com.icesp.cadastro.model.cadastroUsuario create(
		java.lang.String cpf) {
		return getPersistence().create(cpf);
	}

	/**
	* Removes the cadastro usuario with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cpf the primary key of the cadastro usuario
	* @return the cadastro usuario that was removed
	* @throws com.icesp.cadastro.NoSuchcadastroUsuarioException if a cadastro usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.icesp.cadastro.model.cadastroUsuario remove(
		java.lang.String cpf)
		throws com.icesp.cadastro.NoSuchcadastroUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(cpf);
	}

	public static com.icesp.cadastro.model.cadastroUsuario updateImpl(
		com.icesp.cadastro.model.cadastroUsuario cadastroUsuario, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(cadastroUsuario, merge);
	}

	/**
	* Returns the cadastro usuario with the primary key or throws a {@link com.icesp.cadastro.NoSuchcadastroUsuarioException} if it could not be found.
	*
	* @param cpf the primary key of the cadastro usuario
	* @return the cadastro usuario
	* @throws com.icesp.cadastro.NoSuchcadastroUsuarioException if a cadastro usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.icesp.cadastro.model.cadastroUsuario findByPrimaryKey(
		java.lang.String cpf)
		throws com.icesp.cadastro.NoSuchcadastroUsuarioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(cpf);
	}

	/**
	* Returns the cadastro usuario with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cpf the primary key of the cadastro usuario
	* @return the cadastro usuario, or <code>null</code> if a cadastro usuario with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.icesp.cadastro.model.cadastroUsuario fetchByPrimaryKey(
		java.lang.String cpf)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cpf);
	}

	/**
	* Returns all the cadastro usuarios.
	*
	* @return the cadastro usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.icesp.cadastro.model.cadastroUsuario> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cadastro usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of cadastro usuarios
	* @param end the upper bound of the range of cadastro usuarios (not inclusive)
	* @return the range of cadastro usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.icesp.cadastro.model.cadastroUsuario> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cadastro usuarios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of cadastro usuarios
	* @param end the upper bound of the range of cadastro usuarios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cadastro usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.icesp.cadastro.model.cadastroUsuario> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the cadastro usuarios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cadastro usuarios.
	*
	* @return the number of cadastro usuarios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static cadastroUsuarioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (cadastroUsuarioPersistence)PortletBeanLocatorUtil.locate(com.icesp.cadastro.service.ClpSerializer.getServletContextName(),
					cadastroUsuarioPersistence.class.getName());

			ReferenceRegistry.registerReference(cadastroUsuarioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(cadastroUsuarioPersistence persistence) {
	}

	private static cadastroUsuarioPersistence _persistence;
}