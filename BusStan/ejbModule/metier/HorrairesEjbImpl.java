package metier;

import java.sql.Time;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Horraires;

@Stateless
public class HorrairesEjbImpl implements HorrairesLocal, HorrairesRemote {
	
	@PersistenceContext(unitName="bus_stan")
	private EntityManager em;

	@Override
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin) {
		Horraires h = new Horraires(heureDeDebut, frequence, heureDeFin);
		em.persist(h);
		return h;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Horraires> getListHorraires() {
		Query req = em.createQuery("select h from Horraires h");
		return req.getResultList();
	}

}
