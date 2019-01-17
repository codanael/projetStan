package web;

import java.sql.Time;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.arrets.ArretsLocal;
import metier.bus.BusLocal;
import metier.entities.Arrets;
import metier.entities.Bus;
import metier.entities.Horraires;
import metier.entities.LigneBus;
import metier.horraires.HorrairesLocal;
import metier.lignes.LignesLocal;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceStan {

	@EJB
	private ArretsLocal metierArrets;

	@EJB
	private HorrairesLocal metierHorraires;

	@EJB
	private BusLocal metierBus;

	private LignesLocal metierLignes;

	//**SERVICES ARRETS**//

	@WebMethod(operationName="ajouterArret")
	public Arrets addArret(@WebParam(name="nom")String nom) {
		return metierArrets.addArrets(nom);
	}

	@WebMethod(operationName="afficherArret")
	public Arrets getArret(@WebParam(name="id")int id) {
		return metierArrets.getArrets(id);
	}

	@WebMethod(operationName="afficherListeArret")
	public List<Arrets> getListArrets() {
		return metierArrets.getListArrets();
	}

	@WebMethod(operationName="ajouterHorraireAArret")
	public Arrets addHorraireArret(@WebParam(name="idArret")int idArret,@WebParam(name="idHorraire") int idHorraire) {
		return metierArrets.addHorrairesToArrets(idArret, idHorraire);
	}

	//**SERVICES LIGNES**//

	@WebMethod(operationName="ajouterLigne")
	public LigneBus addLigne(@WebParam(name="numero")int numero) {
		return metierLignes.addLignes(numero);
	}

	@WebMethod(operationName="afficherLigne")
	public LigneBus getLigne(@WebParam(name="id")int id) {
		return metierLignes.getLignes(id);
	}

	@WebMethod(operationName="afficherListeLigne")
	public List<LigneBus> getListLigne() {
		return metierLignes.getListLignes();
	}

	@WebMethod(operationName="ajouterArretALigne")
	public LigneBus addArretLigne(@WebParam(name="idLigne")int idLigne,@WebParam(name="idArret") int idArret) {
		return metierLignes.addArretsToLigne(idLigne, idArret);
	}

	//**SERVICES HORRAIRES**//

	@WebMethod(operationName="ajouterHorraire")
	public Horraires addHorraire(@WebParam(name="heureDeDebut")String heureDeDebutS, @WebParam(name="frequence") int frequence, @WebParam(name="heureDeFin")String heureDeFinS) {
		return metierHorraires.addHorraire(Time.valueOf(heureDeDebutS), frequence, Time.valueOf(heureDeFinS));
	}

	@WebMethod(operationName="afficherListeHorraires")
	public List<Horraires> getListHorraires(){
		return metierHorraires.getListHorraires();
	}

	//**SERVICES BUS**//

	@WebMethod(operationName="ajouterBus")
	public Bus addBus(@WebParam(name="type")String type, @WebParam(name="nbrDeKilometre")int nbrDeKilometre, @WebParam(name="capacite")int capacite) {
		return metierBus.addBus(type, nbrDeKilometre, capacite);
	}

	@WebMethod(operationName="afficherBus")
	public Bus getBus(@WebParam(name="id")int id) {
		return metierBus.getBus(id);
	}

	@WebMethod(operationName="afficherListeBus")
	public List<Bus> getListBus(){
		return metierBus.listBus();
	}
}
