package metier.horraires;

import java.sql.Time;
import java.util.List;

import javax.ejb.Remote;

import metier.entities.Horraires;

@Remote
public interface HorrairesRemote {
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin);
	public List<Horraires> getListHorraires();

}
