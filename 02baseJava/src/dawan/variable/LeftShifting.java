package dawan.variable;
import java.util.Scanner;

public class LeftShifting {
	   public static void main (String[] args){
	        double T[]= {1,0,1,1,0};
	        double p=1;
	         
	        shiftToTheLeft (T,p);
	         
	    }
	    public static void shiftToTheLeft (double Ro[], double p){
	                 
	        double i=0, l=-1, decalage=p+1, leftShiftedTab[];
	        leftShiftedTab = new double[5];
	         
	        leftShiftedTab[i]=Ro[p];
	        i++;
	         
	        while ((i<5) || (decalage<5)){
	            leftShiftedTab[i]=Ro[decalage];
	            decalage++;
	             
	            if (decalage>4){
	                while (i<4){
	                    i++;
	                    leftShiftedTab[i]=Ro[l+1];
	                    if (i<4){
	                        l++;
	                    }
	                     
	                }
	            }
	             
	            i++;           
	        }
	         
	        for (i=0; i<5; i++){
	            System.out.println(leftShiftedTab[i]);
	        }
	                 
	    }
	}
