package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Bus;

@Stateless
public class BusEjbImpl implements BusLocal, BusRemote {
	
	@PersistenceContext(unitName="bus_stan")
	private EntityManager em;

	@Override
	public Bus addBus(String type, int nbrDeKilometre, int capacite) {
		Bus b = new Bus(type,nbrDeKilometre,capacite);
		em.persist(b);
		return b;
	}

	@Override
	public Bus getBus(int id) {
		Bus b = em.find(Bus.class, id);
		if(b == null) throw new RuntimeException("Ce bus n'existe pas");
		return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bus> listBus() {
		Query req = em.createQuery("select b from Bus b");
		return req.getResultList();
	}

}
