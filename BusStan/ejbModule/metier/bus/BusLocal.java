package metier.bus;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Bus;

@Local
public interface BusLocal {
	public Bus addBus(String type, int nbrDeKilometre, int capacite);
	public Bus getBus(int id);
	public List<Bus> listBus();
}
