package edu.handong.csee.java.lab09;//package name
import java.util.Scanner;//use scanner class
/**
 * SalesReporter class is save people name and sales to use keyboard. 
 * And print highest people and average.
 * @author magic
 *
 */
public class SalesReporter {//class name
	private double highestSales=0;//save highest of sales
	private double averageSales=0;//save average of sales
	private SalesAssociate[] team;//this array save people data. type is salesAssociate 
	private int numberOfAssociates;//number of people
	/**
	 * getData method is save input data to team array.
	 */
	public void getData() {//getData method
		Scanner Keyboard = new Scanner(System.in);//declare keyboard to use scanner 
		
		System.out.println("Enter number of sales associates");//print message for input number of people
		this.numberOfAssociates = Keyboard.nextInt();//save number of people
		
		team = new SalesAssociate[this.numberOfAssociates];//allocate team array to use SalesAssociate
		
		for (int i=0; i<this.numberOfAssociates; i++) {//loop for input data
			System.out.println("Enter data for associate number"+i+1);//it show number of people
			System.out.print("Enter name of sales associate : ");//print message for input name
			Keyboard.nextLine();//for eat space
			String name =Keyboard.nextLine();//save input data to String name
			
			System.out.print("Enter associate's sales: ");//print message
			double sales = Keyboard.nextDouble();//save input data to sales
			
			team[i].setName(name);//save input data to team array name //debug
			team[i].setSales(sales);//save input data to team array sales
		}

	}
	
	public void computeAverage() {
		double sum=0;//declare sum local variable to save sum of sales
		for(int i=0; i<this.numberOfAssociates; i++) {//loop for add sales to sum
			sum = sum + team[i].getSales();//add sales to sum
		}
		sum = sum/numberOfAssociates;//sum is divided number of array
		
		System.out.println("Average Sales per associate is &"+sum);//print Sales average
		this.averageSales= sum;//save average to averageSales
	}
	
	public void computehighest() {
		for(int i=0; i<this.numberOfAssociates; i++) {//loop for save highest sales
			if(this.highestSales < team[i].getSales())//if sales is greater than highestSales
				this.highestSales = team[i].getSales();//save highest sales to highestSales
		}
		System.out.println("The highest sales figure is &"+this.highestSales);//print highest sales
	}
	
	public void displayResults() {
		System.out.println("The following had the hightest sales:");//print highest sales people data
		for(int i=0; i<this.numberOfAssociates; i++) {//add loop for print data
			if(this.highestSales == team[i].getSales()) {//condition for print highest people
				System.out.println("Name: "+team[i].getName());//print highest people name
				System.out.println("Sales: "+team[i].getSales());//print highest people sales
				System.out.println(team[i].getSales()-this.averageSales+" above the average.");//print over sales
			}
		}
		for(int i=0; i<this.numberOfAssociates; i++) {//print rest of people
			if(this.highestSales != team[i].getSales()) {//if people is not highest people
				System.out.println("Name: "+team[i].getName());//print people name
				System.out.println("Sales: "+team[i].getSales());//print people sales
				if(team[i].getSales()>this.averageSales)//if people sales is greater than average
					System.out.println(team[i].getSales()-this.averageSales+" above the average.");//print sales
				else//if people sales is smaller than average
					System.out.println(this.averageSales-team[i].getSales()+" below the average.");//print sales
				
			}
		}
	}
	
	public static void main(String[] args) {
		SalesReporter p = new SalesReporter();
		p.getData();//debug
		p.computeAverage();
		p.computehighest();
		p.displayResults();
	}

}
