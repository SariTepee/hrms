package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.entities.User;

public interface UserService extends BaseEntityService<User>{
    DataResult<User> getByEmail(String email);
}
