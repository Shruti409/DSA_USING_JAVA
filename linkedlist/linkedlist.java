package linkedlist;

public class LinkedList {
	class Node{
	int value; //value of node
	Node next; //address of next node
	
	public Node(int value) //constructor to iniilize node
	{
		this.value=value;
	}
	}
private Node head;//reference to store addresss of first node

//adding node at start

public void addAtStart(int value)
{
	//firstly a new node will be created.
	Node nn=new Node(value);
	//nn will point to address of this new node and we want this node to point at next  node(head wali node)
	
	nn.next=head;
	//head will point to new node
	head=nn;
	
	
}

public boolean isEmpty()
{
	return head==null;
}

//display linked list

public void display()
{
	Node i=head;
	while(i!=null)
	{
		System.out.print(i.value+"<-");
		i=i.next;
	}
	
	System.out.println();
}

//get methods
//get At first 

public int  getATFirst() throws Exception
{
	if(head==null)
	{
		throw new Exception("Linked List khali hai");
	}
	
	return head.value;
	
}

	

// get At Last
//to find last node we need to traverse whole linked list as there is no indexing 

public int getATLast() throws Exception
{
	if(head==null)
	{
		throw new Exception("Linked List khali hai");
	}
	Node i=head;
	while(i.next!=null)
	{
		i=i.next;
	}
	
	return i.value;
	
}
//get at any node

public Node getAtIndex(int index) throws Exception
{
	if(head==null)
	{
		throw new Exception("Linked List khali hai");
	}
	
	if(index<0||index>=size())
	{
		throw new Exception("Linked List khali hai");
	}
	//assume virtual indexing of ll start from 0
	//no of iterations=index
	Node i=head;
	for(int in=1;in<=index;in++)
	{
	  i=i.next;	
	}
	
	return i;
}
//size of linkedlist

public int size()
{
	int count=0;
	Node i=head;
	while(i!=null)
	{
		count++;
		i=i.next;
	}
	
	return count;
}
//add at last
public void addATLast(int value) throws Exception
{
	if(head==null)
	{
		 addAtStart(value);
	}
Node nn =new Node(value);
Node idx= getAtIndex(size()-1);
idx.next=nn;

}

public void addATIndex(int indx,int value) throws Exception
{
	if(indx<0||indx>=size())
	{
		throw new Exception("Galat  index hai Bhai");
	}
	
	if(indx==0)
	{
		addAtStart(value);
	}
	
	else if(indx==size())
	{
		addATLast(value);
	}
	else
	{
		Node nn=new Node(value);
		Node indx_1=getAtIndex(indx-1);
		Node indexx=getAtIndex(indx);
		indx_1.next=nn;
		nn.next=indexx;
	}
}

public int deleteFirst() throws Exception
{
	if(head==null)
	{
		throw new Exception("Linked list khali hai");
	}
	Node i=head;//because we need to return value after deletion
	head=head.next;
	i.next=null;//remove node from ll; i=null remove from memory
	return i.value;
	
}

public int deleteLast() throws Exception
{
	if(size()==1)
	{
		return deleteFirst();
	}
	
	else
	{
		Node lst_1=getAtIndex(size()-2); //second last node
		Node lst=lst_1.next;// last node ka address
		int temp=lst.value;
		lst_1.next=null;
		return temp;
		
		
	}
}

public int deleteAtindex(int index) throws Exception
{
	if(head==null)
	{
		throw new Exception("ll khali hai");
	}

	
	if(index>=size())
	{
		throw new  Exception("galat index hai");
	}
	
	if(index==0)
	{
		return deleteFirst();
	}
	
	else
	{
		Node idx_1=getAtIndex(index-1);
		Node idx=idx_1.next;
		Node idxplus1=idx_1.next.next;
		idx.next=null;
		idx_1.next=idxplus1;
		return idx.value;
	}
	
}

//q1 reverse linked list
//approach:each node will point to its previous

public void reverseActual() throws Exception
{
	if(this.isEmpty())
	{
		throw new Exception("Linked list is empty");
	}
	Node prev=null;
	Node curr=head;
	while(curr!=null) {
	Node currNext=curr.next;
	curr.next=prev;
	prev=curr;
	curr=currNext;
}
	head=prev;
}

//q2 middle of a linked list 
//second middle of ll
//we will take 2 pointers slow and fast slow will move by 1 fast will move by 2
public Node secondmiddle() throws Exception
{
	if(head==null)
	{
		throw new Exception("Linked list khali hai");
	}
	Node slow=head; // we willtake slow pointer and put it on head
	Node fast=head;// we willtake fast pointer and put it on head
	while(fast!=null && fast.next!=null) //rukne ki condition jab fast null na ho jaye ya fast.next null na ho jaye
	{
		//order of condition should be same else we will get null pointer exception in some cases
		slow=slow.next; //slow will take 1 step
		fast=fast.next.next;//fast will take 2 steps
		
	}
	
	return slow; //at end of loop slow will be at middle of linked list
}
public int secondmiddleval() throws Exception
{
return secondmiddle().value;
}
public Node firstmiddle() throws Exception
{
	if(head==null)
	{
		throw new Exception("Linked list khali hai");
	}
	Node slow=head;
	Node fast=head.next;
	while(fast!=null && fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
	}
	
	return slow;
}

public int firstmiddleval() throws Exception
{
	return firstmiddle().value;
}
public boolean cycledetection()
{
	 Node slow=head;
     Node fast=head;
 while(fast!=null&& fast.next!=null){
     fast=fast.next.next;
     slow=slow.next;
     if(fast==slow){
         return true;
     }
 }
 return false;
}
public void cyclecreation()
{
	Node tail=head;
	while(tail.next!=null)
	{
		tail=tail.next;//now tail will be at last node
	}
	
	tail.next=head.next;
	
}
	public static void main(String[] args)throws Exception {
		LinkedList ll=new LinkedList();
		System.out.println(ll.head);//head initially head will point at null
		ll.addAtStart(10);
		ll.addAtStart(20);
		ll.addAtStart(30);
		ll.display();
	int x=	ll.getATFirst();
	System.out.println(x);//30
	System.out.println(ll.getATLast());//10
	ll.addAtStart(40);
	ll.addAtStart(50);
	
	System.out.println(ll.getATFirst());
	System.out.println(ll.getATLast());
	System.out.println(ll.getAtIndex(2));
	System.out.println(ll.size());
	ll.addATLast(80);
	System.out.println(ll.size());
	ll.display();
	ll.addATIndex(3, 100);
	ll.display();
	System.out.println(ll.deleteFirst());
	ll.display();
	System.out.println(ll.deleteLast());
	ll.display();
	System.out.println(ll.deleteAtindex(3));
	ll.display();
	LinkedList l2=new LinkedList();
	l2.addAtStart(10);
	l2.addAtStart(20);
	l2.addAtStart(30);
	l2.addAtStart(40);
	l2.addAtStart(50);
	l2.addAtStart(60);
	
	l2.display();
	l2.reverseActual();
	l2.display();
	System.out.println(l2.secondmiddle());
	
	System.out.println(l2.secondmiddleval());
	
	
System.out.println(l2.firstmiddle());
	
	System.out.println(l2.firstmiddleval());
	
	LinkedList l3=new LinkedList();
	l3.addAtStart(100);
	l3.addAtStart(200);
	l3.addAtStart(300);
	l3.addAtStart(400);
	l3.addAtStart(500);
	System.out.println(l3.cycledetection());
	
	l3.cyclecreation();
	System.out.println(l3.cycledetection());
	
	
	


	}

}
