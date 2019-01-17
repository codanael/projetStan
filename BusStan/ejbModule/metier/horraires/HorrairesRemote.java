package metier.horraires;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import javax.ejb.Remote;

import metier.entities.Horraires;

@Remote
public interface HorrairesRemote {
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin);
	public Horraires getHorraire(int id);
	public List<Horraires> getListHorraires();
	public Set<Horraires> getHorrairesArret(int idArret);

}
