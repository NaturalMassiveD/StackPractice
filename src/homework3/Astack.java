/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author teel6
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;
public class Astack implements StackInterface{
	Queue<Object> queue = new LinkedList<Object>();
public boolean isEmpty(){
	return top = null;
}
public void push(Object newItem){
	Node newNode;
	newNode = newNode(newItem, top);
	top = newNode;
}
public Object pop() throws NoSuchElementException {
	if(! isEmpty()){
		Node temp;
		temp = top;
		top = top.getNext();
		return temp.getItem();
	}
	else{
		return NoSuchElementException();
	}
}
public void popAll(){
	top = Null;
}
public object peek(){
	if(top==null){
		throws NoSuchElementException();
	}
		else{
			return top.getItem();
		}
}
public void display(){
	return top max_size-1;
}

    private void NoSuchElementException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

