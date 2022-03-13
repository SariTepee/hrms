package saritepe.hrms.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
