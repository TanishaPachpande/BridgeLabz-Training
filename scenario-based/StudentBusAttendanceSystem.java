import java.util.Scanner;

public class StudentBusAttendanceSystem{
public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	String name="", status="";
	int present=0;
	for(int i=1;i<=10;i++){
		System.out.println("Enter student "+i+" name: ");
		name=input.nextLine();
		System.out.println(name +" is Present or Absent?: ");
		status = input.nextLine().toLowerCase();
		if(status.equals("present")){
			present++;
		}
		System.out.println("=========================================");
	}


	System.out.println("The total present students count is: " + present);
	System.out.println("The total absent students count is: " + (10-present));
}
}