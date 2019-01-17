package metier.lignes;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Arrets;
import metier.entities.LigneBus;

@Stateless
public class LigneEjbImpl implements LignesLocal, LignesRemote {

	@PersistenceContext(unitName="bus_stan")
	private EntityManager em;
	
	@Override
	public LigneBus addLignes(int numero) {
		LigneBus l = new LigneBus(numero);
		em.persist(l);
		return l;
	}

	@Override
	public LigneBus getLignes(int id) {
		LigneBus l = em.find(LigneBus.class, id);
		if(l == null) throw new RuntimeException("Cette ligne n'existe pas");
		return l;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LigneBus> getListLignes() {
		Query req = em.createQuery("select l from LigneBus l");
		return req.getResultList();
	}

	@Override
	public LigneBus addArretsToLigne(int idLigne, int idArret) {
		LigneBus l = em.find(LigneBus.class, idLigne);
		Arrets a = em.find(Arrets.class, idArret);
		l.addArret(a);
		em.persist(l);
		return l;
	}

}
