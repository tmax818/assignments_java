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
            result.rejectValue("email", "Email", "Already have that email");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("confirm", "Confirm", "passwords must match");
            
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
        // Create potential user
        // Find user in the DB by email
        Optional<User> userToLogin = userRepository.findByEmail(loginUser.getEmail());
        // Reject if NOT present
        if(!userToLogin.isPresent()){
            result.rejectValue("email", "Matches", "User not Found");
        }
        // User exists if you get to this line, so retrieve user from DB
        User user = userToLogin.get();
        // Reject if BCrypt password match fails
        if(!BCrypt.checkpw(loginUser.getPassword(), user.getPassword())){
            result.rejectValue("password", "Matches", "Invalid Credentials");
        }
        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        // Otherwise, return the user object
        return user;
    }

    public Object findById(Long id) {
        Optional<User> potentialUser = userRepository.findById(id);
        if(potentialUser.isPresent()) {
            return potentialUser.get();
        }
        return null;
    }
    
}
