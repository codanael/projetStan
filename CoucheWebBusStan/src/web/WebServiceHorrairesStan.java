package web;

import java.sql.Time;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.HorrairesLocal;
import metier.entities.Horraires;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceHorrairesStan {
	
	@EJB
	private HorrairesLocal metier;
	
	@WebMethod(operationName="ajouterHorraire")
	public Horraires addHorraire(@WebParam(name="heureDeDebut")Time heureDeDebut, @WebParam(name="frequence") int frequence, @WebParam(name="heureDeFin")Time heureDeFin) {
		return metier.addHorraire(heureDeDebut, frequence, heureDeFin);
	}
	
	@WebMethod(operationName="afficherListeHorraires")
	public List<Horraires> getListHorraires(){
		return metier.getListHorraires();
	}

}
