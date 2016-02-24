/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.MVC;

/**
 *
 * @author david
 */
public interface IView {
    public String name = null;
    public String getName();
    public void display();
    
  
    public void viewWillAppear();
    public void viewDidAppear();
    
}
