package org.list;


public class LinkedList extends Object{
	public int nullele=-1;

	int value;
	LinkedList next;

	
	public LinkedList() {	
	this.value=nullele;
	}
	
	public LinkedList(int value, LinkedList next) {
			
		this.value=value;
		this.next=next;
		
		// TODO Auto-generated constructor stub
	}
	
	public void showList(LinkedList l){
		System.out.print("list :");
		
		
			
				LinkedList p1=new LinkedList();
				p1=l;
				while(p1.next!=null){
					System.out.print(l.value+"->");
						l=l.next;
						p1=l;
					}
				System.out.println("null");

	return;	
	}
	
	
	public LinkedList delete(LinkedList l,int a){
		
		LinkedList prev=l;
		LinkedList start=l;
		
		if(l.value==a){
			return l.next;
		}
		
		try{
				while(l.value!=nullele && l.value!=a){
				
					prev=l;
					l=l.next;
				}
		}
		catch(Exception e)
		{
		//element not found	
		}
		
		
		try{
				if(l.value==nullele)
				{
					System.out.println("Element not found");
					return start;
				}
					else if(l.value==a)
						prev.next=l.next;
		}
		catch(Exception e)
		{
			System.out.println("Element not foundd");
		}
		
	return start;
	
	}
	
	public LinkedList insert(LinkedList l, int a){
		
		
		LinkedList nptr=new LinkedList(a, null);
		System.out.println(nptr.value);
		if(l.value==nullele)
		{
			return nptr;
		}
		
		else
		{
			
			nptr.next=l;
			}
		
		
		return nptr;
	
	}
	
}
