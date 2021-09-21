package addressBook;

import javax.swing.*;
import java.util.*;
 
class AddressBook {
ArrayList<PersonInfo> persons;
 
      public AddressBook ( ) {
            persons = new ArrayList<PersonInfo>();
}
 
        public void addPerson( ) {
 
String name = JOptionPane.showInputDialog("Enter name");
String add = JOptionPane.showInputDialog("Enter address");
String pNum = JOptionPane.showInputDialog("Enter phone no");
 
          //construct new person object
          PersonInfo p = new PersonInfo(name, add, pNum);
      persons.add(p);
       }
 
            public void search(String name){
            
            for(int i = 0; i < persons.size(); i++){
               PersonInfo p = (PersonInfo)persons.get(i); 
               if(name.equals(p.name)){
                p.print();
                  
             }
      } 
                   
   }
 
              public void remove(String name){
             for(int i = 0; i < persons.size(); i++){
             PersonInfo p = (PersonInfo)persons.get(i); 
               if(name.equals(p.name)){
                persons.remove(i); }
                }
 
 
      }
 
}
