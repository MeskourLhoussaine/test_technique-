package servicesImpl;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import entites.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.ClientRepository;

@ExtendWith(MockitoExtension.class)
public class ClientServicesImplTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientServicesImpl clientService;

    @Test
    public void testCreateClient() {
      
        Client client = new Client();
        client.setNom("Ali");
        client.setPrenom("Amine");

        when(clientRepository.save(any(Client.class))).thenReturn(client);

       
        Client result = clientService.createClient(client);

        
        assertNotNull(result);
        assertEquals("Ali", result.getNom());
        verify(clientRepository, times(1)).save(client);
    }
    
    //la methode findClientByNom
    @Test
    public void testGetClientByNom() {
        
        String nom = "Elhassani";
        Client mockClient = new Client();
        mockClient.setNom(nom);
        mockClient.setPrenom("Samir");

        when(clientRepository.findByNom(nom)).thenReturn(mockClient);

        
        Client result = clientService.getClientByNom(nom);

        
        assertNotNull(result);
        assertEquals("Elhassani", result.getNom());
        assertEquals("Samir", result.getPrenom());

        verify(clientRepository, times(1)).findByNom(nom);
    }
}
