/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.MVC;

/**
 *
 * @author david
 */
public interface IController {
   
    public void setView( IView view);
    public IView getView();
    
    public void viewWillLoad();
    public void viewDidLoad();
    public void loadView( IView view );
    public void viewWillAppear();
    public void viewDidAppear();
    
}
