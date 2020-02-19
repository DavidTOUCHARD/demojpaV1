package eu.ensup.demojpa.domaine;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String theme;
	private Date datedebut;
	private int duree;

	@ManyToOne(cascade = CascadeType.ALL)
	private Lieu lieu;

	public Formation() {
		super();
	}

	public Formation(String theme) {
		super();
		this.theme = theme;
	}

	public Formation(String theme, Date datedebut, int duree, Lieu lieu) {
		super();
		this.theme = theme;
		this.datedebut = datedebut;
		this.duree = duree;
		this.lieu = lieu;
	}

	public Date getDatedebut() {
		return datedebut;
	}

	public int getDuree() {
		return duree;
	}

	public Long getId() {
		return id;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public String getTheme() {
		return theme;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
