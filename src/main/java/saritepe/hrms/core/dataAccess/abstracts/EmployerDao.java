package saritepe.hrms.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
