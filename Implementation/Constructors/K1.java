package Constructors;

public class K1 {
		  int modelYear;
		  String modelName;

		  public K1(int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }

		  public static void main(String[] args) {
		    K1 myCar = new K1(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		  }
		}


