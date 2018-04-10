package edu.handong.csee.java.lab09;
import java.util.Scanner;
public class SalesReporter {
	private double highestSales=0;
	private double averageSales=0;
	private SalesAssociate[] team;
	private int numberOfAssociates;
	
	public void getData() {
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of sales associates");
		this.numberOfAssociates = Keyboard.nextInt();
		
		team = new SalesAssociate[this.numberOfAssociates];//allocate team array to use SalesAssociate
		
		for (int i=0; i<this.numberOfAssociates; i++) {//loop for input data
			System.out.println("Enter data for associate number"+i+1);//it show number of people
			System.out.print("Enter name of sales associate : ");//print message for input name
			Keyboard.nextLine();//for eat space
			String name =Keyboard.nextLine();//save input data to String name
			System.out.print("Enter associate's sales: ");
			double sales = Keyboard.nextDouble();
		}

	}
	
	public void computeAverage() {
		
	}
	public void computehighest() {
		
	}
	public void displayResults() {
		
	}
	public static void main(String[] args) {
		SalesReporter p = new SalesReporter();
		p.getData();
		p.computeAverage();
		p.computehighest();
		p.displayResults();
	}

}
