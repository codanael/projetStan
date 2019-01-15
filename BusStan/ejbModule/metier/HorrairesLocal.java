package metier;

import java.sql.Time;
import java.util.List;

import javax.ejb.Local;

import metier.entities.Horraires;

@Local
public interface HorrairesLocal {
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin);
	public List<Horraires> getListHorraires();
}
