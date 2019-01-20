package metier.horraires;

import java.sql.Time;
import java.util.List;

import javax.ejb.Remote;

import metier.entities.Horraires;

@Remote
public interface HorrairesRemote {
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin, int arret, int ligne);
	public Horraires getHorraire(int id);
	public Horraires getHorraire(int idArret, int idLigne);
	public List<Horraires> getListHorraires();
	public List<Horraires> getHorrairesArret(int idArret);

}
