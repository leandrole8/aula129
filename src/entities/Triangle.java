package entities;

import entities.enums.Color;

public class Triangle extends Shape {
	
	private Double base;
	private double altura;
	
	public Triangle() {
		super();
	}
	
	public Triangle(Color color, Double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura / 2;
	}
	
}
