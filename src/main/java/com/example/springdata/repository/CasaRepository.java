package com.example.springdata.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springdata.model.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Long> {

	List<Casa> findByCorNome(String nome);

	List<Casa> findByCor_Nome(String nome);

	@Query("from Casa c where c.cor.nome = :nome")
	List<Casa> getCasaPorNomeCor(String nome);

	@Query("from Casa ca join ca.cor co where co.nome = :nome")
	List<Casa> getCasaPorNomeCorComJoin(String nome);

	@Query(value = "SELECT * FROM CASA ca JOIN COR co ON ca.IDCOR = co.ID WHERE co.NOME = :nome", nativeQuery = true)
	List<Casa> getCasaPorNomeCorComJoinSQL(String nome);

}
