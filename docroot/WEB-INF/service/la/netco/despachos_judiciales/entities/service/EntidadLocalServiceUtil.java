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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the entidad local service. This utility wraps {@link la.netco.despachos_judiciales.entities.service.impl.EntidadLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see EntidadLocalService
 * @see la.netco.despachos_judiciales.entities.service.base.EntidadLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.EntidadLocalServiceImpl
 * @generated
 */
public class EntidadLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.EntidadLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the entidad to the database. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @return the entidad that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad addEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEntidad(entidad);
	}

	/**
	* Creates a new entidad with the primary key. Does not add the entidad to the database.
	*
	* @param codigo the primary key for the new entidad
	* @return the new entidad
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad createEntidad(
		int codigo) {
		return getService().createEntidad(codigo);
	}

	/**
	* Deletes the entidad with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the entidad
	* @return the entidad that was removed
	* @throws PortalException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad deleteEntidad(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEntidad(codigo);
	}

	/**
	* Deletes the entidad from the database. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @return the entidad that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad deleteEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEntidad(entidad);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static la.netco.despachos_judiciales.entities.model.Entidad fetchEntidad(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEntidad(codigo);
	}

	/**
	* Returns the entidad with the primary key.
	*
	* @param codigo the primary key of the entidad
	* @return the entidad
	* @throws PortalException if a entidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad getEntidad(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntidad(codigo);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Entidad> getEntidads(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntidads(start, end);
	}

	/**
	* Returns the number of entidads.
	*
	* @return the number of entidads
	* @throws SystemException if a system exception occurred
	*/
	public static int getEntidadsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntidadsCount();
	}

	/**
	* Updates the entidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @return the entidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad updateEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEntidad(entidad);
	}

	/**
	* Updates the entidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param entidad the entidad
	* @param merge whether to merge the entidad with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the entidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Entidad updateEntidad(
		la.netco.despachos_judiciales.entities.model.Entidad entidad,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEntidad(entidad, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static EntidadLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EntidadLocalService.class.getName());

			if (invokableLocalService instanceof EntidadLocalService) {
				_service = (EntidadLocalService)invokableLocalService;
			}
			else {
				_service = new EntidadLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EntidadLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(EntidadLocalService service) {
	}

	private static EntidadLocalService _service;
}