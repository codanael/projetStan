package metier.entities;

import java.io.Serializable;
import java.sql.Time;

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
	@Column(name="horraires_id")
	private int id;
	private Time heureDeDebut;
	private int frequence;
	private Time heureDeFin;
	@OneToOne(mappedBy = "horraires", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private Bus bus;
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
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
   
}

