package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.CandidateService;
import saritepe.hrms.business.abstracts.UserService;
import saritepe.hrms.core.utilities.adapters.mernis.UserCheckService;
import saritepe.hrms.core.utilities.result.*;
import saritepe.hrms.dataAccess.abstracts.CandidateDao;
import saritepe.hrms.entities.concretes.Candidate;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private UserService userService;
    private UserCheckService userCheckService;

    @Autowired
    public CandidateManager(CandidateDao candidateDao, UserService userService, UserCheckService userCheckService) {
        this.candidateDao = candidateDao;
        this.userService = userService;
        this.userCheckService = userCheckService;
    }

    @Override
    public Result add(Candidate candidate) {
        checkCandidate(candidate);
        //this.candidateDao.save(candidate);
        return new SuccessResult("Müşteri başarılı bir şekilde eklendi");
    }

    @Override
    public Result update(Candidate candidate) {
        return null;
    }

    @Override
    public Result delete(Candidate candidate) {
        return null;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getById(id));
    }

    @Override
    public DataResult<Candidate> getByIdentityNumber(String identityNumber) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getByIdentityNumber(identityNumber));
    }

    @Override
    public DataResult<Candidate> getByEmail(String email) {
        return new SuccessDataResult<Candidate>(this.candidateDao.getByEmail(email));
    }

    private boolean checkEmailExists(String email)  {
        boolean result = false;

        if (this.userService.getByEmail(email).getData() == null){
            result = true;
        }
        return result;
    }

    private boolean checkIdentityNumberExist(String identityNumber) {
        boolean result = false;

        if (this.candidateDao.getByIdentityNumber(identityNumber) == null){
            result = true;
        }
        return result;
    }

    private Result checkCandidate(Candidate candidate){
        if (!checkEmailExists(candidate.getEmail())) {
            return new ErrorResult("Girilen email başka bir hesaba ait");
        }

        if (!checkIdentityNumberExist(candidate.getIdentityNumber())) {
            return new ErrorResult("Girilen tc kimlik numarası başka bir hesaba ait");
        }

        if (!userCheckService.checkIfRealPerson(candidate.getIdentityNumber(), candidate.getFirstName(), candidate.getLastName(), candidate.getDateOfBirth())) {
            return new ErrorResult("Girilen müşteri TC vatandaşı değildir. Lütfen bilgileri kontrol ediniz");
        }
        return null;
    }
}
