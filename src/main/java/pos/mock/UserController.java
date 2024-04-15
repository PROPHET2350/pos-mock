package pos.mock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        Optional<Users> users = usersRepository.findByUsernameAndPassword(loginRequest.username, loginRequest.password);
        if (users.isPresent()){
            return new ResponseEntity<>(users.get(),HttpStatus.OK);
        }

        return new ResponseEntity<>("Bad credentials",HttpStatus.UNPROCESSABLE_ENTITY);
    }
}

class LoginRequest{
    public String username;
    public String password;

}
