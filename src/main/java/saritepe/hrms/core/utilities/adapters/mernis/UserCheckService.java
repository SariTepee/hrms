package saritepe.hrms.core.utilities.adapters.mernis;

import java.time.LocalDate;

public interface UserCheckService {
    boolean checkIfRealPerson(String ıdentityNumber, String firstName, String lastName, LocalDate dateOfBirth);
}
