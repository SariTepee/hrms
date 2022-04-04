package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.EmployeeConfirmEmployer;

public interface EmployeeConfirmEmployerDao extends JpaRepository<EmployeeConfirmEmployer, Integer> {
    EmployeeConfirmEmployer getByEmployee_FirstNameAndEmployer_CompanyName(String employeeFirstName, String employerCompanyName);
}
