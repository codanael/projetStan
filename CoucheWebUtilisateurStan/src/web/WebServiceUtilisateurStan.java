package web;

import java.time.LocalDate;
import java.util.List;

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
	
	
	@WebMethod(operationName="ajouterDate")
	
	public Utilisateur addUtilisateur(@WebParam(name="nom")String nom, @WebParam(name="prenom")String prenom, @WebParam(name="dateDeNaissance")String dateDeNaissanceS) {
		LocalDate dateDeNaissance = LocalDate.parse(dateDeNaissanceS);
		return metier.addUtilisateur(nom, prenom, dateDeNaissance);
	}
	
	public Utilisateur getUtilisateur(int id) {
		return metier.getUtilisateur(id);
	}
	
	public List<Utilisateur> afficherListeUtilisateur(){
		return metier.listUtilisateur();
	}
	
}
