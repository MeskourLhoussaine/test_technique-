package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entites.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
