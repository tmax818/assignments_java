package tyler.dojoandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.dojoandninjas.models.Ninja;
import tyler.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

    @Autowired NinjaRepository ninjaRepository;

    public void addNinja(Ninja ninja){
        ninjaRepository.save(ninja);
    }
    
}
