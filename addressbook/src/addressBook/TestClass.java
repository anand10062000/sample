package addressBook;

import javax.swing.*;
class TestClass{
 
public static void main(String args[]){
AddressBook add = new AddressBook();
int ch;
 String name;
 
while(true){
 name = JOptionPane.showInputDialog("Enter 1 to add\n Enter 2 to search\n Enter 3 to remove\n");
     ch = Integer.parseInt(name);
      switch(ch){
         case 1:
                add.addPerson();
                break;
         case 2:
                name = JOptionPane.showInputDialog("Enter The Name");
                add.search(name);
                break;
         case 3:
                name = JOptionPane.showInputDialog("Enter The Name");
                add.remove(name);
                break;
         case 4: 
                 System.exit(0);
       }
      }
   }
 }