package com.example.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "ITEMS")
public class Item {
	
	@Id
	@SequenceGenerator(name = "ITEM_ID_GENERATOR", sequenceName = "ITEM_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_ID_GENERATOR")
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "PRICE")
	private Integer price;
	
	@Column(name = "DELETED_AT")
	private LocalDateTime deletedAt;
	
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public LocalDateTime getDeletedAt() {
		return this.deletedAt;
	}
	
	public void setDeletedAt(LocalDateTime deletedAt) {
		this.deletedAt = deletedAt;
	}
}
