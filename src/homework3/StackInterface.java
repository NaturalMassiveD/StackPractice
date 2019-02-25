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
public interface StackInterface {
    public boolean isEmpty();
    public void push(Object newItem);
    public Object pop();
    public void popAll();
    public Object peek();
    public void display();

}
