package com.valentinaitken.test.domain;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	
	@OneToMany(fetch = LAZY, cascade = ALL, orphanRemoval = true)
	@OrderColumn(name = "position")
	private Set<Widget> widgets;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Widget> getWidgets() {
		return widgets;
	}

	public void setWidgets(Set<Widget> widgets) {
		this.widgets = widgets;
	}

}
