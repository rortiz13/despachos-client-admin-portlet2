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

package la.netco.despachos_judiciales.entities.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;

/**
 * The extended model base implementation for the ConsejoSeccional service. Represents a row in the &quot;GLO_CONSEJOS_SEC&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConsejoSeccionalImpl}.
 * </p>
 *
 * @author mariza
 * @see ConsejoSeccionalImpl
 * @see la.netco.despachos_judiciales.entities.model.ConsejoSeccional
 * @generated
 */
public abstract class ConsejoSeccionalBaseImpl extends ConsejoSeccionalModelImpl
	implements ConsejoSeccional {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a consejo seccional model instance should use the {@link ConsejoSeccional} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			ConsejoSeccionalLocalServiceUtil.addConsejoSeccional(this);
		}
		else {
			ConsejoSeccionalLocalServiceUtil.updateConsejoSeccional(this);
		}
	}
}