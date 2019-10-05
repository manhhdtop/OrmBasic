package vn.topica.itlab4.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.topica.itlab4.entity.Item;

import java.util.List;

@Service
public interface ItemService
{
	@Transactional
	Item save(Item item);
	
	@Transactional
	List<Item> findByCategory(String category, int pageIndex, int pageSize);
}
