package tyler.burgertrackerone.repositories;
import tyler.burgertrackerone.models.Burger;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BurgerRepository extends CrudRepository<Burger, Long> {
            // this method retrieves all the Burgers from the database
            List<Burger> findAll();
            // this method finds Burgers with descriptions containing the search string
            List<Burger> findByNotesContaining(String search);
            // this method counts how many Names contain a certain string
            Long countByNameContaining(String search);
            // this method deletes a Burger that starts with a specific Name
            Long deleteByNameStartingWith(String search);
}
