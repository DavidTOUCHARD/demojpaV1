package eu.ensup.demojpa.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String theme;

	public Formation() {
		super();
	}

	public Formation(Long id, String theme) {
		super();
		this.id = id;
		this.theme = theme;
	}

	public Formation(String theme) {
		super();
		this.theme = theme;
	}

	public Long getId() {
		return id;
	}

	public String getTheme() {
		return theme;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
