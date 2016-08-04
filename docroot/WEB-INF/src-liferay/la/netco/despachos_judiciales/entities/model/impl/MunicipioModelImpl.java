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

import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.model.MunicipioModel;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Municipio service. Represents a row in the &quot;GLO_MUNICIPIOS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link la.netco.despachos_judiciales.entities.model.MunicipioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MunicipioImpl}.
 * </p>
 *
 * @author mariza
 * @see MunicipioImpl
 * @see la.netco.despachos_judiciales.entities.model.Municipio
 * @see la.netco.despachos_judiciales.entities.model.MunicipioModel
 * @generated
 */
public class MunicipioModelImpl extends BaseModelImpl<Municipio>
	implements MunicipioModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a municipio model instance should use the {@link la.netco.despachos_judiciales.entities.model.Municipio} interface instead.
	 */
	public static final String TABLE_NAME = "GLO_MUNICIPIOS";
	public static final Object[][] TABLE_COLUMNS = {
			{ "MUN_DEPARTAMENTO", Types.INTEGER },
			{ "MUN_CODIGO", Types.INTEGER },
			{ "MUN_NOMBRE", Types.VARCHAR },
			{ "MUN_INDICATIVO", Types.INTEGER },
			{ "MUN_CIRCUITO", Types.INTEGER },
			{ "MUN_CIRCUITO_ADM", Types.INTEGER },
			{ "MUN_CONSEJO_SEC_DIS", Types.INTEGER },
			{ "MUN_CIRCUITO_DIS", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table GLO_MUNICIPIOS (MUN_DEPARTAMENTO INTEGER not null IDENTITY,MUN_CODIGO INTEGER not null IDENTITY,MUN_NOMBRE VARCHAR(75) null,MUN_INDICATIVO INTEGER,MUN_CIRCUITO INTEGER,MUN_CIRCUITO_ADM INTEGER,MUN_CONSEJO_SEC_DIS INTEGER,MUN_CIRCUITO_DIS INTEGER,primary key (MUN_DEPARTAMENTO, MUN_CODIGO))";
	public static final String TABLE_SQL_DROP = "drop table GLO_MUNICIPIOS";
	public static final String DATA_SOURCE = "csjDespachosDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.la.netco.despachos_judiciales.entities.model.Municipio"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.la.netco.despachos_judiciales.entities.model.Municipio"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.la.netco.despachos_judiciales.entities.model.Municipio"));

	public MunicipioModelImpl() {
	}

	public MunicipioPK getPrimaryKey() {
		return new MunicipioPK(_idDepartamento, _codigo);
	}

	public void setPrimaryKey(MunicipioPK primaryKey) {
		setIdDepartamento(primaryKey.idDepartamento);
		setCodigo(primaryKey.codigo);
	}

	public Serializable getPrimaryKeyObj() {
		return new MunicipioPK(_idDepartamento, _codigo);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((MunicipioPK)primaryKeyObj);
	}

	public Class<?> getModelClass() {
		return Municipio.class;
	}

	public String getModelClassName() {
		return Municipio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idDepartamento", getIdDepartamento());
		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("indicativo", getIndicativo());
		attributes.put("idCircuito", getIdCircuito());
		attributes.put("idCircuitoAdministrativo", getIdCircuitoAdministrativo());
		attributes.put("idConsejoSeccional", getIdConsejoSeccional());
		attributes.put("idCircuitoDisciplinario", getIdCircuitoDisciplinario());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idDepartamento = (Integer)attributes.get("idDepartamento");

		if (idDepartamento != null) {
			setIdDepartamento(idDepartamento);
		}

		Integer codigo = (Integer)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Integer indicativo = (Integer)attributes.get("indicativo");

		if (indicativo != null) {
			setIndicativo(indicativo);
		}

		Integer idCircuito = (Integer)attributes.get("idCircuito");

		if (idCircuito != null) {
			setIdCircuito(idCircuito);
		}

		Integer idCircuitoAdministrativo = (Integer)attributes.get(
				"idCircuitoAdministrativo");

		if (idCircuitoAdministrativo != null) {
			setIdCircuitoAdministrativo(idCircuitoAdministrativo);
		}

		Integer idConsejoSeccional = (Integer)attributes.get(
				"idConsejoSeccional");

		if (idConsejoSeccional != null) {
			setIdConsejoSeccional(idConsejoSeccional);
		}

		Integer idCircuitoDisciplinario = (Integer)attributes.get(
				"idCircuitoDisciplinario");

		if (idCircuitoDisciplinario != null) {
			setIdCircuitoDisciplinario(idCircuitoDisciplinario);
		}
	}

	public int getIdDepartamento() {
		return _idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		_idDepartamento = idDepartamento;
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

	public int getIndicativo() {
		return _indicativo;
	}

	public void setIndicativo(int indicativo) {
		_indicativo = indicativo;
	}

	public int getIdCircuito() {
		return _idCircuito;
	}

	public void setIdCircuito(int idCircuito) {
		_idCircuito = idCircuito;
	}

	public int getIdCircuitoAdministrativo() {
		return _idCircuitoAdministrativo;
	}

	public void setIdCircuitoAdministrativo(int idCircuitoAdministrativo) {
		_idCircuitoAdministrativo = idCircuitoAdministrativo;
	}

	public int getIdConsejoSeccional() {
		return _idConsejoSeccional;
	}

	public void setIdConsejoSeccional(int idConsejoSeccional) {
		_idConsejoSeccional = idConsejoSeccional;
	}

	public int getIdCircuitoDisciplinario() {
		return _idCircuitoDisciplinario;
	}

	public void setIdCircuitoDisciplinario(int idCircuitoDisciplinario) {
		_idCircuitoDisciplinario = idCircuitoDisciplinario;
	}

	@Override
	public Municipio toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Municipio)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		MunicipioImpl municipioImpl = new MunicipioImpl();

		municipioImpl.setIdDepartamento(getIdDepartamento());
		municipioImpl.setCodigo(getCodigo());
		municipioImpl.setNombre(getNombre());
		municipioImpl.setIndicativo(getIndicativo());
		municipioImpl.setIdCircuito(getIdCircuito());
		municipioImpl.setIdCircuitoAdministrativo(getIdCircuitoAdministrativo());
		municipioImpl.setIdConsejoSeccional(getIdConsejoSeccional());
		municipioImpl.setIdCircuitoDisciplinario(getIdCircuitoDisciplinario());

		municipioImpl.resetOriginalValues();

		return municipioImpl;
	}

	public int compareTo(Municipio municipio) {
		MunicipioPK primaryKey = municipio.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Municipio municipio = null;

		try {
			municipio = (Municipio)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		MunicipioPK primaryKey = municipio.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Municipio> toCacheModel() {
		MunicipioCacheModel municipioCacheModel = new MunicipioCacheModel();

		municipioCacheModel.idDepartamento = getIdDepartamento();

		municipioCacheModel.codigo = getCodigo();

		municipioCacheModel.nombre = getNombre();

		String nombre = municipioCacheModel.nombre;

		if ((nombre != null) && (nombre.length() == 0)) {
			municipioCacheModel.nombre = null;
		}

		municipioCacheModel.indicativo = getIndicativo();

		municipioCacheModel.idCircuito = getIdCircuito();

		municipioCacheModel.idCircuitoAdministrativo = getIdCircuitoAdministrativo();

		municipioCacheModel.idConsejoSeccional = getIdConsejoSeccional();

		municipioCacheModel.idCircuitoDisciplinario = getIdCircuitoDisciplinario();

		return municipioCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{idDepartamento=");
		sb.append(getIdDepartamento());
		sb.append(", codigo=");
		sb.append(getCodigo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", indicativo=");
		sb.append(getIndicativo());
		sb.append(", idCircuito=");
		sb.append(getIdCircuito());
		sb.append(", idCircuitoAdministrativo=");
		sb.append(getIdCircuitoAdministrativo());
		sb.append(", idConsejoSeccional=");
		sb.append(getIdConsejoSeccional());
		sb.append(", idCircuitoDisciplinario=");
		sb.append(getIdCircuitoDisciplinario());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Municipio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idDepartamento</column-name><column-value><![CDATA[");
		sb.append(getIdDepartamento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>indicativo</column-name><column-value><![CDATA[");
		sb.append(getIndicativo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCircuito</column-name><column-value><![CDATA[");
		sb.append(getIdCircuito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCircuitoAdministrativo</column-name><column-value><![CDATA[");
		sb.append(getIdCircuitoAdministrativo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idConsejoSeccional</column-name><column-value><![CDATA[");
		sb.append(getIdConsejoSeccional());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCircuitoDisciplinario</column-name><column-value><![CDATA[");
		sb.append(getIdCircuitoDisciplinario());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Municipio.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Municipio.class
		};
	private int _idDepartamento;
	private int _codigo;
	private String _nombre;
	private int _indicativo;
	private int _idCircuito;
	private int _idCircuitoAdministrativo;
	private int _idConsejoSeccional;
	private int _idCircuitoDisciplinario;
	private Municipio _escapedModelProxy;
}