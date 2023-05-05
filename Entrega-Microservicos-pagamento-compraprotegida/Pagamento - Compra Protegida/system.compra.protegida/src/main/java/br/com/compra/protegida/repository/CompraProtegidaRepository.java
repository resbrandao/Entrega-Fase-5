package br.com.compra.protegida.repository;

import br.com.compra.protegida.entity.CompraProtegidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompraProtegidaRepository extends JpaRepository<CompraProtegidaEntity, Long> {
   // List<PagamentoEntity> findAll();

 @Query("SELECT t FROM CompraProtegidaEntity t WHERE t.id = :Id")
 List<CompraProtegidaEntity>  findAllById(Long Id);

 @Query("SELECT t FROM CompraProtegidaEntity t WHERE t.clientePagamento.idCliente = :Id")
 List<CompraProtegidaEntity> consultaComprasProtegida(Long Id);
 @Query(value = "FROM CompraProtegidaEntity")
 List<CompraProtegidaEntity> listar();







}
