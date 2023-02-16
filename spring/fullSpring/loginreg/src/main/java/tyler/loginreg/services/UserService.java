package tyler.loginreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import tyler.loginreg.models.LoginUser;
import tyler.loginreg.models.User;
import tyler.loginreg.repositories.UserRepository;

@Service
public class UserService {

    @Autowired UserRepository userRepository;

    public User register(User newUser, BindingResult result){
        Optional<User> user = userRepository.findByEmail(newUser.getEmail());
        if(user.isPresent()){
            result.rejectValue("email", "Matches", "Already have that email");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("confirm", "Matches", "passwords must match");
            
        }
        if(result.hasErrors()){
            return null;
        }

        //hash password
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        //set password
        newUser.setPassword(hashed);
        // save the user
        return userRepository.save(newUser);
    }

    public User login(LoginUser loginUser, BindingResult result){
        return null;
    }
    
}
