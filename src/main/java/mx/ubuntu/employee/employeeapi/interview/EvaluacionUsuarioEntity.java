package mx.ubuntu.employee.employeeapi.interview;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



/**
 * The persistent class for the UATT_EVALUACION_USUARIO database table.
 * 
 */
@Entity
//@Table(schema="DEALERS", name="UATT_EVALUACION_USUARIO")
public class EvaluacionUsuarioEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="ESTATUS_EVALUACION_ID")
	private Long estatusEvaluacionId;

	@Column(name="EVALUACION_ID")
	private Long evaluacionId;

	@Temporal(TemporalType.DATE)
	@Column(name="FD_FECHA_CREACION", insertable = false, updatable = false)
	private Date fdFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FD_FECHA_FIN")
	private Date fdFechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="FD_FECHA_INICIO")
	private Date fdFechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FD_FECHA_MODIFICACION")
	private Date fdFechaModificacion;

	@Column(name="FI_ACTIVA")
	private Integer fiActiva;

	@Column(name="FI_ADMIN_CREACION")
	private BigDecimal fiAdminCreacion;

	@Column(name="FI_ADMIN_MODIFICACION")
	private BigDecimal fiAdminModificacion;

	@Column(name="FI_APROBADA")
	private Integer fiAprobada;

	@Column(name="FI_NUM_INTENTO")
	private Integer fiNumIntento;

	@Column(name="FI_CALIFICACION")
	private Integer fiCalificacion;

	@Column(name="FI_RESULTADO")
	private Integer fiResultado;

	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="FI_INTENTOS_EXTRA", insertable = false)
	private Integer fiIntentosExtra;

	public EvaluacionUsuarioEntity() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEstatusEvaluacionId() {
		return this.estatusEvaluacionId;
	}

	public void setEstatusEvaluacionId(Long estatusEvaluacionId) {
		this.estatusEvaluacionId = estatusEvaluacionId;
	}

	public Long getEvaluacionId() {
		return this.evaluacionId;
	}

	public void setEvaluacionId(Long evaluacionId) {
		this.evaluacionId = evaluacionId;
	}

	public Date getFdFechaCreacion() {
		return this.fdFechaCreacion;
	}

	public void setFdFechaCreacion(Date fdFechaCreacion) {
		this.fdFechaCreacion = fdFechaCreacion;
	}

	public Date getFdFechaFin() {
		return this.fdFechaFin;
	}

	public void setFdFechaFin(Date fdFechaFin) {
		this.fdFechaFin = fdFechaFin;
	}

	public Date getFdFechaInicio() {
		return this.fdFechaInicio;
	}

	public void setFdFechaInicio(Date fdFechaInicio) {
		this.fdFechaInicio = fdFechaInicio;
	}

	public Date getFdFechaModificacion() {
		return this.fdFechaModificacion;
	}

	public void setFdFechaModificacion(Date fdFechaModificacion) {
		this.fdFechaModificacion = fdFechaModificacion;
	}

	public Integer getFiActiva() {
		return this.fiActiva;
	}

	public void setFiActiva(Integer fiActiva) {
		this.fiActiva = fiActiva;
	}

	public BigDecimal getFiAdminCreacion() {
		return this.fiAdminCreacion;
	}

	public void setFiAdminCreacion(BigDecimal fiAdminCreacion) {
		this.fiAdminCreacion = fiAdminCreacion;
	}

	public BigDecimal getFiAdminModificacion() {
		return this.fiAdminModificacion;
	}

	public void setFiAdminModificacion(BigDecimal fiAdminModificacion) {
		this.fiAdminModificacion = fiAdminModificacion;
	}

	public Integer getFiAprobada() {
		return this.fiAprobada;
	}

	public void setFiAprobada(Integer fiAprobada) {
		this.fiAprobada = fiAprobada;
	}

	public Integer getFiNumIntento() {
		return this.fiNumIntento;
	}

	public void setFiNumIntento(Integer fiNumIntento) {
		this.fiNumIntento = fiNumIntento;
	}

	public Integer getFiCalificacion() {
		return fiCalificacion;
	}

	public void setFiCalificacion(Integer fiCalificacion) {
		this.fiCalificacion = fiCalificacion;
	}

	public Integer getFiResultado() {
		return this.fiResultado;
	}

	public void setFiResultado(Integer fiResultado) {
		this.fiResultado = fiResultado;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getFiIntentosExtra() {
		return fiIntentosExtra;
	}

	public void setFiIntentosExtra(Integer fiIntentosExtra) {
		this.fiIntentosExtra = fiIntentosExtra;
	}
	
	

}