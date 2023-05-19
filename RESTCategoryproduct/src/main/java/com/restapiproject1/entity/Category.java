package com.restapiproject1.entity;
import jakarta.persistence.*;
@Entity
@Table(name="category")
public class Category {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String cname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", cname=" + cname + "]";
	}
	public Category(long id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	public Category() {
		super();
	}
	
	
	
}
