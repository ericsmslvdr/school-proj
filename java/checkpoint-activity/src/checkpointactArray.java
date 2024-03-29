
public class checkpointactArray {

	public static void main(String[] args) {
		fifth();
	}

	public static void first() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int exit = 0;
		do {
			int ilan = 0;
			System.out.print("Enter the number of elements: ");
			int num = input.nextInt();
			
			int[] myarray = new int[num];
			System.out.print("Enter the number search: ");
			int search = input.nextInt();
			
			System.out.print("Enter "+num+" values ");
			for(int i=0; i<myarray.length; i++) {
				myarray[i] = input.nextInt();
				if (search == myarray[i]) {
					ilan++;
				}
			}
			System.out.println("The number "+search+" has appeared "+ilan+" times");
			
			System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
			exit = input.nextInt();
			System.out.println("====================================================================");
		}while(exit!=0);
	}

	public static void second() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int exit = 0;
		do{
			System.out.print("Enter the number of elements: ");
			int num = input.nextInt();
		
			int[] myarray = new int[num];
			System.out.print("Enter "+num+" values: ");
			for(int i=0; i<myarray.length; i++) {
				myarray[i] = input.nextInt();
			}
		
			int first = myarray[0];
			int last = myarray[num-1];
			if (first == last) {
				System.out.println("The first and last elements are EQUAL in value");
			}
			else {
				System.out.println("The first and last elements are NOT EQUAL in value");
			}
			System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
			exit = input.nextInt();
			System.out.println("====================================================================");
		}while(exit!=0);
	}
	
	public static void third() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int exit = 0;
		do {
			int[] myarray1 = new int[3];
			int[] myarray2 = new int[3];
			System.out.print("Enter the 3 values for the first array: ");
			for (int i=0; i<myarray1.length; i++){
				myarray1[i]= input.nextInt();
			}
			
			System.out.print("Enter the 3 values for the first second: ");
			for (int i=0; i<myarray2.length; i++){
				myarray2[i] = input.nextInt();
			}
			System.out.println("The middle values of the two arrays are: "+ myarray1[1] +" "+ myarray2[1]);
			
			System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
			exit = input.nextInt();
			System.out.println("====================================================================");
		}while(exit!=0);

	}
	
	public static void fourth() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int exit = 0;
		do {
			System.out.print("Enter the number of elements: ");
			int num = input.nextInt();
			
			int[] myarray1 = new int[num];
			int[] myarray2 = new int[num];
			System.out.print("Enter "+num+" values ");
			for(int i=0; i<num; i++) {
				myarray1[i] = input.nextInt();
			}
			
			int first = myarray1[num-1];
			int last = myarray1[0];
			
			for(int i=0; i<num; i++) {
				myarray2[i] = myarray1[i];
				myarray2[0] = first;
				myarray2[num-1] = last;
			}
			System.out.print("The modified array now is: ");
			for(int i=0; i<num; i++) {
				System.out.print(myarray2[i]+" ");
			}
			System.out.println();
			System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
			exit = input.nextInt();
			System.out.println("====================================================================");
		}while(exit!=0);

	}
	
	public static void fifth() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int exit = 0;
		do {
			int evenNum=0, oddNum=0;
			System.out.print("Enter the number of elements: ");
			int num = input.nextInt();
			int[] myarray = new int[num];
			
			System.out.print("Enter the perfect sum: ");
			int perfect = input.nextInt();			
			
			System.out.print("Enter "+num+" values: ");
			for(int i=0; i<myarray.length; i++) {
				myarray[i] = input.nextInt();
				}

			for(int i=0; i<myarray.length; i++) {
					if(myarray[i] % 2 == 0) {
						evenNum = evenNum + myarray[i];
					}
					else {
						oddNum = oddNum + myarray[i];
					}
				}
			
			if((evenNum == perfect) || (oddNum == perfect)) {
				System.out.println("The array contains the perfect sum");
			}
			else {
				System.out.println("The array contains no perfect sum");
			}
				
			System.out.print("Do you want to try again? press 0 to exit or any number to continue: ");
			exit = input.nextInt();
			System.out.println("====================================================================");
		}while(exit!=0);

	}
	
}
	

