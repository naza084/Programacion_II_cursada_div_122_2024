package repository;

import java.util.List;
import java.util.Optional;

public interface IRepository<T> {
    void add(T entity);
    Optional<T> findById(int id);
    List<T> findAll();
}
