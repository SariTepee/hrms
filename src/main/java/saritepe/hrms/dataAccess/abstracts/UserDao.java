package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
