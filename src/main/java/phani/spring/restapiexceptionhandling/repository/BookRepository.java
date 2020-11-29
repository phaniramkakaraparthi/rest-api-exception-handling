package phani.spring.restapiexceptionhandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import phani.spring.restapiexceptionhandling.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
