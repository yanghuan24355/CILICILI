package four.repository;

import four.domain.Barrage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarrageRepository extends CrudRepository<Barrage, Integer> {
}
