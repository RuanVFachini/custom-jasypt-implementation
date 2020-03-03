package br.com.hemar.encryptproperties.repository;

import br.com.hemar.encryptproperties.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
