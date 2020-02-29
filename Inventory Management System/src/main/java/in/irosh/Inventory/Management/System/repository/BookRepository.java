package in.irosh.Inventory.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.irosh.Inventory.Management.System.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
