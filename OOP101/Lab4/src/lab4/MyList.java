/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


/**
 *
 * @author Dominic
 */
public class MyList<T> {
    
    public class MyIterator
    {
        public Node iterator;
        public MyIterator(){
            iterator = first;
        }
        public boolean hasNext()
        {
            if(iterator.next!=null)
                return true;
            return false;
        }
        
        public T next()
        {
            Node current = iterator;
            iterator = iterator.next;
            return current.data;
        }
    }
    
    class Node //No reference to a list object
    {
        T data;
        Node next;
    }
    
    Node first;

    public MyList() {
        first = null;
    }
    
    
    public void add(T e)
    {
        Node newNode = new Node();
        newNode.data = e;
        newNode.next = first;
        first = newNode;
    }
    
    public boolean remove(T e)
    {
        if(first==null)
            return false;
        
        Node current = first;
        Node previous = first;
        while(current.next!=null)
        {
            
            if(current.data==e)
            {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        
        return false;
        
    }
    
    public T getElementAt(int index)
    {
        Node p = first;
        int count = 0;
        if(index>size()) throw new RuntimeException("Out of bounds");
        while(count<=index)
        {
            p = p.next;
            count++;
        }
        return p.data;
    }
    
    public int size()
    {
       int size = 0;
       Node p = first;
       if(first!=null)
           size++;
       while(p.next!=null)
           size++;
       
       return size;
    }
    
    public boolean isEmpty()
    {
        if(size()==0) return true;
        return false;
    }
    
    
}
