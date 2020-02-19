package eu.ensup.demojpa.domaine;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lieu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String adresse;

	@OneToMany(mappedBy = "lieu")
	private Collection<Formation> formations;

	public Lieu() {
		super();
	}

	public Lieu(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public Collection<Formation> getFormation() {
		return formations;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setFormation(Collection<Formation> formation) {
		formations = formation;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
