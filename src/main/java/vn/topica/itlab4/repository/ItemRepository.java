package vn.topica.itlab4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.topica.itlab4.entity.Item;

public interface ItemRepository extends PagingAndSortingRepository<Item, Integer>
{
	@Query("SELECT obj FROM Category c, Item obj WHERE c.id = " +
			"obj.categoryId AND c.name  = :category")
	Page<Item> findByCategory(String category, Pageable pageable);
	
}
