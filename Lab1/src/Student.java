import java.util.Scanner;

public class Student {
	private String data;
	private String[] id_split;
	private int id;
	
	public Student() 
	{
		
	}
	public int splitstudent() {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter Student ID: ");
	    data = input.nextLine();
	    String[] id_split = data.split("-");
	    id = Integer.parseInt(id_split[0]);
	    System.out.print(id + 5);
	    return id+5;
	}
}
