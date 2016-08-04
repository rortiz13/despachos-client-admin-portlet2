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

package la.netco.despachos_judiciales.entities.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import la.netco.despachos_judiciales.entities.model.Circuito;

import java.util.List;

/**
 * The persistence utility for the circuito service. This utility wraps {@link CircuitoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see CircuitoPersistence
 * @see CircuitoPersistenceImpl
 * @generated
 */
public class CircuitoUtil {
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
	public static void clearCache(Circuito circuito) {
		getPersistence().clearCache(circuito);
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
	public static List<Circuito> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Circuito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Circuito> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Circuito update(Circuito circuito, boolean merge)
		throws SystemException {
		return getPersistence().update(circuito, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Circuito update(Circuito circuito, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(circuito, merge, serviceContext);
	}

	/**
	* Caches the circuito in the entity cache if it is enabled.
	*
	* @param circuito the circuito
	*/
	public static void cacheResult(
		la.netco.despachos_judiciales.entities.model.Circuito circuito) {
		getPersistence().cacheResult(circuito);
	}

	/**
	* Caches the circuitos in the entity cache if it is enabled.
	*
	* @param circuitos the circuitos
	*/
	public static void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> circuitos) {
		getPersistence().cacheResult(circuitos);
	}

	/**
	* Creates a new circuito with the primary key. Does not add the circuito to the database.
	*
	* @param codigo the primary key for the new circuito
	* @return the new circuito
	*/
	public static la.netco.despachos_judiciales.entities.model.Circuito create(
		int codigo) {
		return getPersistence().create(codigo);
	}

	/**
	* Removes the circuito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Circuito remove(
		int codigo)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchCircuitoException {
		return getPersistence().remove(codigo);
	}

	public static la.netco.despachos_judiciales.entities.model.Circuito updateImpl(
		la.netco.despachos_judiciales.entities.model.Circuito circuito,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(circuito, merge);
	}

	/**
	* Returns the circuito with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchCircuitoException} if it could not be found.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito
	* @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Circuito findByPrimaryKey(
		int codigo)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchCircuitoException {
		return getPersistence().findByPrimaryKey(codigo);
	}

	/**
	* Returns the circuito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito, or <code>null</code> if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Circuito fetchByPrimaryKey(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(codigo);
	}

	/**
	* Returns all the circuitos.
	*
	* @return the circuitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the circuitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of circuitos
	* @param end the upper bound of the range of circuitos (not inclusive)
	* @return the range of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the circuitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of circuitos
	* @param end the upper bound of the range of circuitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the circuitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of circuitos.
	*
	* @return the number of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CircuitoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CircuitoPersistence)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					CircuitoPersistence.class.getName());

			ReferenceRegistry.registerReference(CircuitoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(CircuitoPersistence persistence) {
	}

	private static CircuitoPersistence _persistence;
}