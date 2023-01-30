package it.univr.repository;

import it.univr.model.Drug;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DrugRepository extends CrudRepository<Drug, Long> {
    List<Drug> findByName(String name);
    Drug findById(long id);
}
