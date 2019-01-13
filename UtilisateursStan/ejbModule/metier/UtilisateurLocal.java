package metier;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Utilisateur;

@Local
public interface UtilisateurLocal {
	public Utilisateur addUtilisateur(String nom, String prenom, int annee, int mois, int jour);
	public Utilisateur getUtilisateur(int id);
	public List<Utilisateur> listUtilisateur();

}
