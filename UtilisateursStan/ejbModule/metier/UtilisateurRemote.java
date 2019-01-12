package metier;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import metier.entities.Utilisateur;

@Remote
public interface UtilisateurRemote {
	public Utilisateur addUtilisateur(String nom, String prenom, Date dateDeNaissance);
	public Utilisateur getUtilisateur(int id);
	public List<Utilisateur> listUtilisateur();
}
