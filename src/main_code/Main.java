package main_code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
static void fp() //making a function to come into main menu again
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to LockedMe.com");
	try {
	while(true)
	{
	System.out.println();
	System.out.println("Select Any Option: ");
	System.out.println("1.Reterive All Files.\n"+"2.All Operations On Files.\n"+"3.Exit.\n");
	
	char input=sc.next().charAt(0);
	
		
		if(input=='1'||input=='2'||input=='3') 
		{
		switch(input) 
		{
		case '1':
			File fobj=new File("C:\\JavaDirectory\\");
			
			String[] list_of_files=fobj.list();
			System.out.println("Available files are:\n");
			for(String i:list_of_files)
				{
				if(i.endsWith(".txt")||i.endsWith(".pdf")||i.endsWith(".docx")||i.endsWith(".doc")||i.endsWith(".xls"))// logic to filter a file only.
				{
				System.out.println(i);
				}
				}
				break;
		case '2':
			
			while(true)
			innerloop:									//label of inner loop
			{System.out.println();
			System.out.println("Following Operations Are Avilable:");
			System.out.println("1.Add File.\n"+"2.Delete File.\n"+"3.Search File.\n"+"4.Return To Main Menu\n");
			char input1=sc.next().charAt(0);
			if(input1=='1'||input1=='2'||input1=='3'||input1=='4') 
			
			{
			switch(input1)
			{
			case '1':
				System.out.println("File Add Option----\n");	//code for adding a file
				System.out.println("Enter File Name To Add(With .extension):");
				String fname=sc.next();
				FileWriter fw=new FileWriter("C:\\JavaDirectory\\"+fname,true);
				System.out.println("File Added Successfully");	
				fw.close();
				break;
			case '2':
				System.out.println("File Delete Option----:"); //code for deleting a file
				System.out.println("Enter File Name To Delete");
				String fname1=sc.next();
				sc.close();
				File fobj1=new File("C:\\JavaDirectory\\",fname1);
			if(fobj1.exists()==true) 
				{
					fobj1.delete();
					System.out.println("File Deleted Successfully\n");
				}
				else System.out.println("File Not Exist\n");
				break;
			case '3':
				System.out.println("File Search Option----:");// code for searching a file
				System.out.println("Enter File Name To Search:");
				String fname2=sc.next();
				sc.close();
				File fobj2=new File("C:\\JavaDirectory\\",fname2);
				if(fobj2.exists()==true) 
				{
					System.out.println("File Existed");
				}
				else System.out.println("File Not Exist\n");
				break;
			case '4':
					fp(); //recursively calling the function
																
			}//inner loop switch close
			}// inner loop if for input 1 2 3 4 close
			else 
				{
				System.out.println("enter valid input 1 or 2 or 3 or 4");
				System.out.println();
				}
			}
			//inner whileloop ending
			
		case '3':
			System.exit(0);
			break;
		}//Switch case close of 3 inputs 1 2 3.
		
		}//outer loop if close input 1,2,3.
		else{System.out.println("Enter valid input 1,2,3");}//else case ending of 3 inputs 1 2 3. 
		
		
	}//outer whileloop ending
	}//outer whileloop try block ending
	catch(Exception e)
	{
		System.out.println("Enter valid input 1,2,3");
	}
	}

//MAIN Method
	public static void main(String[] args) throws IOException,FileNotFoundException,IllegalStateException,InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to LockedMe.com");
		try {
		while(true)
		{
		System.out.println();
		System.out.println("Select Any Option: ");
		System.out.println("1.Reterive All Files.\n"+"2.All Operations On Files.\n"+"3.Exit.\n");
		
		char input=sc.next().charAt(0);
		
			
			if(input=='1'||input=='2'||input=='3') 
			{
			switch(input) 
			{
			case '1':
				File fobj=new File("C:\\JavaDirectory\\");
				
				String[] list_of_files=fobj.list();
				System.out.println("Available files are:\n");
				for(String i:list_of_files)
					{
					if(i.endsWith(".txt")||i.endsWith(".pdf")||i.endsWith(".docx")||i.endsWith(".doc")||i.endsWith(".xls"))// logic to filter a file only.
					{
					System.out.println(i);
					}
					}
					break;
			case '2':
				
				while(true)
				innerloop:									//label of inner loop
				{System.out.println();
				System.out.println("Following Operations Are Avilable:");
				System.out.println("1.Add File.\n"+"2.Delete File.\n"+"3.Search File.\n"+"4.Return To Main Menu\n");
				char input1=sc.next().charAt(0);
				if(input1=='1'||input1=='2'||input1=='3'||input1=='4') 
				
				{
				switch(input1)
				{
				case '1':
					System.out.println("File Add Option----\n");	//code for adding a file
					System.out.println("Enter File Name To Add(With .extension):");
					String fname=sc.next();
					FileWriter fw=new FileWriter("C:\\JavaDirectory\\"+fname,true);
					System.out.println("File Added Successfully");	
					fw.close();
					break;
				case '2':
					System.out.println("File Delete Option----:"); //code for deleting a file
					System.out.println("Enter File Name To Delete");
					String fname1=sc.next();
					sc.close();
					File fobj1=new File("C:\\JavaDirectory\\",fname1);
				if(fobj1.exists()==true) 
					{
						fobj1.delete();
						System.out.println("File Deleted Successfully\n");
					}
					else System.out.println("File Not Exist\n");
					break;
				case '3':
					System.out.println("File Search Option----:");// code for searching a file
					System.out.println("Enter File Name To Search:");
					String fname2=sc.next();
					sc.close();
					File fobj2=new File("C:\\JavaDirectory\\",fname2);
					if(fobj2.exists()==true) 
					{
						System.out.println("File Existed");
					}
					else System.out.println("File Not Exist\n");
					break;
				case '4': 				// code for return to main menu.
						fp(); // calling the function
																	
				}//inner loop switch close
				}// inner loop if for input 1 2 3 4 close
				else 
					{
					System.out.println("enter valid input 1 or 2 or 3 or 4");
					System.out.println();
					}
				}
				//inner whileloop ending
				
			case '3':
				System.exit(0);
				break;
			}//Switch case close of 3 inputs 1 2 3.
			
			}//outer loop if close input 1,2,3.
			else{System.out.println("Enter valid input 1,2,3");}//else case ending of 3 inputs 1 2 3. 
			
			
		}//outer whileloop ending
		}//outer whileloop try block ending
		catch(Exception e)
		{
			System.out.println("Enter valid input 1,2,3");
		}
			
		
	}
	}



//Issues:-
// inner while loop is not terminating only. outer is also terminating with it.

