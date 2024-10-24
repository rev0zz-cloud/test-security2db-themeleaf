package ru.arkhipov.testsecurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arkhipov.testsecurity2dbthemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}