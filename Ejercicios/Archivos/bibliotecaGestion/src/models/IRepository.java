package models;

import java.util.List;
import java.util.Optional;

public interface IRepository<T> {
    void add(T entity);
    Optional<T> findById(int id);
    List<T> findAll();
    List<T> findByAuthor(String autor);
    int getIdMax();
}
