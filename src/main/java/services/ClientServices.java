package services;

import java.util.List;
import java.util.Optional;

import entites.Client;

public interface ClientServices {
	  Client createClient(Client client);

	    List<Client> getAllClients();

	 
	    Client getClientByNom(String nom);

	  
	 
}
