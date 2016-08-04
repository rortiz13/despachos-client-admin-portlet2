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

package la.netco.despachos_judiciales.entities.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link EntidadLocalService}.
 * </p>
 *
 * @author    mariza
 * @see       EntidadLocalService
 * @generated
 */
public class EntidadLocalServiceWrapper implements EntidadLocalService,
	ServiceWrapper<EntidadLocalService> {
	public EntidadLocalServiceWrapper(EntidadLocalService entidadLocalService) {
		_entidadLocalService = entidadLocalService;
	}

	/**
	* Adds the entidad to the database. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @return the entidad that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad addEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.addEntidad(entidad);
	}

	/**
	* Creates a new entidad with the primary key. Does not add the entidad to the database.
	*
	* @param codigo the primary key for the new entidad
	* @return the new entidad
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad createEntidad(
		int codigo) {
		return _entidadLocalService.createEntidad(codigo);
	}

	/**
	* Deletes the entidad with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the entidad
	* @return the entidad that was removed
	* @throws PortalException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad deleteEntidad(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.deleteEntidad(codigo);
	}

	/**
	* Deletes the entidad from the database. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @return the entidad that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad deleteEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.deleteEntidad(entidad);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _entidadLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.despachos_judiciales.entities.model.Entidad fetchEntidad(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.fetchEntidad(codigo);
	}

	/**
	* Returns the entidad with the primary key.
	*
	* @param codigo the primary key of the entidad
	* @return the entidad
	* @throws PortalException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad getEntidad(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.getEntidad(codigo);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the entidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entidads
	* @param end the upper bound of the range of entidads (not inclusive)
	* @return the range of entidads
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Entidad> getEntidads(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.getEntidads(start, end);
	}

	/**
	* Returns the number of entidads.
	*
	* @return the number of entidads
	* @throws SystemException if a system exception occurred
	*/
	public int getEntidadsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.getEntidadsCount();
	}

	/**
	* Updates the entidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @return the entidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad updateEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.updateEntidad(entidad);
	}

	/**
	* Updates the entidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @param merge whether to merge the entidad with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the entidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Entidad updateEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _entidadLocalService.updateEntidad(entidad, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _entidadLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_entidadLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _entidadLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public EntidadLocalService getWrappedEntidadLocalService() {
		return _entidadLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedEntidadLocalService(
		EntidadLocalService entidadLocalService) {
		_entidadLocalService = entidadLocalService;
	}

	public EntidadLocalService getWrappedService() {
		return _entidadLocalService;
	}

	public void setWrappedService(EntidadLocalService entidadLocalService) {
		_entidadLocalService = entidadLocalService;
	}

	private EntidadLocalService _entidadLocalService;
}