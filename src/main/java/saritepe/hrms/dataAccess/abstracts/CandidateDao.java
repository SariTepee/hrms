package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.Candidate;

import java.time.LocalDate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
    Candidate getByIdentityNumber(String identityNumber);
    Candidate getByEmail(String email);
}
