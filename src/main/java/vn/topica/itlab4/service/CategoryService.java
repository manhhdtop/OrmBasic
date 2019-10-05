package vn.topica.itlab4.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.topica.itlab4.entity.Category;

import java.util.List;

@Service
public interface CategoryService
{
	@Transactional
	Category save(Category category);
	
	@Transactional
	Category update(Category category);
	
	@Transactional
	Category find(int id);
	
	@Transactional
	List<Category> findByType(String type, int pageIndex, int pageSize);
}
