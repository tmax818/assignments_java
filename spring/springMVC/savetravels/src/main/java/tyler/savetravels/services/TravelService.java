package tyler.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.savetravels.models.Travel;
import tyler.savetravels.repositories.TravelRepository;

@Service
public class TravelService {

    @Autowired TravelRepository travelRepository;

    //! CREATE

    public Travel createTravel(Travel t){
        return travelRepository.save(t);
    }

    //! READ ALL

    public List<Travel> allTravels(){
        return travelRepository.findAll();
    }

    // ! READ ONE

    public Travel findTravel(Long id) {
        Optional<Travel> optionalTravel = travelRepository.findById(id);
        return optionalTravel.orElse(null);
    }

    // ! UPDATE

    public void updateTravel(Travel travel){
        travelRepository.save(travel);
    }

    // ! DELETE

    public void deleteTravel(Travel travel){
        travelRepository.delete(travel);
    }
    
}
