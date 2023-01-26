
public class person {
private String firstName;
private String lastName;
 
public person(){
	firstName = "";
	lastName ="";
	
}
public person(String first,String last) {
	setName(first,last);
	}
public String toString() {
	return firstName+" "+lastName;
}
public void setName(String first,String last) {
	firstName = first;
	lastName = last;
	}
public String  getFirstName() {
	return firstName;
}

//Method to return lastName
public String getLastName() {
	return lastName;	
		}
}


