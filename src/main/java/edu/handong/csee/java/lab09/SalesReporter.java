package edu.handong.csee.java.lab09;//package name
import java.util.HashMap;
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
	private HashMap<String,Double> team;//this array save people data. type is salesAssociate 
	private int numberOfAssociates;//number of people
	/**
	 * getData method is save input data to team array.
	 */
	public void getData() {//getData method
		Scanner Keyboard = new Scanner(System.in);//declare keyboard to use scanner 
		String name;//save name
		double sales;//save sales

		System.out.println("Enter number of sales associates");//print message for input number of people
		this.numberOfAssociates = Keyboard.nextInt();//save number of people

		team = new HashMap<String,Double>();//allocate team array to use SalesAssociate

		boolean done = false;
		int i=0;
		while(!done) {
			
		
		//for (int i=0; i<this.numberOfAssociates; i++) {//loop for input data
			System.out.println("Enter data for associate number"+(i+1));//it show number of people
			i++;
			System.out.print("Enter name of sales associate : ");//print message for input name
			Keyboard.nextLine();//for eat space
			name =Keyboard.nextLine();//save input data to String name

			System.out.print("Enter associate's sales: ");//print message
			sales = Keyboard.nextDouble();//save input data to sales

			//team[i] = new SalesAssociate();//allocate memory to team array

			team.put(name, sales);//save input data to team array name //debug
			//team[i].setSales(sales);//save input data to team array sales
			System.out.println("Do you want to add one more Salesman?: ");
			if(Keyboard.nextLine().equalsIgnoreCase("yes"))
				done = true;
		//}

	}
	/**
	 * computeAverage is method that compute average of sales and print it
	 */
	public void computeAverage() {//computeAverage method
		double sum=0;//declare sum local variable to save sum of sales
		for(Double sale : team.values()) {//loop for add sales to sum
			sum = sum + sale;//add sales to sum
		}
		sum = sum/team.size();//sum is divided number of array

		System.out.println("\nAverage Sales per associate is $"+sum);//print Sales average
		this.averageSales= sum;//save average to averageSales
	}
	/**
	 * computehighest method is save highest sales
	 */
	public void computehighest() {//computehighest method
		Double currentHighestValue = 0.0;
		
		for(Double currentValue:team.values()) {//loop for save highest sales
			if(currentHighestValue < currentValue)//if sales is greater than highestSales
				currentHighestValue = currentValue;//save highest sales to highestSales
		}
		System.out.println("The highest sales figure is $"+currentHighestValue);//print highest sales
	}
	/**
	 * displayResults is print team array
	 */
	public void displayResults() {//displayResults method
		System.out.println("The following had the hightest sales:");//print highest sales people data
		
		for(int i=0; i<this.numberOfAssociates; i++) {//add loop for print data
			if(this.highestSales == team[i].getSales()) {//condition for print highest people
				System.out.println("Name: "+team[i].getName());//print highest people name
				System.out.println("Sales: $"+team[i].getSales());//print highest people sales
				System.out.println(team[i].getSales()-this.averageSales+" above the average.");//print over sales
			}
		}
		System.out.println("\nThe rest performed as follows: ");//print message
		for(int i=0; i<this.numberOfAssociates; i++) {//print rest of people
			if(this.highestSales != team[i].getSales()) {//if people is not highest people
				System.out.println("Name: "+team[i].getName());//print people name
				System.out.println("Sales: $"+team[i].getSales());//print people sales
				if(team[i].getSales()>this.averageSales)//if people sales is greater than average
					System.out.println(team[i].getSales()-this.averageSales+" above the average.");//print sales
				else//if people sales is smaller than average
					System.out.println(this.averageSales-team[i].getSales()+" below the average.");//print sales

			}
		}
	}
	/**
	 * main method.
	 * @param args
	 */
	public static void main(String[] args) {//main method
		SalesReporter p = new SalesReporter();//declare instance variable
		p.getData();//debug //call getData method
		p.computeAverage();//call computeAverage method
		p.computehighest();//call computehighest method
		p.displayResults();//call displayResults method
	}

}
