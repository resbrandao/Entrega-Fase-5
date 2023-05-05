package br.com.fiap.spring.repository;

import br.com.fiap.spring.entity.CompraEntregaEntity;
import br.com.fiap.spring.entity.EntregaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntregaRepository extends JpaRepository<EntregaEntity, Integer> {
    List<EntregaEntity> findAll();

    @Query("SELECT t FROM EntregaEntity t WHERE t.idEntrega = :Id")
    EntregaEntity consultaEntregaPorId(Integer Id);
    /*
    @Query("SELECT t FROM EntregaEntity t WHERE t.idEntrega = :Id")
    List<EntregaEntity>  findAllById(int Id);

    @Query(value = "from EntregaEntity")
    List<EntregaEntity> listar();

    @Query("SELECT t FROM EntregaEntity t WHERE t.compraEntrega.idCompra = :Id")
    List<EntregaEntity> consultaEntrega(Integer Id);
     */

}
