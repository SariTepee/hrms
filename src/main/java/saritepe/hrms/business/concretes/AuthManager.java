package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.AuthService;
import saritepe.hrms.business.abstracts.CandidateService;
import saritepe.hrms.business.abstracts.EmployeeService;
import saritepe.hrms.business.abstracts.EmployerService;
import saritepe.hrms.core.entities.User;
import saritepe.hrms.core.utilities.result.ErrorResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.Candidate;
import saritepe.hrms.entities.concretes.Employee;
import saritepe.hrms.entities.concretes.Employer;

@Service
public class AuthManager implements AuthService {

    private EmployeeService employeeService;
    private EmployerService employerService;
    private CandidateService candidateService;

    @Autowired
    public AuthManager(EmployeeService employeeService, EmployerService employerService, CandidateService candidateService) {
        this.employeeService = employeeService;
        this.employerService = employerService;
        this.candidateService = candidateService;
    }

    @Override
    public Result registerEmployee(Employee employee, String confirmPassword) {

        validateUser(employee, confirmPassword);
        return employeeService.add(employee);
    }

    @Override
    public Result registerEmployer(Employer employer, String confirmPassword) {

        validateUser(employer, confirmPassword);
        return employerService.add(employer);
    }

    @Override
    public Result registerCandidate(Candidate candidate, String confirmPassword) {

        //validateUser(candidate, confirmPassword);
        return candidateService.add(candidate);
    }

    private boolean checkIfPasswordMatch(String password, String confirmPassword) {

        boolean result = false;

        if (password.equals(confirmPassword)){
            result = true;
        }

        return result;
    }

    private Result validateUser(User user, String confirmPassword) {

        if (!checkIfPasswordMatch(user.getPassword(), confirmPassword)){
            return new ErrorResult("Girdiğiniz parolalar aynı değil! Lütfen kontrol edip tekrar deneyiniz.");
        }

        return null;
    }
}
