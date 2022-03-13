package saritepe.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saritepe.hrms.business.abstracts.CandidateService;
import saritepe.hrms.core.dataAccess.abstracts.CandidateDao;
import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;
import saritepe.hrms.entities.concretes.Candidate;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }


    @Override
    public Result add(Candidate entity) {
        return null;
    }

    @Override
    public Result update(Candidate entity) {
        return null;
    }

    @Override
    public Result delete(Candidate entity) {
        return null;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return null;
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return null;
    }
}
