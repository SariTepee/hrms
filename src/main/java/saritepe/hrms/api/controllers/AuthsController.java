package saritepe.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import saritepe.hrms.business.abstracts.AuthService;
import saritepe.hrms.core.utilities.result.ErrorDataResult;
import saritepe.hrms.entities.concretes.Candidate;
import saritepe.hrms.entities.concretes.Employee;
import saritepe.hrms.entities.concretes.Employer;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auths")
public class AuthsController {
    AuthService authService;

    @Autowired
    public AuthsController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/registerEmployee")
    public ResponseEntity<?> registerEmployee(@Valid @RequestBody Employee employee, String confirmPassword){
        return ResponseEntity.ok(this.authService.registerEmployee(employee, confirmPassword));
    }

    @PostMapping("/registerEmployer")
    public ResponseEntity<?> registerEmployer(@Valid @RequestBody Employer employer, String confirmPassword) {
        return ResponseEntity.ok(this.authService.registerEmployer(employer, confirmPassword));
    }

    @PostMapping("/registerCandidate")
    public ResponseEntity<?> registerCandidate(@Valid @RequestBody Candidate candidate, String confirmPassword) {
        return ResponseEntity.ok(this.authService.registerCandidate(candidate, confirmPassword));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exception) {
        Map<String, String> validationErrors = new HashMap<String, String>();
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors = new ErrorDataResult<>(validationErrors, "Doğrulama hataları");
        return errors;
    }
}
