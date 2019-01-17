package web;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.arrets.ArretsLocal;
import metier.entities.Arrets;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceArretsStan {

	@EJB
	private ArretsLocal metier;
	
	@WebMethod(operationName="ajouterArret")
	public Arrets addArret(@WebParam(name="nom")String nom) {
		return metier.addArrets(nom);
	}
	
	@WebMethod(operationName="afficherArret")
	public Arrets getArret(@WebParam(name="id")int id) {
		return metier.getArrets(id);
	}
	
	@WebMethod(operationName="afficherListeArret")
	public List<Arrets> getListArrets() {
		return metier.getListArrets();
	}
	
	@WebMethod(operationName="ajouterHorraireAArret")
	public Arrets addHorraireArret(@WebParam(name="idArret")int idArret,@WebParam(name="idHorraire") int idHorraire) {
		return metier.addHorrairesToArrets(idArret, idHorraire);
	}
}
