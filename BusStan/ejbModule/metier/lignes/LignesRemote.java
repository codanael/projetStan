package metier.lignes;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.LigneBus;

@Remote
public interface LignesRemote {
	public LigneBus addLignes(int numero);
	public LigneBus getLignes(int id);
	public List<LigneBus> getListLignes();
	public LigneBus addArretsToLigne(int idLigne, int idArret);
	
}
