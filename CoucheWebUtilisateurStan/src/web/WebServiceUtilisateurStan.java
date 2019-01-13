package web;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.UtilisateurLocal;
import metier.entities.Utilisateur;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceUtilisateurStan {
	
	@EJB

	
	private UtilisateurLocal metier;
	
	@WebMethod(operationName="ajouter")
	public Utilisateur addUtilisateur(@WebParam(name="nom")String nom, @WebParam(name="prenom")String prenom, @WebParam(name="annee")int annee, @WebParam(name="mois")int mois, @WebParam(name="jour")int jour) {
		return metier.addUtilisateur(nom, prenom, annee, mois, jour);
	}
	
	public Utilisateur getUtilisateur(int id) {
		return metier.getUtilisateur(id);
	}
}
