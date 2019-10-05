package vn.topica.itlab4.entity;

import javax.persistence.*;

@Entity
@Table(name = "orm_item")
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name = "category_id")
	private int categoryId;
	
	public Item()
	{
		this.id = -1;
		this.name = "";
		this.categoryId = -1;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getCategoryId()
	{
		return categoryId;
	}
	
	public void setCategoryId(int categoryId)
	{
		this.categoryId = categoryId;
	}
	
	@Override
	public String toString()
	{
		return "Item[ID=" + id + ";Name='" + name + "';CategoryID=" + categoryId + "]";
	}
}
