package metier;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.Local;

import metier.entities.Utilisateur;

@Local
public interface UtilisateurLocal {
	public Utilisateur addUtilisateur(String nom, String prenom, int annee, int mois, int jour);
	public Utilisateur addUtilisateur(String nom, String prenom, LocalDate dateDeNaissance);
	public Utilisateur getUtilisateur(int id);
	public List<Utilisateur> listUtilisateur();

}
