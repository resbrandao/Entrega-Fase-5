package br.com.fiap.spring.repository;

import br.com.fiap.spring.entity.CompraEntregaEntity;
import br.com.fiap.spring.entity.EntregaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompraEntregaRepository extends JpaRepository<CompraEntregaEntity, Integer> {
    List<CompraEntregaEntity> findAll();

    @Query("SELECT t FROM CompraEntregaEntity t WHERE t.idCompra = :Id")
    CompraEntregaEntity consultaEntregaPorCompra(Integer Id);

}
