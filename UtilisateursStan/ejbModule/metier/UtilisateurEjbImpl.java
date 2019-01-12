package metier;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import metier.entities.Utilisateur;


@Stateless
public class UtilisateurEjbImpl implements UtilisateurRemote, UtilisateurLocal{

	@PersistenceUnit(unitName="UtilisateursStan")
	private EntityManager em;
	
	@Override
	public Utilisateur addUtilisateur(String nom, String prenom, Date dateDeNaissance) {
		Utilisateur u = new Utilisateur(nom,prenom,dateDeNaissance);
		em.persist(u);
		return u;
	}

	@Override
	public Utilisateur getUtilisateur(int id) {
		Utilisateur u = em.find(Utilisateur.class, id);
		if(u == null) throw new RuntimeException("Utilisateur doesn't exists");
		return u;
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

}
