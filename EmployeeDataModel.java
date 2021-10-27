package com.assesement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class EmployeeDataModel {
	public static void main(String[] args) {

		String name;
		double salary;
		String location;
		String email;
		String gender;
		Vector<Employee> vector = new Vector<>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\temps\\emps.txt"));
			String temp;
			br.readLine();
			while ((temp = br.readLine()) != null) {

				String words[] = temp.split("\\n");
				for (String w : words) {
					//System.out.println(words[0]);
					String t[] = words[0].split("\\|");
					// System.out.println(t[1]);
					name = t[1];
					salary = Double.parseDouble(t[2]);
					email = t[3];
					location = t[4];
					gender = t[5];

					vector.add(new Employee(name, salary, email, location, gender));

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Enumeration enu = vector.elements();
			  
	        System.out.println("The employee list are  as:");
	  
	        // Displaying the Enumeration
	        while (enu.hasMoreElements()) {
	            System.out.println(enu.nextElement());
	        }
		}

	}
}
