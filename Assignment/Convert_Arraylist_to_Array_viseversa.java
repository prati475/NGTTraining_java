package assignment;

import java.util.ArrayList;

public class Convert_Arraylist_to_Array_viseversa {
	
	 public static void main(String[] args) {
		    ArrayList languages = new ArrayList<>();

		    
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    System.out.println("ArrayList: " + languages);

		    
		    String[] arr = new String[languages.size()];

		    
		    languages.toArray(arr);
		    System.out.print("Array: ");
		    for(String item:arr) {
		      System.out.print(item+", ");
		    }
		  }
		}


