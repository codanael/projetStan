package metier.horraires;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Arrets;
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

	@Override
	public Horraires getHorraire(int id) {
		Horraires h = em.find(Horraires.class, id);
		if(h == null) throw new RuntimeException("Cet horraire n'existe pas");
		return h;
	}

	@Override
	public Set<Horraires> getHorrairesArret(int idArret) {
		Arrets a = em.find(Arrets.class, idArret);
		return a.getHorraires();
	}

}
