package metier.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Horraires
 *
 */
@Entity
@Table(name="horraires")
public class Horraires implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Time heureDeDebut;
	private int frequence;
	private Time heureDeFin;
	@ManyToMany(mappedBy = "horraires")
	private Set<Arrets> arrets = new HashSet<>();
	private static final long serialVersionUID = 1L;
	
	

	public Horraires(Time heureDeDebut, int frequence, Time heureDeFin) {
		super();
		this.heureDeDebut = heureDeDebut;
		this.frequence = frequence;
		this.heureDeFin = heureDeFin;
	}
	public Horraires() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Time getHeureDeDebut() {
		return heureDeDebut;
	}
	public void setHeureDeDebut(Time heureDeDebut) {
		this.heureDeDebut = heureDeDebut;
	}
	public int getFrequence() {
		return frequence;
	}
	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}
	public Time getHeureDeFin() {
		return heureDeFin;
	}
	public void setHeureDeFin(Time heureDeFin) {
		this.heureDeFin = heureDeFin;
	}
	public Set<Arrets> getArrets() {
		return arrets;
	}
	public void setArrets(Set<Arrets> arrets) {
		this.arrets = arrets;
	}
	
	
   
}

