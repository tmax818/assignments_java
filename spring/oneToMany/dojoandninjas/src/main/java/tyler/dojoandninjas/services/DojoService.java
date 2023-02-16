package tyler.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.dojoandninjas.models.Dojo;
import tyler.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {

    @Autowired DojoRepository dojoRepository;

    public List<Dojo> getAll(){
        return dojoRepository.findAll();
    }

    public void addDojo(Dojo dojo){
        dojoRepository.save(dojo);
    }

    public Dojo getOne(Long id){
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        return optionalDojo.orElse(null);
    }


    
}
