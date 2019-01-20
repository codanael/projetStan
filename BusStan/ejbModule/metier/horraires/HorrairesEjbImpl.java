package metier.horraires;

import java.sql.Time;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Arrets;
import metier.entities.Horraires;
import metier.entities.LigneBus;

@Stateless
public class HorrairesEjbImpl implements HorrairesLocal, HorrairesRemote {
	
	@PersistenceContext(unitName="bus_stan")
	private EntityManager em;


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

	@SuppressWarnings("unchecked")
	@Override
	public List<Horraires> getHorrairesArret(int idArret) {
		Query req = em.createQuery("select h from Horraires h where Arret_id like :arretid").setParameter("arretid", idArret);
		return req.getResultList();
	}

	@Override
	public Horraires addHorraire(Time heureDeDebut, int frequence, Time heureDeFin, int arret, int ligne) {
		try {
		Horraires h = new Horraires(heureDeDebut, frequence, heureDeFin, em.find(Arrets.class, arret), em.find(LigneBus.class, ligne));
		em.persist(h);
		return h;
		}
		catch(RuntimeException e) {
			return null;
		}
	}

	@Override
	public Horraires getHorraire(int idArret, int idLigne) {
		// TODO Auto-generated method stub
		return null;
	}

}
