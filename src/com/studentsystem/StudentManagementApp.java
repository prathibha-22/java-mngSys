package com.studentsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<Student>();
		Student s = null;
		System.out.println("-------Student Management System-------");
		while(true) {
			System.out.println("1.Add Student");
			System.out.println("2.Show Students");
			System.out.println("3.Remove Student");
			System.out.println("4.Get Student By Rollno");
			System.out.println("5.Exit");
			Scanner in = new Scanner(System.in);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			int options = in.nextInt();
			if(options==1) {

				System.out.println("Student Details::");

				System.out.println("Enter Name");
				String name = in.next();

				System.out.println("Enter RollNo");
				int rollNo = in.nextInt();




				System.out.println("Enter PhoneNo");
				long phoneNo = in.nextLong();


				//System.out.println("Enter Class (10)");
				//String className = "11";//in.nextLine();

				System.out.println("Enter Date of Birth");
				String dob = in.next();


				System.out.println("Enter Address");
				String address = in.next();

				Map<String,Integer> map = new HashMap<String,Integer>();  
				System.out.println("Enter Maths Marks");
				int mathsM = in.nextInt();
				System.out.println("Enter Physics Marks");
				int physicsM = in.nextInt();
				System.out.println("Enter Chemistry Marks");
				int chemistryM = in.nextInt();
				System.out.println("Enter English Marks");
				int EnglishM = in.nextInt();
				System.out.println("Enter Hindi Marks");
				int HindiM = in.nextInt();

				map.put("Maths", mathsM);
				map.put("Physics", physicsM);
				map.put("Chemistry", chemistryM);
				map.put("English", EnglishM);
				map.put("Hindi", HindiM);



				s = new Student(rollNo, name, "11", dob, phoneNo, address, map);
				slist.add(s);

			}else if(options==2) {
				System.out.println("List of Student Details::\n");
				for (Student student : slist) {
					System.out.println("Student RollNo:"+student.getRollNo());
					System.out.println("Student Name:"+student.getName());
					System.out.println("Student Class:"+student.getClassName());
					System.out.println("Student DOB:"+student.getDob());
					System.out.println("Student PhoneNo:"+student.getPhoneNo());
					System.out.println("Student Address:"+student.getAddress());
					System.out.println("Student Marks:");

					for(Map.Entry m:student.getMap().entrySet()){  
						System.out.println("              "+m.getKey()+":- "+m.getValue());  

					} 
					System.out.println();
				}
			}else if(options==3){
				boolean result = false;
				System.out.println("Enter RollNo");
				int entryRollno = in.nextInt();
				for (int i = 0; i < slist.size(); i++){
					if(slist.get(i).getRollNo() == entryRollno){
						result = true;
						slist.remove(i);
					}
				}
				if(!result){
					System.out.println("Student with RollNo "+entryRollno+" was not found");
				}else
					System.out.println("Student Removed");
			}else if(options==4){
				boolean result = false;
				System.out.println("Enter RollNo");
				int entryRollno = in.nextInt();
				for (int i = 0; i < slist.size(); i++){
					if(slist.get(i).getRollNo() == entryRollno){
						result = true;
						System.out.println("Student RollNo:"+slist.get(i).getRollNo());
						System.out.println("Student Name:"+slist.get(i).getName());
						System.out.println("Student Class:"+slist.get(i).getClassName());
						System.out.println("Student DOB:"+slist.get(i).getDob());
						System.out.println("Student PhoneNo:"+slist.get(i).getPhoneNo());
						System.out.println("Student Address:"+slist.get(i).getAddress());
						System.out.println("Student Marks:");

						for(Map.Entry m:slist.get(i).getMap().entrySet()){  
							System.out.println("              "+m.getKey()+":- "+m.getValue());  

						} 
						System.out.println();
					}
				}
				if(!result){
					System.out.println("Student with RollNo "+entryRollno+" was not found");
				}
			}else {
				break;
			}			

		}


	}
}