package saritepe.hrms.core.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

public interface VerificationCodeCandidateDao extends JpaRepository<VerificationCodeCandidate, Integer> {
}
