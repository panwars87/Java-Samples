package com.ys.test.linkedlist;

class Link<T,T1> {
    public T data1;
    public T1 data2;
    public Link<T,T1> nextLink;

    //Link constructor
    public Link(T d1, T1 d2) {
	    data1 = d1;
	    data2 = d2;
    }
    
    //Print Link data
    public void printLink() {
	    System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}

class LinkList<T,T1> {
    private Link<T,T1> first;

    //LinkList constructor
    public LinkList() {
	    first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
	    return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(T d1, T1 d2) {
	    Link<T,T1> link = new Link<T,T1>(d1, d2);
	    link.nextLink = first;
	    first = link;
    }

    //Deletes the link at the first of the list
    public Link<T,T1> delete() {
	    Link<T,T1> temp = first;
	    first = first.nextLink;
	    return temp;
    }
    
    //Prints list data
    public void printList() {
	    Link<T,T1> currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.nextLink;
	    }
	    System.out.println("");
    }
}  

class LinkedListTest {
    public static void main(String[] args) {
	    LinkList<Integer,Double> list = new LinkList<Integer,Double>();

	    list.insert(1, 1.01);
	    list.insert(2, 2.02);
	    list.insert(3, 3.03);
	    list.insert(4, 4.04);
	    list.insert(5, 5.05);

	    list.printList();

	    while(!list.isEmpty()) {
		    Link<Integer, Double> deletedLink = list.delete();
		    System.out.print("deleted: ");
		    deletedLink.printLink();
		    System.out.println("");
	    }
	    list.printList();
    }
}