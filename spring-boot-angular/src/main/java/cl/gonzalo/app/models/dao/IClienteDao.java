package cl.gonzalo.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.gonzalo.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
