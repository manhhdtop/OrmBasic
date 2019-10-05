package vn.topica.itlab4.entity;

import javax.persistence.*;

@Entity
@Table(name = "orm_category")
public class Category
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name = "type_id")
	private int typeId;
	
	public Category()
	{
		this.id = -1;
		this.name = "";
		this.typeId = -1;
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
	
	public int getTypeId()
	{
		return typeId;
	}
	
	public void setTypeId(int typeId)
	{
		this.typeId = typeId;
	}
	
	
	@Override
	public String toString()
	{
		return "Category[ID=" + id + ";name='" + name + "';TypeID="
				+ typeId + "]";
	}
	
}
