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

import br.ufpe.cin.da.salada.NoSuchSorteioException;
import br.ufpe.cin.da.salada.model.Sorteio;
import br.ufpe.cin.da.salada.model.impl.SorteioImpl;
import br.ufpe.cin.da.salada.model.impl.SorteioModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the sorteio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author thecleydyr
 * @see SorteioPersistence
 * @see SorteioUtil
 * @generated
 */
public class SorteioPersistenceImpl extends BasePersistenceImpl<Sorteio>
	implements SorteioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SorteioUtil} to access the sorteio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SorteioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SorteioModelImpl.ENTITY_CACHE_ENABLED,
			SorteioModelImpl.FINDER_CACHE_ENABLED, SorteioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SorteioModelImpl.ENTITY_CACHE_ENABLED,
			SorteioModelImpl.FINDER_CACHE_ENABLED, SorteioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SorteioModelImpl.ENTITY_CACHE_ENABLED,
			SorteioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SorteioPersistenceImpl() {
		setModelClass(Sorteio.class);
	}

	/**
	 * Caches the sorteio in the entity cache if it is enabled.
	 *
	 * @param sorteio the sorteio
	 */
	@Override
	public void cacheResult(Sorteio sorteio) {
		EntityCacheUtil.putResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
			SorteioImpl.class, sorteio.getPrimaryKey(), sorteio);

		sorteio.resetOriginalValues();
	}

	/**
	 * Caches the sorteios in the entity cache if it is enabled.
	 *
	 * @param sorteios the sorteios
	 */
	@Override
	public void cacheResult(List<Sorteio> sorteios) {
		for (Sorteio sorteio : sorteios) {
			if (EntityCacheUtil.getResult(
						SorteioModelImpl.ENTITY_CACHE_ENABLED,
						SorteioImpl.class, sorteio.getPrimaryKey()) == null) {
				cacheResult(sorteio);
			}
			else {
				sorteio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sorteios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(SorteioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(SorteioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sorteio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sorteio sorteio) {
		EntityCacheUtil.removeResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
			SorteioImpl.class, sorteio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Sorteio> sorteios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Sorteio sorteio : sorteios) {
			EntityCacheUtil.removeResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
				SorteioImpl.class, sorteio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sorteio with the primary key. Does not add the sorteio to the database.
	 *
	 * @param sorteioId the primary key for the new sorteio
	 * @return the new sorteio
	 */
	@Override
	public Sorteio create(long sorteioId) {
		Sorteio sorteio = new SorteioImpl();

		sorteio.setNew(true);
		sorteio.setPrimaryKey(sorteioId);

		return sorteio;
	}

	/**
	 * Removes the sorteio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sorteioId the primary key of the sorteio
	 * @return the sorteio that was removed
	 * @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sorteio remove(long sorteioId)
		throws NoSuchSorteioException, SystemException {
		return remove((Serializable)sorteioId);
	}

	/**
	 * Removes the sorteio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sorteio
	 * @return the sorteio that was removed
	 * @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sorteio remove(Serializable primaryKey)
		throws NoSuchSorteioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Sorteio sorteio = (Sorteio)session.get(SorteioImpl.class, primaryKey);

			if (sorteio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSorteioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sorteio);
		}
		catch (NoSuchSorteioException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Sorteio removeImpl(Sorteio sorteio) throws SystemException {
		sorteio = toUnwrappedModel(sorteio);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sorteio)) {
				sorteio = (Sorteio)session.get(SorteioImpl.class,
						sorteio.getPrimaryKeyObj());
			}

			if (sorteio != null) {
				session.delete(sorteio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sorteio != null) {
			clearCache(sorteio);
		}

		return sorteio;
	}

	@Override
	public Sorteio updateImpl(br.ufpe.cin.da.salada.model.Sorteio sorteio)
		throws SystemException {
		sorteio = toUnwrappedModel(sorteio);

		boolean isNew = sorteio.isNew();

		Session session = null;

		try {
			session = openSession();

			if (sorteio.isNew()) {
				session.save(sorteio);

				sorteio.setNew(false);
			}
			else {
				session.merge(sorteio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
			SorteioImpl.class, sorteio.getPrimaryKey(), sorteio);

		return sorteio;
	}

	protected Sorteio toUnwrappedModel(Sorteio sorteio) {
		if (sorteio instanceof SorteioImpl) {
			return sorteio;
		}

		SorteioImpl sorteioImpl = new SorteioImpl();

		sorteioImpl.setNew(sorteio.isNew());
		sorteioImpl.setPrimaryKey(sorteio.getPrimaryKey());

		sorteioImpl.setSorteioId(sorteio.getSorteioId());
		sorteioImpl.setDataInicio(sorteio.getDataInicio());
		sorteioImpl.setDataFim(sorteio.getDataFim());

		return sorteioImpl;
	}

	/**
	 * Returns the sorteio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sorteio
	 * @return the sorteio
	 * @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sorteio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSorteioException, SystemException {
		Sorteio sorteio = fetchByPrimaryKey(primaryKey);

		if (sorteio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSorteioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sorteio;
	}

	/**
	 * Returns the sorteio with the primary key or throws a {@link br.ufpe.cin.da.salada.NoSuchSorteioException} if it could not be found.
	 *
	 * @param sorteioId the primary key of the sorteio
	 * @return the sorteio
	 * @throws br.ufpe.cin.da.salada.NoSuchSorteioException if a sorteio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sorteio findByPrimaryKey(long sorteioId)
		throws NoSuchSorteioException, SystemException {
		return findByPrimaryKey((Serializable)sorteioId);
	}

	/**
	 * Returns the sorteio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sorteio
	 * @return the sorteio, or <code>null</code> if a sorteio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sorteio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Sorteio sorteio = (Sorteio)EntityCacheUtil.getResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
				SorteioImpl.class, primaryKey);

		if (sorteio == _nullSorteio) {
			return null;
		}

		if (sorteio == null) {
			Session session = null;

			try {
				session = openSession();

				sorteio = (Sorteio)session.get(SorteioImpl.class, primaryKey);

				if (sorteio != null) {
					cacheResult(sorteio);
				}
				else {
					EntityCacheUtil.putResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
						SorteioImpl.class, primaryKey, _nullSorteio);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(SorteioModelImpl.ENTITY_CACHE_ENABLED,
					SorteioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sorteio;
	}

	/**
	 * Returns the sorteio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sorteioId the primary key of the sorteio
	 * @return the sorteio, or <code>null</code> if a sorteio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Sorteio fetchByPrimaryKey(long sorteioId) throws SystemException {
		return fetchByPrimaryKey((Serializable)sorteioId);
	}

	/**
	 * Returns all the sorteios.
	 *
	 * @return the sorteios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Sorteio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Sorteio> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Sorteio> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Sorteio> list = (List<Sorteio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SORTEIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SORTEIO;

				if (pagination) {
					sql = sql.concat(SorteioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Sorteio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Sorteio>(list);
				}
				else {
					list = (List<Sorteio>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sorteios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Sorteio sorteio : findAll()) {
			remove(sorteio);
		}
	}

	/**
	 * Returns the number of sorteios.
	 *
	 * @return the number of sorteios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SORTEIO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the sorteio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.br.ufpe.cin.da.salada.model.Sorteio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Sorteio>> listenersList = new ArrayList<ModelListener<Sorteio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Sorteio>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(SorteioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SORTEIO = "SELECT sorteio FROM Sorteio sorteio";
	private static final String _SQL_COUNT_SORTEIO = "SELECT COUNT(sorteio) FROM Sorteio sorteio";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sorteio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sorteio exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(SorteioPersistenceImpl.class);
	private static Sorteio _nullSorteio = new SorteioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Sorteio> toCacheModel() {
				return _nullSorteioCacheModel;
			}
		};

	private static CacheModel<Sorteio> _nullSorteioCacheModel = new CacheModel<Sorteio>() {
			@Override
			public Sorteio toEntityModel() {
				return _nullSorteio;
			}
		};
}