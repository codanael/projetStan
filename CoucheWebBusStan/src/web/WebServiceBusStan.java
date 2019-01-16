package web;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.bus.BusLocal;
import metier.entities.Bus;

@WebService(targetNamespace = "http://stanutilisateur.me")
public class WebServiceBusStan {
	
	@EJB
	
	private BusLocal metier;
	
	@WebMethod(operationName="ajouterBus")
	public Bus addBus(@WebParam(name="type")String type, @WebParam(name="nbrDeKilometre")int nbrDeKilometre, @WebParam(name="capacite")int capacite) {
		return metier.addBus(type, nbrDeKilometre, capacite);
	}
	
	@WebMethod(operationName="afficherBus")
	public Bus getBus(@WebParam(name="id")int id) {
		return metier.getBus(id);
	}
	
	@WebMethod(operationName="afficherListeBus")
	public List<Bus> getListBus(){
		return metier.listBus();
	}
}
