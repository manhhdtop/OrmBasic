package vn.topica.itlab4.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.topica.itlab4.entity.Type;

@Service
public interface TypeService
{
	@Transactional
	Type save(Type type);
	
	Type find(int id);
}
