package com.exp1_s3.tienda_mascotas.Client.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exp1_s3.tienda_mascotas.Client.model.ClientModel;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
}
