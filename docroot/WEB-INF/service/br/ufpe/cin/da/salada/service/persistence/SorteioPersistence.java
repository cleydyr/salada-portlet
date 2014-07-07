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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the sorteio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thecleydyr
 * @see SorteioPersistenceImpl
 * @see SorteioUtil
 * @generated
 */
public interface SorteioPersistence extends BasePersistence<Sorteio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SorteioUtil} to access the sorteio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sorteio in the entity cache if it is enabled.
	*
	* @param sorteio the sorteio
	*/
	public void cacheResult(br.ufpe.cin.da.salada.model.Sorteio sorteio);

	/**
	* Caches the sorteios in the entity cache if it is enabled.
	*
	* @param sorteios the sorteios
	*/
	public void cacheResult(
		java.util.List<br.ufpe.cin.da.salada.model.Sorteio> sorteios);

	/**
	* Creates a new sorteio with the primary key. Does not add the sorteio to the database.
	*
	* @param sorteioId the primary key for the new sorteio
	* @return the new sorteio
	*/
	public br.ufpe.cin.da.salada.model.Sorteio create(long sorteioId);

	/**
	* Removes the sorteio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sorteioId the primary key of the sorteio
	* @return the sorteio that was removed
	* @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.ufpe.cin.da.salada.model.Sorteio remove(long sorteioId)
		throws br.ufpe.cin.da.salada.NoSuchSorteioException,
			com.liferay.portal.kernel.exception.SystemException;

	public br.ufpe.cin.da.salada.model.Sorteio updateImpl(
		br.ufpe.cin.da.salada.model.Sorteio sorteio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sorteio with the primary key or throws a {@link br.ufpe.cin.da.salada.NoSuchSorteioException} if it could not be found.
	*
	* @param sorteioId the primary key of the sorteio
	* @return the sorteio
	* @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.ufpe.cin.da.salada.model.Sorteio findByPrimaryKey(long sorteioId)
		throws br.ufpe.cin.da.salada.NoSuchSorteioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sorteio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sorteioId the primary key of the sorteio
	* @return the sorteio, or <code>null</code> if a sorteio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.ufpe.cin.da.salada.model.Sorteio fetchByPrimaryKey(long sorteioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the sorteios.
	*
	* @return the sorteios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.ufpe.cin.da.salada.model.Sorteio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.ufpe.cin.da.salada.model.Sorteio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.ufpe.cin.da.salada.model.Sorteio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sorteios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of sorteios.
	*
	* @return the number of sorteios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}