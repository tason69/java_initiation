package dawan.variable;
import java.util.Scanner;

public class AnneeBissextile {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	
	int var1 = 0;
	int n= 244;
	do {
		System.out.print("Entrez votre code secret de 0 à 1000"+ var1);
		var1 = input.nextInt();
		if(var1<n) {
			System.out.println("votre nombre est trop petit");
		}
		else if(var1>n){
			System.out.println("votre nombre est trop grand");
		}
		else if(var1==n) {
			System.out.println("bravo");
		}
		
	}	while(var1!=n);
	}	

}
