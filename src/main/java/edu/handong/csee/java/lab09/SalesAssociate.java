package edu.handong.csee.java.lab09;//package name
/**
 * SalesAssociate class is save people data
 * @author magic
 *
 */
public class SalesAssociate {//SalesAssociate class
	public String name;//declare string name to save people name
	public double sales;//declare double sales to save people sales
/**
 * getName method is return the name
 * @return
 */
	public String getName() {//getName method
		return name;//return name string
	}
/**
 * setName is save input data in name
 * @param name
 */
	public void setName(String name) {//setName method
		this.name = name;//save input data to name
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}
}
