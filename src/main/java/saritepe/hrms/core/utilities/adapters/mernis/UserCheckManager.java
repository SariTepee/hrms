package saritepe.hrms.core.utilities.adapters.mernis;

import org.springframework.stereotype.Service;

import java.time.LocalDate;


public class UserCheckManager implements UserCheckService{

    @Override
    public boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth) {
        return false;
    }
}
