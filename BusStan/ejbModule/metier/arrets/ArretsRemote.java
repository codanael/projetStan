package metier.arrets;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Arrets;


@Remote
public interface ArretsRemote {
	public Arrets addArrets(String nom);
	public Arrets getArrets(int id);
	public List<Arrets> getListArrets();
	public List<Arrets> getArretsLigne(int idLigne);
}
