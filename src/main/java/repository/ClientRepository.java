package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entites.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	 Client findByNom(String nom); 
	 Optional<Client> findByNomIgnoreCase(String nom);
	Client findByNomAndPrenom(String nom ,String prenom);
	 
	
	 


}