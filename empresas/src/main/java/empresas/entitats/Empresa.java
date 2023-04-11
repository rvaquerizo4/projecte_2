package empresas.entitats;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String cif;
    private String nom;
    private String adreca;
    
    @OneToMany(mappedBy = "empresa")
    private List<Alumnes> alumnes;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public List<Alumnes> getAlumnes() {
		return alumnes;
	}

	public void setAlumnes(List<Alumnes> alumnes) {
		this.alumnes = alumnes;
	}

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(long id, String cif, String nom, String adreca, List<Alumnes> alumnes) {
		super();
		this.id = id;
		this.cif = cif;
		this.nom = nom;
		this.adreca = adreca;
		this.alumnes = alumnes;
	}

	@Override
	public String toString() {
		return "Empresa [id=\" + id + cif=" + cif + ", nom=" + nom + ", adreca=" + adreca + ", alumnes=" + alumnes + "]";
	}
	
	

    
}
