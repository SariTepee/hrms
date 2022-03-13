package saritepe.hrms.business.abstracts;

import saritepe.hrms.core.utilities.result.DataResult;
import saritepe.hrms.core.utilities.result.Result;

import java.util.List;

public interface BaseEntityService<T> {
    Result add(T entity);

    Result update(T entity);

    Result delete(T entity);

    DataResult<List<T>> getAll();

    DataResult<T> getById(int id);
}
