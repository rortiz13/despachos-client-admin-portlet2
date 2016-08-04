package la.netco.despachos_judiciales.publico.business.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletResponse;

import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.publico.business.bean.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.publico.business.datamodels.DespachosDataModel;
import la.netco.despachos_judiciales.utilitys.DespachoWrapper;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.primefaces.model.StreamedContent;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.util.PortalUtil;

@ManagedBean(name = "consultaBasicaBean")
@ViewScoped
public class ConsultaBasicaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(ConsultaBasicaBean.class);

	private List<SelectItem> itemsMunicipios;
	private List<SelectItem> itemsEntidad;
	private List<SelectItem> itemsEspecialidad;
	private HashMap<Integer, String> mapDepartamentos;

	private Integer idDepartamento, idMunicipio, idEspecialidad, idEntidad;
	private String departamentoMunicipio;

	private DespachosDataModel despachos;

	private boolean preRenderFlag;

	public ConsultaBasicaBean() {
		
	}

	@PostConstruct
	public void init() {
		System.out.println(">>> init");
		loadItemsMunicipios();
		loadItemsEntidad();
		loadItemsEspecialidad();
	}

	public void municipioChange() {
		idEntidad = null;
		idEspecialidad = null;
		System.out.println("--> Cambio Municipio" + departamentoMunicipio);
		splitMunicipioDepartamento();
		loadItemsEntidad();
		loadItemsEspecialidad();

	}

	public void entidadChange() {
		idEspecialidad = null;
		loadItemsEspecialidad();

	}

	public void cleanForm() {
		idEspecialidad = null;
		idEntidad = null;
		idDepartamento = null;
		idMunicipio = null;
		departamentoMunicipio = null;
		despachos = null;
		loadItemsMunicipios();
		loadItemsEntidad();
		loadItemsEspecialidad();
	}

	private void loadItemsMunicipios() {
		try {

			if (mapDepartamentos == null) {
				mapDepartamentos = new HashMap<Integer, String>();
				List<Departamento> listDepartamentos = DepartamentoLocalServiceUtil.getDepartamentos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				for (Departamento departamento : listDepartamentos) {
					mapDepartamentos.put(departamento.getCodigo(), departamento.getNombre());
				}

			}
			System.out.println("--> size Departamentos " + mapDepartamentos.size());
			List<Municipio> listMunicipios = MunicipioLocalServiceUtil.findByEstadoDescpacho(null);
			itemsMunicipios = new ArrayList<SelectItem>();
			System.out.println("--> size minicipios: " + listMunicipios.size());
			for (Municipio municipio : listMunicipios) {
				itemsMunicipios.add(new SelectItem(municipio.getCodigo() + "-" + municipio.getIdDepartamento(), municipio.getNombre() + " - "
						+ mapDepartamentos.get(municipio.getIdDepartamento()).toString()));
			}
			System.out.println("--> size items Municipio: " + itemsMunicipios.size());

		} catch (Exception e) {
			_log.error("Exception loadItemsMunicipios", e);
		}

	}

	private void loadItemsEntidad() {
		try {
			itemsEntidad = new ArrayList<SelectItem>();
			List<Entidad> listEntidades = EntidadLocalServiceUtil.findByEstadoDescpacho(idDepartamento, idMunicipio);
			System.out.println("--> size Lista entidades: " + listEntidades.size());
			for (Entidad entidad : listEntidades) {
				itemsEntidad.add(new SelectItem(entidad.getCodigo(), entidad.getNombre()));
			}
			System.out.println("--> size Lista Itemsentidades: " + itemsEntidad.size());
		} catch (Exception e) {
			_log.error("Exception loadItemsEntidad", e);
		}
	}

	private void loadItemsEspecialidad() {
		try {
			itemsEspecialidad = new ArrayList<SelectItem>();
			List<Especialidad> listEspecialidad = EspecialidadLocalServiceUtil.findByEstadoDescpacho(idDepartamento, idMunicipio, idEntidad);
			System.out.println("--> size Lista Especialidad: " + listEspecialidad.size());
			for (Especialidad especialidad : listEspecialidad) {
				itemsEspecialidad.add(new SelectItem(especialidad.getCodigo(), especialidad.getNombre()));
			}
			System.out.println("--> size Lista Especialidad: " + itemsEspecialidad.size());
		} catch (Exception e) {
			_log.error("Exception loadItemsEspecialidad", e);
		}

	}

	private void splitMunicipioDepartamento() {
		System.out.println("--> Valor departamentoMunicipio " + departamentoMunicipio);
		if (departamentoMunicipio != null) {
			String valores[] = departamentoMunicipio.split("-");
			System.out.println("--> valores size: " + valores.length);
			idMunicipio = Integer.parseInt(valores[0]);
			idDepartamento = Integer.parseInt(valores[1]);
		} else {
			idMunicipio = null;
			idDepartamento = null;
		}
	}

	/* Metodos datamodel */

	public String cargaFiltrosDataModel() {
		if (despachos == null)
			despachos = new DespachosDataModel();

		Map<String, Integer> filtros = new HashMap<String, Integer>();

		filtros.put(ConstantsUtility.FIELD_ID_DEPARTAMENTO, idDepartamento);
		filtros.put(ConstantsUtility.FIELD_ID_MUNICIPIO, idMunicipio);
		filtros.put(ConstantsUtility.FIELD_ID_ENTIDAD, idEntidad);
		filtros.put(ConstantsUtility.FIELD_ID_ESPECIALIDAD, idEspecialidad);
		filtros.put(ConstantsUtility.FIELD_ID_CIRCUITO, null);
		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, null);
		filtros.put(ConstantsUtility.FIELD_ID_DISTRTO, null);

		System.out.println("--> Valor idDepartamento " + idDepartamento);
		System.out.println("--> Valor idmunicipio " + idMunicipio);
		System.out.println("--> Valor idEntidad " + idEntidad);
		System.out.println("--> Valor idEspecialidad " + idEspecialidad);

		despachos.setFiltros(filtros);
		return "";

	}
	
	public void xls() throws IOException, PortalException, SystemException{
		Workbook libro = new HSSFWorkbook();

//		A�adir una hoja al libro:
		Sheet hoja = libro.createSheet("Despachos");
		System.out.println("**begin XLS");
		int i=0;
	    System.out.println("numero total de paginas"+despachos.getRowCount());		
		System.out.println("tt :"+despachos.getRowData(""));
		System.out.println("pagina :"+despachos.getRowIndex());
		
		for(DespachoWrapper despacho:despachos){
			
			System.out.println("**fila "+despachos.getRowIndex());
		
//			Crear una fila:
			Row fila = hoja.createRow(i);
//			Se accede a la celda 2 de la fila 1:
			String codigo="",nombre="", municipio="",dpto="",circuito="",distrito="",direccion="",telf="",trabN="",trabA="",hora="";
			
			if(null!=despacho.getCodigo()){codigo=despacho.getCodigo();}
			System.out.println(codigo);
			if(null!=despacho.getNombre()){nombre=despacho.getNombre();}
//			System.out.println(nombre);
			if(null!=despacho.getMunicipio().getNombre()){municipio=despacho.getMunicipio().getNombre();}
//			System.out.println(municipio);
			if(null!=despacho.getDepartamento().getNombre()){dpto=despacho.getDepartamento().getNombre();}
//			System.out.println(dpto);
			if(null!=despacho.getCircuito().getNombre()){circuito=despacho.getCircuito().getNombre();}
//			System.out.println(circuito);
			if(null!=despacho.getDistrito().getNombre()){distrito=despacho.getDistrito().getNombre();}
//			System.out.println(distrito);
			if(null!=despacho.getDireccion()){direccion=despacho.getDireccion();}
//			System.out.println(direccion);
			if(null!=despacho.getTelefonos()){telf=despacho.getTelefonos();}
//			if(null!=despacho.getTrabajador().getNombres()){trabN=despacho.getTrabajador().getNombres();}
//			System.out.println(trabN);
//			if(null!=despacho.getTrabajador().getApellidos()){trabA=despacho.getTrabajador().getApellidos();}
//			System.out.println(trabA);
			if(null!=despacho.getHorario_atencion()){hora=despacho.getHorario_atencion();}
//			System.out.println(hora);
			
			
			Cell filaCodigo = fila.createCell(0);
			filaCodigo.setCellValue(codigo);
			Cell filaNombre = fila.createCell(1);
			filaNombre.setCellValue(nombre);
			Cell filaMunicipio = fila.createCell(2);
			filaMunicipio.setCellValue(municipio+" "+dpto);
			Cell filaCircuito = fila.createCell(3);
			filaCircuito.setCellValue(circuito);
			Cell filaDistrito = fila.createCell(4);
			filaDistrito.setCellValue(distrito);
			Cell filaDireccion = fila.createCell(5);
			filaDireccion.setCellValue(direccion);
			Cell filaTelefono = fila.createCell(6);
			filaTelefono.setCellValue(telf);
			Cell filaTrabajador = fila.createCell(7);
			filaTrabajador.setCellValue(trabN+" - "+trabA);
			Cell filaHorario = fila.createCell(8);
			filaHorario.setCellValue(hora);
			i++;
			if(despachos.getRowCount()==i)
				break;
			
		}
		System.out.println("finish XLS");
//		Una vez todo guardamos el libro:
		OutputStream output = new FileOutputStream("prueba.xls");
		libro.write(output);
		output.close();
	}
	
	public StreamedContent getFile() throws Exception {  
		 
		 xls();
		// 1. initialize the fileInputStream
   	 File localfile = new File("prueba.xls");
   	 FileInputStream fis = new FileInputStream(localfile);

   	 // 2. get Liferay's ServletResponse
   	 PortletResponse portletResponse = (PortletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
   	 HttpServletResponse res = PortalUtil.getHttpServletResponse(portletResponse);
   	 res.setHeader("Content-Disposition", "attachment; filename=\""+"Despachos.xls\"");
   	 res.setHeader("Content-Transfer-Encoding", "binary");
   	 res.setContentType("application/octet-stream");
   	 res.flushBuffer();

   	 // 3. write the file into the outputStream
   	 OutputStream out = res.getOutputStream();
   	 byte[] buffer = new byte[4096];
   	 int bytesRead;
   	 while ((bytesRead = fis.read(buffer)) != -1) {
   	  out.write(buffer, 0, bytesRead);
   	  buffer = new byte[4096];
   	 }

   	 // 4. return null to this method
   	 return null;
	    	
		

	    } 

	/**/
	public List<SelectItem> getItemsMunicipios() {
		return itemsMunicipios;
	}

	public void setItemsMunicipios(List<SelectItem> itemsMunicipios) {
		this.itemsMunicipios = itemsMunicipios;
	}

	public List<SelectItem> getItemsEntidad() {
		return itemsEntidad;
	}

	public void setItemsEntidad(List<SelectItem> itemsEntidad) {
		this.itemsEntidad = itemsEntidad;
	}

	public List<SelectItem> getItemsEspecialidad() {
		return itemsEspecialidad;
	}

	public void setItemsEspecialidad(List<SelectItem> itemsEspecialidad) {
		this.itemsEspecialidad = itemsEspecialidad;
	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public Integer getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Integer idEntidad) {
		this.idEntidad = idEntidad;
	}

	public HashMap<Integer, String> getMapDepartamentos() {
		return mapDepartamentos;
	}

	public String getDepartamentoMunicipio() {
		return departamentoMunicipio;
	}

	public void setDepartamentoMunicipio(String departamentoMunicipio) {
		this.departamentoMunicipio = departamentoMunicipio;
	}

	public void setMapDepartamentos(HashMap<Integer, String> mapDepartamentos) {
		this.mapDepartamentos = mapDepartamentos;
	}

	public DespachosDataModel getDespachos() {
		return despachos;
	}

	public void setDespachos(DespachosDataModel despachos) {
		this.despachos = despachos;
	}

	public boolean isPreRenderFlag() {
		return preRenderFlag;
	}

	public void setPreRenderFlag(boolean preRenderFlag) {
		this.preRenderFlag = preRenderFlag;
	}

}
