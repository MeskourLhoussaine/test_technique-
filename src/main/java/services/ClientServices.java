package services;

import java.util.List;
import entites.Client;

public interface ClientServices {
	  Client createClient(Client client);

	    List<Client> getAllClients();

	    Client getClientById(Long id);

	    Client updateClient(Long id, Client client);

	    void deleteClient(Long id);

}
