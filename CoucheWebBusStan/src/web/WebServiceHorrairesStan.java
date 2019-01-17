package web;

import java.sql.Time;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.entities.Horraires;
import metier.horraires.HorrairesLocal;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceHorrairesStan {
	
	@EJB
	private HorrairesLocal metier;
	
	@WebMethod(operationName="ajouterHorraire")
	public Horraires addHorraire(@WebParam(name="heureDeDebut")String heureDeDebutS, @WebParam(name="frequence") int frequence, @WebParam(name="heureDeFin")String heureDeFinS) {
		return metier.addHorraire(Time.valueOf(heureDeDebutS), frequence, Time.valueOf(heureDeFinS));
	}
	
	@WebMethod(operationName="afficherListeHorraires")
	public List<Horraires> getListHorraires(){
		return metier.getListHorraires();
	}

}
