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

package br.ufpe.cin.da.salada.service.persistence;

import br.ufpe.cin.da.salada.model.Sorteio;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the sorteio service. This utility wraps {@link SorteioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thecleydyr
 * @see SorteioPersistence
 * @see SorteioPersistenceImpl
 * @generated
 */
public class SorteioUtil {
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
	public static void clearCache(Sorteio sorteio) {
		getPersistence().clearCache(sorteio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Sorteio> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Sorteio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Sorteio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Sorteio update(Sorteio sorteio) throws SystemException {
		return getPersistence().update(sorteio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Sorteio update(Sorteio sorteio, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(sorteio, serviceContext);
	}

	/**
	* Caches the sorteio in the entity cache if it is enabled.
	*
	* @param sorteio the sorteio
	*/
	public static void cacheResult(br.ufpe.cin.da.salada.model.Sorteio sorteio) {
		getPersistence().cacheResult(sorteio);
	}

	/**
	* Caches the sorteios in the entity cache if it is enabled.
	*
	* @param sorteios the sorteios
	*/
	public static void cacheResult(
		java.util.List<br.ufpe.cin.da.salada.model.Sorteio> sorteios) {
		getPersistence().cacheResult(sorteios);
	}

	/**
	* Creates a new sorteio with the primary key. Does not add the sorteio to the database.
	*
	* @param sorteioId the primary key for the new sorteio
	* @return the new sorteio
	*/
	public static br.ufpe.cin.da.salada.model.Sorteio create(long sorteioId) {
		return getPersistence().create(sorteioId);
	}

	/**
	* Removes the sorteio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sorteioId the primary key of the sorteio
	* @return the sorteio that was removed
	* @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.ufpe.cin.da.salada.model.Sorteio remove(long sorteioId)
		throws br.ufpe.cin.da.salada.NoSuchSorteioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(sorteioId);
	}

	public static br.ufpe.cin.da.salada.model.Sorteio updateImpl(
		br.ufpe.cin.da.salada.model.Sorteio sorteio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(sorteio);
	}

	/**
	* Returns the sorteio with the primary key or throws a {@link br.ufpe.cin.da.salada.NoSuchSorteioException} if it could not be found.
	*
	* @param sorteioId the primary key of the sorteio
	* @return the sorteio
	* @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.ufpe.cin.da.salada.model.Sorteio findByPrimaryKey(
		long sorteioId)
		throws br.ufpe.cin.da.salada.NoSuchSorteioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(sorteioId);
	}

	/**
	* Returns the sorteio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sorteioId the primary key of the sorteio
	* @return the sorteio, or <code>null</code> if a sorteio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.ufpe.cin.da.salada.model.Sorteio fetchByPrimaryKey(
		long sorteioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(sorteioId);
	}

	/**
	* Returns all the sorteios.
	*
	* @return the sorteios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.ufpe.cin.da.salada.model.Sorteio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the sorteios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.ufpe.cin.da.salada.model.impl.SorteioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sorteios
	* @param end the upper bound of the range of sorteios (not inclusive)
	* @return the range of sorteios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.ufpe.cin.da.salada.model.Sorteio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the sorteios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.ufpe.cin.da.salada.model.impl.SorteioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sorteios
	* @param end the upper bound of the range of sorteios (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sorteios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.ufpe.cin.da.salada.model.Sorteio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the sorteios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of sorteios.
	*
	* @return the number of sorteios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SorteioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SorteioPersistence)PortletBeanLocatorUtil.locate(br.ufpe.cin.da.salada.service.ClpSerializer.getServletContextName(),
					SorteioPersistence.class.getName());

			ReferenceRegistry.registerReference(SorteioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SorteioPersistence persistence) {
	}

	private static SorteioPersistence _persistence;
}