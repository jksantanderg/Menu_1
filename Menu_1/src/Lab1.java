import java.util.Scanner;
public class Lab1{
	

	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the main menu");


		int option = 0;
		while(option !=4){
			System.out.println("============");
			System.out.println("Options Menu");
			System.out.println("============");
			System.out.println("1. Enter three character strings");
			System.out.println("2. Enter two real numbers greater than zero");
			System.out.println("3. Enter three whole number arrays");
			System.out.println("4. Exit");
			System.out.print("Enter the option: ");

					option = sc.nextInt();
            
 
			
			switch(option){
				case 1:
				String chain1 = "";
				String chain2 = "";
				String chain3 = ""; 
				
				System.out.println("enter the chain1 no greater than 10 characters");
				chain1=sc.next();
				System.out.println("enter the chain2 no greater than 10 characters");
				chain2=sc.next();
				System.out.println("enter the chain3 no greater than 10 characters");
				chain3=sc.next();
			
			

				
				int length1=chain1.length();
				System.out.println("the string has" +length1+ "letters");
				int length2=chain2.length();
				System.out.println("the string has" +length2+ "letters");
				int length3=chain3.length();
				System.out.println("the string has" +length3+ "letters");
				System.out.println("the concatenated chains are: "+"\n"+chain1+"\n"+chain2+"\n"+chain3);
				
				
				int posit = 0;
				int pos = 0;
				
				
				System.out.println("Do you wanna know about one character position? enter 1 for yes or no? What position? for no");
				posit = sc.nextInt();
				if(posit!=1){
					System.out.println("okay, see you later");
				}
				else if(posit==1){
					System.out.println("enter the position");
					pos =sc.nextInt();
				
					    posicion( pos, chain1, chain2, chain3);
				}
				
				break;

				case 2:
				double num1;
				double num2;
				String cha2 = "",cha1 = "";
				
				System.out.println("Enter one real numbers greater than zero");
				cha1=sc.next();
				System.out.println("Enter one real numbers greater than zero");
				cha2=sc.next();
				
				num1 = Double.parseDouble(cha1);
				num2 = Double.parseDouble(cha2);
				
				divisionNumber(num1,num2);
				residuoDivision(num1,num2);
				
				break;
					
				case 3:
				break;

					

				case 4:
					System.out.println("Thank you for using this program. Good bye!");
				break;
			
			}
	
		}
	}	
	
	
	/**gives the position of a letter of each string*/
	public static void posicion(int pos,String chain1,String chain2,String chain3){
		char ch1 ;
		char ch2 ;
		char ch3 ;
		
		ch1 = chain1.charAt(pos);
		ch2 = chain2.charAt(pos);
		ch3 = chain3.charAt(pos);
		
		System.out.println("char cadena1: "+ch1+" char cadena2: "+ch2+" char cadena3: "+ch3);
		
	}

	
	/**perform division operation*/
	public static void divisionNumber(double num1, double num2){
		double division = 0;
		division = num1/num2;
	
	System.out.println("the division of the numbers is  " +division);
	}
	
	
	/**perform the operation of saying what is the remainder of the division*/
	public static void residuoDivision(double num1,double num2){
		double residuo = 0;
		residuo = num1%num2;
		
    System.out.println("el residuo de la division es  "+residuo);
	}
	
	
	
	
}