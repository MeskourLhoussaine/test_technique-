package servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entites.Client;
import repository.ClientRepository;
import services.ClientServices;

@Service
public class ClientServicesImpl implements ClientServices{

	 @Autowired
	    private ClientRepository clientRepository;

	 @Override
	 public Client createClient(Client client) {
	     System.out.println("Client reçu : " + client.getNom() + " - " + client.getPrenom());
	     return clientRepository.save(client);
	 }

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client updateClient(Long id, Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
