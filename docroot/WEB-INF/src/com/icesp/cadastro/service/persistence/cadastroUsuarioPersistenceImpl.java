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

import com.icesp.cadastro.NoSuchcadastroUsuarioException;
import com.icesp.cadastro.model.cadastroUsuario;
import com.icesp.cadastro.model.impl.cadastroUsuarioImpl;
import com.icesp.cadastro.model.impl.cadastroUsuarioModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cadastro usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ln00704
 * @see cadastroUsuarioPersistence
 * @see cadastroUsuarioUtil
 * @generated
 */
public class cadastroUsuarioPersistenceImpl extends BasePersistenceImpl<cadastroUsuario>
	implements cadastroUsuarioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cadastroUsuarioUtil} to access the cadastro usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cadastroUsuarioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			cadastroUsuarioModelImpl.FINDER_CACHE_ENABLED,
			cadastroUsuarioImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			cadastroUsuarioModelImpl.FINDER_CACHE_ENABLED,
			cadastroUsuarioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			cadastroUsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the cadastro usuario in the entity cache if it is enabled.
	 *
	 * @param cadastroUsuario the cadastro usuario
	 */
	public void cacheResult(cadastroUsuario cadastroUsuario) {
		EntityCacheUtil.putResult(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			cadastroUsuarioImpl.class, cadastroUsuario.getPrimaryKey(),
			cadastroUsuario);

		cadastroUsuario.resetOriginalValues();
	}

	/**
	 * Caches the cadastro usuarios in the entity cache if it is enabled.
	 *
	 * @param cadastroUsuarios the cadastro usuarios
	 */
	public void cacheResult(List<cadastroUsuario> cadastroUsuarios) {
		for (cadastroUsuario cadastroUsuario : cadastroUsuarios) {
			if (EntityCacheUtil.getResult(
						cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						cadastroUsuarioImpl.class,
						cadastroUsuario.getPrimaryKey()) == null) {
				cacheResult(cadastroUsuario);
			}
			else {
				cadastroUsuario.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cadastro usuarios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(cadastroUsuarioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(cadastroUsuarioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cadastro usuario.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cadastroUsuario cadastroUsuario) {
		EntityCacheUtil.removeResult(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			cadastroUsuarioImpl.class, cadastroUsuario.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cadastroUsuario> cadastroUsuarios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cadastroUsuario cadastroUsuario : cadastroUsuarios) {
			EntityCacheUtil.removeResult(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				cadastroUsuarioImpl.class, cadastroUsuario.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cadastro usuario with the primary key. Does not add the cadastro usuario to the database.
	 *
	 * @param cpf the primary key for the new cadastro usuario
	 * @return the new cadastro usuario
	 */
	public cadastroUsuario create(String cpf) {
		cadastroUsuario cadastroUsuario = new cadastroUsuarioImpl();

		cadastroUsuario.setNew(true);
		cadastroUsuario.setPrimaryKey(cpf);

		return cadastroUsuario;
	}

	/**
	 * Removes the cadastro usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cpf the primary key of the cadastro usuario
	 * @return the cadastro usuario that was removed
	 * @throws com.icesp.cadastro.NoSuchcadastroUsuarioException if a cadastro usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public cadastroUsuario remove(String cpf)
		throws NoSuchcadastroUsuarioException, SystemException {
		return remove((Serializable)cpf);
	}

	/**
	 * Removes the cadastro usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cadastro usuario
	 * @return the cadastro usuario that was removed
	 * @throws com.icesp.cadastro.NoSuchcadastroUsuarioException if a cadastro usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cadastroUsuario remove(Serializable primaryKey)
		throws NoSuchcadastroUsuarioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			cadastroUsuario cadastroUsuario = (cadastroUsuario)session.get(cadastroUsuarioImpl.class,
					primaryKey);

			if (cadastroUsuario == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcadastroUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cadastroUsuario);
		}
		catch (NoSuchcadastroUsuarioException nsee) {
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
	protected cadastroUsuario removeImpl(cadastroUsuario cadastroUsuario)
		throws SystemException {
		cadastroUsuario = toUnwrappedModel(cadastroUsuario);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, cadastroUsuario);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(cadastroUsuario);

		return cadastroUsuario;
	}

	@Override
	public cadastroUsuario updateImpl(
		com.icesp.cadastro.model.cadastroUsuario cadastroUsuario, boolean merge)
		throws SystemException {
		cadastroUsuario = toUnwrappedModel(cadastroUsuario);

		boolean isNew = cadastroUsuario.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, cadastroUsuario, merge);

			cadastroUsuario.setNew(false);
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

		EntityCacheUtil.putResult(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
			cadastroUsuarioImpl.class, cadastroUsuario.getPrimaryKey(),
			cadastroUsuario);

		return cadastroUsuario;
	}

	protected cadastroUsuario toUnwrappedModel(cadastroUsuario cadastroUsuario) {
		if (cadastroUsuario instanceof cadastroUsuarioImpl) {
			return cadastroUsuario;
		}

		cadastroUsuarioImpl cadastroUsuarioImpl = new cadastroUsuarioImpl();

		cadastroUsuarioImpl.setNew(cadastroUsuario.isNew());
		cadastroUsuarioImpl.setPrimaryKey(cadastroUsuario.getPrimaryKey());

		cadastroUsuarioImpl.setCpf(cadastroUsuario.getCpf());
		cadastroUsuarioImpl.setRg(cadastroUsuario.getRg());
		cadastroUsuarioImpl.setNome(cadastroUsuario.getNome());
		cadastroUsuarioImpl.setUserName(cadastroUsuario.getUserName());
		cadastroUsuarioImpl.setSobrenome(cadastroUsuario.getSobrenome());
		cadastroUsuarioImpl.setEmail(cadastroUsuario.getEmail());
		cadastroUsuarioImpl.setEmailconfir(cadastroUsuario.getEmailconfir());
		cadastroUsuarioImpl.setSenha(cadastroUsuario.getSenha());
		cadastroUsuarioImpl.setSenhaconfir(cadastroUsuario.getSenhaconfir());
		cadastroUsuarioImpl.setCelular(cadastroUsuario.getCelular());
		cadastroUsuarioImpl.setSexo(cadastroUsuario.getSexo());
		cadastroUsuarioImpl.setDate(cadastroUsuario.getDate());
		cadastroUsuarioImpl.setCep(cadastroUsuario.getCep());
		cadastroUsuarioImpl.setEstado(cadastroUsuario.getEstado());
		cadastroUsuarioImpl.setCidade(cadastroUsuario.getCidade());
		cadastroUsuarioImpl.setRua(cadastroUsuario.getRua());
		cadastroUsuarioImpl.setProfissao(cadastroUsuario.getProfissao());
		cadastroUsuarioImpl.setHospital(cadastroUsuario.getHospital());

		return cadastroUsuarioImpl;
	}

	/**
	 * Returns the cadastro usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cadastro usuario
	 * @return the cadastro usuario
	 * @throws com.liferay.portal.NoSuchModelException if a cadastro usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cadastroUsuario findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the cadastro usuario with the primary key or throws a {@link com.icesp.cadastro.NoSuchcadastroUsuarioException} if it could not be found.
	 *
	 * @param cpf the primary key of the cadastro usuario
	 * @return the cadastro usuario
	 * @throws com.icesp.cadastro.NoSuchcadastroUsuarioException if a cadastro usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public cadastroUsuario findByPrimaryKey(String cpf)
		throws NoSuchcadastroUsuarioException, SystemException {
		cadastroUsuario cadastroUsuario = fetchByPrimaryKey(cpf);

		if (cadastroUsuario == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + cpf);
			}

			throw new NoSuchcadastroUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				cpf);
		}

		return cadastroUsuario;
	}

	/**
	 * Returns the cadastro usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cadastro usuario
	 * @return the cadastro usuario, or <code>null</code> if a cadastro usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public cadastroUsuario fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the cadastro usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cpf the primary key of the cadastro usuario
	 * @return the cadastro usuario, or <code>null</code> if a cadastro usuario with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public cadastroUsuario fetchByPrimaryKey(String cpf)
		throws SystemException {
		cadastroUsuario cadastroUsuario = (cadastroUsuario)EntityCacheUtil.getResult(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
				cadastroUsuarioImpl.class, cpf);

		if (cadastroUsuario == _nullcadastroUsuario) {
			return null;
		}

		if (cadastroUsuario == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				cadastroUsuario = (cadastroUsuario)session.get(cadastroUsuarioImpl.class,
						cpf);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (cadastroUsuario != null) {
					cacheResult(cadastroUsuario);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(cadastroUsuarioModelImpl.ENTITY_CACHE_ENABLED,
						cadastroUsuarioImpl.class, cpf, _nullcadastroUsuario);
				}

				closeSession(session);
			}
		}

		return cadastroUsuario;
	}

	/**
	 * Returns all the cadastro usuarios.
	 *
	 * @return the cadastro usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public List<cadastroUsuario> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<cadastroUsuario> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<cadastroUsuario> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<cadastroUsuario> list = (List<cadastroUsuario>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CADASTROUSUARIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CADASTROUSUARIO.concat(cadastroUsuarioModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<cadastroUsuario>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<cadastroUsuario>)QueryUtil.list(q,
							getDialect(), start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cadastro usuarios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (cadastroUsuario cadastroUsuario : findAll()) {
			remove(cadastroUsuario);
		}
	}

	/**
	 * Returns the number of cadastro usuarios.
	 *
	 * @return the number of cadastro usuarios
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CADASTROUSUARIO);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the cadastro usuario persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.icesp.cadastro.model.cadastroUsuario")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<cadastroUsuario>> listenersList = new ArrayList<ModelListener<cadastroUsuario>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<cadastroUsuario>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(cadastroUsuarioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = cadastroUsuarioPersistence.class)
	protected cadastroUsuarioPersistence cadastroUsuarioPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_CADASTROUSUARIO = "SELECT cadastroUsuario FROM cadastroUsuario cadastroUsuario";
	private static final String _SQL_COUNT_CADASTROUSUARIO = "SELECT COUNT(cadastroUsuario) FROM cadastroUsuario cadastroUsuario";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cadastroUsuario.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cadastroUsuario exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(cadastroUsuarioPersistenceImpl.class);
	private static cadastroUsuario _nullcadastroUsuario = new cadastroUsuarioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cadastroUsuario> toCacheModel() {
				return _nullcadastroUsuarioCacheModel;
			}
		};

	private static CacheModel<cadastroUsuario> _nullcadastroUsuarioCacheModel = new CacheModel<cadastroUsuario>() {
			public cadastroUsuario toEntityModel() {
				return _nullcadastroUsuario;
			}
		};
}