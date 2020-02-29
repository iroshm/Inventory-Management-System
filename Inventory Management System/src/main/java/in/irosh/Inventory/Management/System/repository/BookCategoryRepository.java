package in.irosh.Inventory.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.irosh.Inventory.Management.System.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path = "book-categoty")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
