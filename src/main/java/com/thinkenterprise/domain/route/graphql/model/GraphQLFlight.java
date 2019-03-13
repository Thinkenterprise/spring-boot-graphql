package com.thinkenterprise.domain.route.graphql.model;

import java.time.LocalDate;

public class GraphQLFlight  {

	private Long id;
	
	private double price;
	
	private LocalDate date;

	private GraphQLRoute route;

	public GraphQLFlight() {
		super();
	}
	
	public GraphQLFlight(double price, LocalDate date) {
		super();
		this.price = price;
		this.date = date;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public GraphQLRoute getRoute() {
		return route;
	}

	public void setRoute(GraphQLRoute route) {
		this.route = route;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
