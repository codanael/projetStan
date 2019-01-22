package metier.horraires;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Horraires;

@Remote
public interface HorrairesRemote {
	public Horraires addHorraire(String heureDeDebut, int frequence, String heureDeFin, int arret, int ligne);
	public Horraires getHorraire(int id);
	public List<Horraires> getHorraire(int idArret, int idLigne);
	public List<Horraires> getListHorraires();
	public List<Horraires> getHorrairesArret(int idArret);
	public List<String> getTableauHorraires(int idArret, int idLigne);

}
