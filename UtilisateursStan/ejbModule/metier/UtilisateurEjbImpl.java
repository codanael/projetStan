package metier;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.Utilisateur;


@Stateless
public class UtilisateurEjbImpl implements UtilisateurRemote, UtilisateurLocal{

	@PersistenceContext(unitName="UtilisateursStan")
	private EntityManager em;
	
	@Override
	public Utilisateur addUtilisateur(String nom, String prenom, int annee, int mois, int jour) {
		LocalDate date = LocalDate.of(annee, mois, jour);
		Utilisateur u = new Utilisateur(nom,prenom, date);
		em.persist(u);
		return u;
	}
	
	@Override
	public Utilisateur addUtilisateur(String nom, String prenom, LocalDate dateDeNaissance) {
		Utilisateur u = new Utilisateur(nom,prenom, dateDeNaissance);
		em.persist(u);
		return u;
	}

	@Override
	public Utilisateur getUtilisateur(int id) {
		Utilisateur u = em.find(Utilisateur.class, id);
		if(u == null) throw new RuntimeException("Utilisateur doesn't exists");
		return u;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> listUtilisateur() {
		Query req = em.createQuery("select u from Utilisateur u");
		return req.getResultList();
	}

	

}
