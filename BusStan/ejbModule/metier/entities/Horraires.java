package metier.entities;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Horraires
 *
 */
@Entity
@Table(name="horraires")
public class Horraires implements Serializable, AttributeConverter<String, LocalTime>{
	

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String heureDeDebut;
	private int frequence;
	private String heureDeFin;
	@OneToOne
	private Arrets Arret;
	@OneToOne
	private LigneBus Ligne;
	private static final long serialVersionUID = 1L;
	
	

	public Horraires(String heureDeDebut, int frequence, String heureDeFin, Arrets arret, LigneBus ligne) {
		super();
		this.heureDeDebut = heureDeDebut;
		this.frequence = frequence;
		this.heureDeFin = heureDeFin;
		this.Arret = arret;
		this.Ligne = ligne;
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
	public String getHeureDeDebut() {
		return heureDeDebut;
	}
	public void setHeureDeDebut(String heureDeDebut) {
		this.heureDeDebut = heureDeDebut;
	}
	public int getFrequence() {
		return frequence;
	}
	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}
	public String getHeureDeFin() {
		return heureDeFin;
	}
	public void setHeureDeFin(String heureDeFin) {
		this.heureDeFin = heureDeFin;
	}
	public Arrets getArret() {
		return Arret;
	}
	public void setArret(Arrets arret) {
		Arret = arret;
	}
	public LigneBus getLigne() {
		return Ligne;
	}
	public void setLigne(LigneBus ligne) {
		Ligne = ligne;
	}
	@Override
	public LocalTime convertToDatabaseColumn(String arg0) {
		return (arg0 == null ? null : LocalTime.parse(arg0,DateTimeFormatter.ISO_LOCAL_TIME));
	}
	@Override
	public String convertToEntityAttribute(LocalTime arg0) {
		return (arg0 == null ? null :arg0.toString());
	}
		
   
}

