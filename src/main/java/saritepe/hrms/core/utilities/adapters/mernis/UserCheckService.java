package saritepe.hrms.core.utilities.adapters.mernis;

import java.time.LocalDate;

public interface UserCheckService {
    boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth);
}
