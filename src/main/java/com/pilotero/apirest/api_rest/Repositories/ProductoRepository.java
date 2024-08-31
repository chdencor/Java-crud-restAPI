package com.pilotero.apirest.api_rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pilotero.apirest.api_rest.Entities.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
