/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackPractice;

/**
 *
 * @author teel6
 */
public class StackTest {
    public static void main(String[] args){
		Astack Stack = new Astack();
		Stack.push("Adam");
		Stack.push("Brian");
		Stack.push("Charlie");
		Stack.push("Dave");
		Stack.push("Eddie");
		Stack.push("Frank");
		Stack.push("Gary");
		Stack.push("Hank");
		Stack.push("Isabelle");
		Stack.push("Jack");
		while(! isEmpty()){
			System.out.println(Stack.pop());
		}
		for(int i = 0; i < 4; i++){
Astack.pop();
		}
		System.out.println(“The elements are” + Astack);
		System.out.println(“The top element is” + Astack.peek());
		Astack.popAll();
	}

}
