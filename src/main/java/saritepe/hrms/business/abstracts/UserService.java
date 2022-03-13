package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.entities.User;
import saritepe.hrms.core.utilities.result.Result;

import java.util.List;

public interface UserService extends BaseEntityService<User>{

    DataResult<User> getByEmail(String email);
}
