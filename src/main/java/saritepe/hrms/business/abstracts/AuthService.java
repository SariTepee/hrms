package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.Candidate;
import saritepe.hrms.entities.concretes.Employee;
import saritepe.hrms.entities.concretes.Employer;

public interface AuthService {
    Result registerEmployee(Employee employee, String confirmPassword);
    Result registerEmployer(Employer employer, String confirmPassword);
    Result registerCandidate(Candidate candidate, String confirmPassword);
}
