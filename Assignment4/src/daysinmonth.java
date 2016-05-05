import java.util.Scanner;

public class daysinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("Enter the Month (1-12): ");
		Scanner in=new Scanner(System.in);
		month=in.nextInt();
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			System.out.println("31 Days");
		}
		else if (month==4 || month==6 || month==9 || month==11) {
			System.out.println("30 Days");
		}
		else if(month==2){
			System.out.println("28 or 29 Days");
		}
		else{
			System.out.println("Invalid Input!Enter month number between 1-12");
		}
	}

}
