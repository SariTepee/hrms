package saritepe.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.entities.concretes.VerificationCode;
import saritepe.hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

public interface VerificationCodeCandidateDao extends JpaRepository<VerificationCodeCandidate, Integer> {
    VerificationCodeCandidate getByCandidate_Id (int candidateId);
}
