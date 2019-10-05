package vn.topica.itlab4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.topica.itlab4.entity.Type;
import vn.topica.itlab4.repository.TypeRepository;
import vn.topica.itlab4.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService
{
	@Autowired
	private TypeRepository repository;
	
	@Override
	public Type save(Type type)
	{
		return repository.save(type);
	}
	
	@Override
	public Type find(int id)
	{
		return repository.findTypeById(id);
	}
}
