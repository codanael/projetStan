package web;

import java.util.Date;

import javax.ejb.EJB;
import javax.jws.WebService;

import metier.UtilisateurLocal;
import metier.entities.Utilisateur;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceUtilisateurStan {
	
	@EJB

	
	private UtilisateurLocal metier;
	
	public Utilisateur addUtilisateur(String nom, String prenom, Date dateDeNaissance) {
		return metier.addUtilisateur(nom, prenom, dateDeNaissance);
	}
	
	public Utilisateur getUtilisateur(int id) {
		return metier.getUtilisateur(id);
	}
}
