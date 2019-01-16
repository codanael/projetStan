package metier.bus;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Bus;

@Remote
public interface BusRemote {
	public Bus addBus(String type, int nbrDeKilometre, int capacite);
	public Bus getBus(int id);
	public List<Bus> listBus();
}
