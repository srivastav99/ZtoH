package Inheritance;

import java.util.Scanner;

class Trainee{
	void Dserver(){
		System.out.println("You can use dummy servers.");
	}
}
class Storage extends Trainee{
	void Sserver(){
		Dserver();
		System.out.println("You can use Storage servers.");
	}
}
class Cloud extends Storage{
	void Cserver(){
		Sserver();
		System.out.println("You can use cloud servers.");
	}
}
class Citrix extends Cloud{
	void Ciserver(){
		Cserver();
		System.out.println("You can use citrix servers.");
	}
}
class Master extends Citrix{
	void Mserver(){
		Ciserver();
		System.out.println("You can use master server.");
	}
}



public class ServersAccess {

	public static void main(String[] args) {
		
		String[] trainee={"tabc1","tabc2","tabc3","tabc4"},cloud={"Cabc1","Cabc2","Cabc3"},storage={"sabc1","sabc2"},citrix={"iabc1","iabc2","iabc3"},mastercreds={"mabc"};
		
		 
		
		System.out.println("Enter password to server:");
		Scanner sc = new Scanner(System.in);
		
		String password=sc.next();
		
		if(password.contains("t")) {
				
			for(int i=0;i<trainee.length;i++)
			{
				if(password.equals(trainee[i])) {
				Trainee o = new Trainee();
				o.Dserver();
				break;
			}
			}
		}
		
		if(password.contains("s")) {
			
			for(int i=0;i<storage.length;i++)
			{
				if (password.equals(storage[i])) {
					Storage o= new Storage();
					o.Sserver();
					break;
				}
			}
		} 
		
		if(password.contains("C")) {
			
			for(int i=0;i<cloud.length;i++)
			{
				if (password.equals(cloud)) {
						Cloud o= new Cloud();
						o.Cserver();
				}
			}
		}
		if(password.contains("ci")) {
			
			for(int i=0;i<citrix.length;i++)
			{
		
				if (password.equals(citrix[i])) {
					Citrix o= new Citrix();
					o.Ciserver();
				}
			}
		}
		
		if(password.contains("m")) {
					
			for(int i=0;i<mastercreds.length;i++)
					{
				if (password.equals(mastercreds[i])) {
					Master o= new Master();
					o.Mserver();
				}
			}
		}
			
			
		
		
	}

}
