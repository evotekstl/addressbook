import java.util.ArrayList;
import java.util.Scanner;

public class Name_entry {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons = new ArrayList<Person>();
		int x=0;
		// Display menu options
	do{	
		System.out.println("1.add Record");
		
		System.out.println("2.Delete Record");
		
		System.out.println("3.update record");
		
		System.out.println("4.serch via last name");
		
		System.out.println("5.search via First name");
		
		System.out.println("6.search via telephone#");
		
		System.out.println("7.exit");
		System.out.println("Enter Choice");
		
		// switch into menu
		switch (x) {
		case 1:// Add person
			System.out.println("Enter your full name like (Name,Street, City, State, Zip, Cellphone#.");
			Scanner sc = new Scanner(System.in);
			String person = sc.nextLine();
			Person p1 = new Person();

			String[] fullnameA = person.split(",");
			String[] Name = fullnameA[0].split(" ");
			String Mname = "";
			for (int j = 0; j < Name.length; j++) {
				if (j == 0) {
					p1.setFname(Name[j]);
				} else if (j == Name.length - 1) {
					p1.setLname(Name[Name.length - 1]);
				} else {
					Mname = Mname + Name[j] + " ";
				}
				break;
			}
			p1.setMname(Mname);
			Address add = new Address();
			add.setStreet(fullnameA[1]);
			add.setCity(fullnameA[2]);
			add.setState(fullnameA[3]);
			add.setZip(fullnameA[4]);
			p1.setAddress(add);
			p1.setCellNo(fullnameA[5]);

			System.out.println(fullnameA[0] + " " + fullnameA[2]);
			p1.setFname(fullnameA[0]);

			persons.add(p1);
			break;
		case 2:
			// delete record
			System.out.println("Enter PhoneNo. of person you want to delete.");
			Scanner sc1 = new Scanner(System.in);
			String cellNo = sc1.nextLine();
			for (int i = 0; i < persons.size(); i++) {
				if (cellNo.equals(persons.get(i).getCellNo())) {
					persons.remove(i);
					break;
				}

			}
			break;
		case 3:
			// updating records
			System.out.println("Enter PhoneNo. of person you want to delete.");
			Scanner sc2 = new Scanner(System.in);
			String telephone = sc2.nextLine();
			for (int i = 0; i < persons.size(); i++) {
				if (telephone.equals(persons.get(i).getCellNo())) {
					System.out.println("Enter New Cell Number.");
					persons.get(i).setCellNo(sc2.nextLine());
				}
			}
			break;
		case 4:
			// search for record via First Name
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter First Name to Search for");			
			String fname = sc3.nextLine();
			for(int i = 0; i< persons.size();i++){
			if (fname.equals(persons.get(i).getFname())){
				System.out.println("Here are the results");
				System.out.println(persons.get(i).toString());
					break;
				}
			}
			
		case 5:
						// search for record via Last Name
						System.out.println("Enter Last Name to Search for");
						Scanner sc4 = new Scanner(System.in);
						String lname = sc4.nextLine();
						for (int i = 0; i < persons.size(); i++) {
						if (lname.equals(persons.get(i).getLname())){
							System.out.println("Here are the results");
							System.out.println(persons.get(i).toString());
							break;
							}
						}
						break;
		case 6:
			// search for record via Phone NO.
			Scanner sc6 = new Scanner(System.in);
			String tele = sc6.nextLine();
			for (int i = 0; i < persons.size(); i++) {
				if (tele.equals(persons.get(i).getCellNo())) {
					System.out.println("Enter New Cell Number.");
					persons.get(i).setCellNo(sc6.nextLine());
					System.out.println("Record updated");
					System.out.println(persons.get(i).toString());
					break;
				}
			}
			break;
		case 7:
			// exit
			System.exit(0);
			//break;

		}//end switch
	}while (x!=7);
	}//end main methdo

}//end class
