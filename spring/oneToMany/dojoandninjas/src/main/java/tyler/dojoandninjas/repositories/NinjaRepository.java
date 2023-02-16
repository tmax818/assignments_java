package tyler.dojoandninjas.repositories;

import org.springframework.data.repository.CrudRepository;

import tyler.dojoandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
    
}
