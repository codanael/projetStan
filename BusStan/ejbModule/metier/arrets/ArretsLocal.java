package metier.arrets;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Arrets;

@Local
public interface ArretsLocal {
	public Arrets addArrets(String nom);
	public Arrets getArrets(int id);
	public List<Arrets> getListArrets();
	public List<Arrets> getArretsLigne(int idLigne);
	
}
