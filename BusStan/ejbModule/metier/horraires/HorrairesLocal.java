package metier.horraires;

import java.sql.Time;
import java.util.List;

import javax.ejb.Local;

import metier.entities.Horraires;

@Local
public interface HorrairesLocal {
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin, int arret, int ligne);
	public Horraires getHorraire(int id);
	public Horraires getHorraire(int idArret, int idLigne);
	public List<Horraires> getListHorraires();
	public List<Horraires> getHorrairesArret(int idArret);
}
