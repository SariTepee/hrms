package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.entities.User;
import saritepe.hrms.core.utilities.result.Result;

import java.util.List;

public interface UserService {
    DataResult<List<User>> getAll();

    Result add(User user);

    Result delete(User user);

    DataResult<User> findByEmail(String email);
}
