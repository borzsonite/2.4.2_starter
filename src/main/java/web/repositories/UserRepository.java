package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String userName);
}
