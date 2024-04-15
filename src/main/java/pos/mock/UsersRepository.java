package pos.mock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {

    Optional<Users> findByUsernameAndPassword(String username,String password);
}