package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Arrets
 *
 */
@Entity
@Table(name="arrets")
public class Arrets implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	@ManyToMany(mappedBy = "arrets")
	private Set<LigneBus> ligneBus = new HashSet<>();
	
	private static final long serialVersionUID = 1L;

	public Arrets() {
		super();
	}   

	public Arrets(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public Set<LigneBus> getLigneBus() {
		return ligneBus;
	}
	public void setLigneBus(Set<LigneBus> ligneBus) {
		this.ligneBus = ligneBus;
	}


	
   
}
