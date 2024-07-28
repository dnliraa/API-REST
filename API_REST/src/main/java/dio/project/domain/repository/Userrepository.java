package dio.project.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.project.domain.model.User;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {

}
