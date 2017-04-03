package org.main;

import java.util.Scanner;

import org.list.LinkedList;

public class ListHandler {

	
	public static void main(String args[]){
		
		
		Scanner sc =new Scanner(System.in);
		
		LinkedList start=new LinkedList();
		
		
		System.out.println("Menu");
		System.out.println("1.Show List");
		System.out.println("2.Add new element");
		System.out.println("3.Delete from list");
		
	
		String  cont;
	do{	
		
		
		System.out.println("Select 1-3");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1: start.showList(start);
		break;
		case 2: System.out.println("Enter element value");
				int val=sc.nextInt();
				start=start.insert(start, val);
				start.showList(start);
				break;
		case 3:System.out.println("Enter element value");
				int val2=sc.nextInt();
				start=start.delete(start, val2);
				start.showList(start);
		
		
		}
		System.out.println("Want to continue (y or n)");
		 cont=sc.next();
		
	}while("y".equalsIgnoreCase(cont));
	
	
	}
	
}
