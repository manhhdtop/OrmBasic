package vn.topica.itlab4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import vn.topica.itlab4.entity.Category;
import vn.topica.itlab4.repository.CategoryRepository;
import vn.topica.itlab4.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryRepository repository;
	
	@Override
	public Category save(Category category)
	{
		return repository.save(category);
	}
	
	@Override
	public Category update(Category category)
	{
		return repository.save(category);
	}
	
	@Override
	public Category find(int id)
	{
		return repository.findById(id);
	}
	
	@Override
	public List<Category> findByType(String type, int pageIndex, int pageSize)
	{
		Page<Category> page = repository.findByTypeId(type, new QPageRequest(pageIndex,
				pageSize));
		return page.getContent();
	}
}
