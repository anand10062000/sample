package addressBook;
import javax.swing.*;
public class PersonInfo { 
 
  String name;
    String address;
   String phoneNum;
 
 
   public PersonInfo(String n, String add, String phone){
 
    name = n;
    address = add;
    phoneNum = phone; 
  }  
 
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhoneNum() {
	return phoneNum;
}

public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}

public void print(){
 
    JOptionPane.showMessageDialog(null, "Name:" +name+"Address:" +address+ "Phone No.:"+ phoneNum);
  }
 
}
