package metier;

import java.time.LocalDate;
import java.util.List;

import javax.ejb.Remote;

import metier.entities.Utilisateur;

@Remote
public interface UtilisateurRemote {
	public Utilisateur addUtilisateur(String nom, String prenom, int annee, int mois, int jour );
	public Utilisateur addUtilisateur(String nom, String prenom, LocalDate dateDeNaissance);
	public Utilisateur getUtilisateur(int id);
	public List<Utilisateur> listUtilisateur();
}
