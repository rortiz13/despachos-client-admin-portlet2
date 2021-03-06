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
 * The utility for the especialidad local service. This utility wraps {@link la.netco.despachos_judiciales.entities.service.impl.EspecialidadLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see EspecialidadLocalService
 * @see la.netco.despachos_judiciales.entities.service.base.EspecialidadLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.EspecialidadLocalServiceImpl
 * @generated
 */
public class EspecialidadLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.EspecialidadLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the especialidad to the database. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @return the especialidad that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad addEspecialidad(
		la.netco.despachos_judiciales.entities.model.Especialidad especialidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addEspecialidad(especialidad);
	}

	/**
	* Creates a new especialidad with the primary key. Does not add the especialidad to the database.
	*
	* @param codigo the primary key for the new especialidad
	* @return the new especialidad
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad createEspecialidad(
		int codigo) {
		return getService().createEspecialidad(codigo);
	}

	/**
	* Deletes the especialidad with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the especialidad
	* @return the especialidad that was removed
	* @throws PortalException if a especialidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad deleteEspecialidad(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEspecialidad(codigo);
	}

	/**
	* Deletes the especialidad from the database. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @return the especialidad that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad deleteEspecialidad(
		la.netco.despachos_judiciales.entities.model.Especialidad especialidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEspecialidad(especialidad);
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

	public static la.netco.despachos_judiciales.entities.model.Especialidad fetchEspecialidad(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchEspecialidad(codigo);
	}

	/**
	* Returns the especialidad with the primary key.
	*
	* @param codigo the primary key of the especialidad
	* @return the especialidad
	* @throws PortalException if a especialidad with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad getEspecialidad(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getEspecialidad(codigo);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the especialidads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of especialidads
	* @param end the upper bound of the range of especialidads (not inclusive)
	* @return the range of especialidads
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Especialidad> getEspecialidads(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEspecialidads(start, end);
	}

	/**
	* Returns the number of especialidads.
	*
	* @return the number of especialidads
	* @throws SystemException if a system exception occurred
	*/
	public static int getEspecialidadsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEspecialidadsCount();
	}

	/**
	* Updates the especialidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @return the especialidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad updateEspecialidad(
		la.netco.despachos_judiciales.entities.model.Especialidad especialidad)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEspecialidad(especialidad);
	}

	/**
	* Updates the especialidad in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param especialidad the especialidad
	* @param merge whether to merge the especialidad with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the especialidad that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Especialidad updateEspecialidad(
		la.netco.despachos_judiciales.entities.model.Especialidad especialidad,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateEspecialidad(especialidad, merge);
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

	public static EspecialidadLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EspecialidadLocalService.class.getName());

			if (invokableLocalService instanceof EspecialidadLocalService) {
				_service = (EspecialidadLocalService)invokableLocalService;
			}
			else {
				_service = new EspecialidadLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(EspecialidadLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(EspecialidadLocalService service) {
	}

	private static EspecialidadLocalService _service;
}