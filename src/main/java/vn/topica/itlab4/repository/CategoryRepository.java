package vn.topica.itlab4.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import vn.topica.itlab4.entity.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category,
		Integer>
{
	@Query("SELECT obj FROM Category obj, Type t WHERE obj.typeId = t.id AND " +
			"t.name=:type")
	Page<Category> findByTypeId(String type, Pageable pageable);
	
	Category findById(int id);
	
}
