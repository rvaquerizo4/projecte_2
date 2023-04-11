package empresas.entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Alumnes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String cognoms;
	private String cicle;
	private String estatPractiques;
	
	@ManyToOne
	@JoinColumn(name = "id_empresa")
	private Empresa empresa;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public String getCicle() {
		return cicle;
	}
	public void setCicle(String cicle) {
		this.cicle = cicle;
	}
	public String getEstatPractiques() {
		return estatPractiques;
	}
	public void setEstatPractiques(String estatPractiques) {
		this.estatPractiques = estatPractiques;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Alumnes(long id, String nom, String cognoms, String cicle, String estatPractiques, Empresa empresa) {
		super();
		this.id = id;
		this.nom = nom;
		this.cognoms = cognoms;
		this.cicle = cicle;
		this.estatPractiques = estatPractiques;
		this.empresa = empresa;
	}
	public Alumnes() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AlumnesEntity [id=" + id + ", nom=" + nom + ", cognoms=" + cognoms + ", cicle=" + cicle
				+ ", estatPractiques=" + estatPractiques + ", empresa=" + empresa + "]";
	}
	
	
	
	
	
}
