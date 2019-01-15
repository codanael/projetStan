package metier.entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bus
 *
 */
@Entity
@Table(name="bus")
public class Bus implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="bus_id")
	private int id;
	private String type;
	private int nbrDeKilometre;
	private int capacite;
	@OneToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="horraires_id")
	private Horraires horraires;
	private static final long serialVersionUID = 1L;

	public Bus() {
		super();
	}   
	public Bus(String type, int nbrDeKilometre, int capacite) {
		this.type = type;
		this.nbrDeKilometre = nbrDeKilometre;
		this.capacite = capacite;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public int getNbrDeKilimetre() {
		return this.nbrDeKilometre;
	}

	public void setNbrDeKilimetre(int nbrDeKilometre) {
		this.nbrDeKilometre = nbrDeKilometre;
	}   
	public int getCapacite() {
		return this.capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	
	
	/*@ManyToMany
	//(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinTable(name = "bus_horraires",
	joinColumns = {@JoinColumn(name="bus_id", referencedColumnName="ID")},
	inverseJoinColumns = {@JoinColumn(name="horraires_id", referencedColumnName="ID")})
	
	public Set<Horraires> getHorraires() {
		return horraires;
	}*/
	
}
