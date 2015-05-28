package com.ys.test;

public class UserName  
{ 
  public static String newMember(String[] existingNames, String newName)  
  { 
        int number = 0; 
        String name = newName; 

        boolean found = false; 
        do 
        { 
            found = false; 
            for (int i=0; i < existingNames.length; i++) 
            { 
                if (existingNames[i].equals(name)) 
                { 
                    found = true; 
                    break; 
                } 
            } 

            if (found) 
            { 
                number++; 
                name = newName + number; 
            } 

        } while(found); 

        return name; 

  } 
   
  
  public static void main(String args[]){
	 String name = newMember(new String[]{"Kittu","Nishu"},"Shashant");
	 System.out.println("Name is : "+name);
  }
} 