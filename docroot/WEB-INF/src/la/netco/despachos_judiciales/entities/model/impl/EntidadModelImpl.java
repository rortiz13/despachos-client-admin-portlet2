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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.EntidadModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Entidad service. Represents a row in the &quot;GLO_ENTIDADES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link la.netco.despachos_judiciales.entities.model.EntidadModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EntidadImpl}.
 * </p>
 *
 * @author mariza
 * @see EntidadImpl
 * @see la.netco.despachos_judiciales.entities.model.Entidad
 * @see la.netco.despachos_judiciales.entities.model.EntidadModel
 * @generated
 */
public class EntidadModelImpl extends BaseModelImpl<Entidad>
	implements EntidadModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a entidad model instance should use the {@link la.netco.despachos_judiciales.entities.model.Entidad} interface instead.
	 */
	public static final String TABLE_NAME = "GLO_ENTIDADES";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ENT_CODIGO", Types.INTEGER },
			{ "ENT_NOMBRE", Types.VARCHAR },
			{ "ENT_MASCARA", Types.VARCHAR },
			{ "ENT_JURISDICCION", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GLO_ENTIDADES (ENT_CODIGO INTEGER not null primary key,ENT_NOMBRE VARCHAR(75) null,ENT_MASCARA VARCHAR(75) null,ENT_JURISDICCION VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GLO_ENTIDADES";
	public static final String DATA_SOURCE = "csjDespachosDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.la.netco.despachos_judiciales.entities.model.Entidad"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.la.netco.despachos_judiciales.entities.model.Entidad"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.la.netco.despachos_judiciales.entities.model.Entidad"));

	public EntidadModelImpl() {
	}

	public int getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(int primaryKey) {
		setCodigo(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_codigo);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return Entidad.class;
	}

	public String getModelClassName() {
		return Entidad.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("mascara", getMascara());
		attributes.put("jurisdiccion", getJurisdiccion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer codigo = (Integer)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String mascara = (String)attributes.get("mascara");

		if (mascara != null) {
			setMascara(mascara);
		}

		String jurisdiccion = (String)attributes.get("jurisdiccion");

		if (jurisdiccion != null) {
			setJurisdiccion(jurisdiccion);
		}
	}

	public int getCodigo() {
		return _codigo;
	}

	public void setCodigo(int codigo) {
		_codigo = codigo;
	}

	public String getNombre() {
		if (_nombre == null) {
			return StringPool.BLANK;
		}
		else {
			return _nombre;
		}
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getMascara() {
		if (_mascara == null) {
			return StringPool.BLANK;
		}
		else {
			return _mascara;
		}
	}

	public void setMascara(String mascara) {
		_mascara = mascara;
	}

	public String getJurisdiccion() {
		if (_jurisdiccion == null) {
			return StringPool.BLANK;
		}
		else {
			return _jurisdiccion;
		}
	}

	public void setJurisdiccion(String jurisdiccion) {
		_jurisdiccion = jurisdiccion;
	}

	@Override
	public Entidad toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Entidad)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		EntidadImpl entidadImpl = new EntidadImpl();

		entidadImpl.setCodigo(getCodigo());
		entidadImpl.setNombre(getNombre());
		entidadImpl.setMascara(getMascara());
		entidadImpl.setJurisdiccion(getJurisdiccion());

		entidadImpl.resetOriginalValues();

		return entidadImpl;
	}

	public int compareTo(Entidad entidad) {
		int primaryKey = entidad.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Entidad entidad = null;

		try {
			entidad = (Entidad)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = entidad.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Entidad> toCacheModel() {
		EntidadCacheModel entidadCacheModel = new EntidadCacheModel();

		entidadCacheModel.codigo = getCodigo();

		entidadCacheModel.nombre = getNombre();

		String nombre = entidadCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			entidadCacheModel.nombre = null;
		}

		entidadCacheModel.mascara = getMascara();

		String mascara = entidadCacheModel.mascara;

		if ((mascara != null) && (mascara.length() == 0)) {
			entidadCacheModel.mascara = null;
		}

		entidadCacheModel.jurisdiccion = getJurisdiccion();

		String jurisdiccion = entidadCacheModel.jurisdiccion;

		if ((jurisdiccion != null) && (jurisdiccion.length() == 0)) {
			entidadCacheModel.jurisdiccion = null;
		}

		return entidadCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{codigo=");
		sb.append(getCodigo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", mascara=");
		sb.append(getMascara());
		sb.append(", jurisdiccion=");
		sb.append(getJurisdiccion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Entidad");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mascara</column-name><column-value><![CDATA[");
		sb.append(getMascara());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jurisdiccion</column-name><column-value><![CDATA[");
		sb.append(getJurisdiccion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Entidad.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Entidad.class
		};
	private int _codigo;
	private String _nombre;
	private String _mascara;
	private String _jurisdiccion;
	private Entidad _escapedModelProxy;
}