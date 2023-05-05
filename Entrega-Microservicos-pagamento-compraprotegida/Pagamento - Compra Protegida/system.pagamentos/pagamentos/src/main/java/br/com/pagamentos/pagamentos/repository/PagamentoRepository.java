package br.com.pagamentos.pagamentos.repository;

import br.com.pagamentos.pagamentos.entity.PagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PagamentoRepository extends JpaRepository<PagamentoEntity, Long> {
   // List<PagamentoEntity> findAll();

 @Query("SELECT t FROM PagamentoEntity t WHERE t.id = :Id")
 List<PagamentoEntity>  findAllById(Long Id);

 @Query("SELECT t FROM PagamentoEntity t WHERE t.clientePagamento.idCliente = :Id")
 List<PagamentoEntity> consultaPagamentos(Long Id);
 @Query(value = "FROM PagamentoEntity")
 List<PagamentoEntity> listar();







}
