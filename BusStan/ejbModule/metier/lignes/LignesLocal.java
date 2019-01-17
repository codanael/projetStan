package metier.lignes;

import java.util.List;

import javax.ejb.Local;

import metier.entities.LigneBus;

@Local
public interface LignesLocal {
	public LigneBus addLignes(int numero);
	public LigneBus getLignes(int id);
	public List<LigneBus> getListLignes();
	public LigneBus addArretsToLigne(int idLigne, int idArret);
}
