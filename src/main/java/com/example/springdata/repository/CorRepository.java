package com.example.springdata.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springdata.model.Cor;

@Transactional
@Repository
public interface CorRepository extends JpaRepository<Cor, Long> {

	List<Cor> findByNome(String nome);

	List<Cor> findByRAndGAndB(Integer r, Integer g, Integer b);

	List<Cor> findByROrGOrB(Integer r, Integer g, Integer b);

	Cor findFirstByR(Integer r);

	List<Cor> findFirst3ByR(Integer r);

	List<Cor> findDistinctByNome(String nome);

	List<Cor> findByNomeIgnoreCase(String nome);

	List<Cor> findByROrGOrBOrderByNomeAsc(Integer r, Integer g, Integer b);

	Boolean existsByNome(String nome);

	@Query("from Cor where nome = :nome")
	List<Cor> getCorPorNome(String nome);

	@Query("select nome from Cor where r = ?1 and g = ?2 and b = ?3")
	List<String> getNomeCorPorRGB(Integer r, Integer g, Integer b);

	@Query("select nome from Cor order by nome desc")
	List<String> getNomeCorOrdenadaPorNome();

	@Modifying
	@Query("update Cor set nome = 'Teste'")
	void updateSemWhere();

	@Modifying
	@Query("delete from Cor where id in (5, 6, 7)")
	void deleteCores();

	@Query(value = "SELECT * FROM COR", nativeQuery = true)
	List<Cor> getCoresSQL();

	@Query(value = "SELECT NOME FROM COR WHERE R = :r", nativeQuery = true)
	List<String> getCoresPorRSQL(Integer r);

}
