package metier.arrets;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Arrets;

@Stateless
public class ArretsEjbImpl implements ArretsLocal, ArretsRemote {

	@PersistenceContext(unitName="bus_stan")
	private EntityManager em;
	
	@Override
	public Arrets addArrets(String nom) {
		Arrets a = new Arrets(nom);
		em.persist(a);
		return a;
	}

	@Override
	public Arrets getArrets(int id) {
		Arrets a = em.find(Arrets.class, id);
		if(a == null) throw new RuntimeException("Cet arret n'existe pas");
		return a;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Arrets> getListArrets() {
		Query req = em.createQuery("select a from Arrets a");
		return req.getResultList();
	}


}
