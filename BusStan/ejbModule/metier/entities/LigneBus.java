package metier.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LigneBus
 *
 */
@Entity
@Table(name="ligneBus")
public class LigneBus implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int numero;
	@ManyToMany(cascade = {
			CascadeType.PERSIST, 
			CascadeType.MERGE
		})
	@JoinTable(name= "ligneArrets",
			joinColumns = @JoinColumn(name = "ligne_id"),
			inverseJoinColumns = @JoinColumn(name = "arrets_id")
	)
	private Set<Arrets> arrets = new HashSet<>();
	private static final long serialVersionUID = 1L;

	public LigneBus() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Set<Arrets> getArrets() {
		return arrets;
	}
	public void setArrets(Set<Arrets> arrets) {
		this.arrets = arrets;
	}
	
   
}
