package bursh.com.musicService.services;

import java.util.List;

import org.springframework.stereotype.Service;

import bursh.com.musicService.models.entities.User;
import bursh.com.musicService.repositories.UserRepository;
import bursh.com.musicService.utils.UserNotFoundException;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("User with username = '" + username + "' dose not exist"));
    }
}
