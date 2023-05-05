package br.com.fiap.spring.repository;

import br.com.fiap.spring.entity.ChamadoEntity;
import br.com.fiap.spring.entity.ClienteEntity;
import br.com.fiap.spring.entity.CompraEntity;
import br.com.fiap.spring.entity.TipoCompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChamadoRepository extends JpaRepository<ChamadoEntity, Integer> {

    List<ChamadoEntity> findAll();

    @Query("SELECT t FROM ChamadoEntity t WHERE t.idChamado = :Id")
    List<ChamadoEntity>  findAllById(int Id);

    @Query(value = "from ChamadoEntity")
    List<ChamadoEntity> listar();

    @Query("SELECT t FROM CompraEntity t WHERE t.idCompra = :Id")
    CompraEntity  findAllByIdCompra(int Id);

    @Query("SELECT t FROM ClienteEntity t WHERE t.idCliente = :Id")
    ClienteEntity findAllByIdCliente(int Id);

    @Query("SELECT t FROM TipoCompraEntity t WHERE t.idTipoCompra = :Id")
    TipoCompraEntity findAllByIdTipoCompra(int Id);

}
