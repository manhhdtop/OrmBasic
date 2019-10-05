Build an application use Spring Framework 5.x (Sring boot 2.x)
Business requirements:
- Manage:
    + Type (id, name)
    + Category (id, name, typeId)
    + Item (id, name)
    + ItemCategory(itemId, categoryId)
Allow
- List<Category>:
    + findByType(String type. int pageIndex, int pageSize) find categories by type name
- List<Item>:
    + findByCategory(String category. int pageIndex, int pageSize) find items by category’s name
- void:
    + updateCategory(Long id, String name)

Technical requirement
- Use Spring Data Jpa