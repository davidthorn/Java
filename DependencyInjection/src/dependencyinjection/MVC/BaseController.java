/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.MVC;



/**
 *
 * @author david
 */
public class BaseController  implements IController{
        
    public IView view = null;
    
    @Override
    public void viewDidLoad() {
        System.out.println("viewDidLoad");
    }
    
    @Override
    public void viewWillLoad()
    {
        System.out.println("viewWillLoad");
    }

    @Override
    public void loadView(IView view) {
        this.view = view;
        System.out.println("loadView");
    }

    @Override
    public void viewDidAppear() {
        System.out.println("viewDidAppear");
    }

    @Override
    public void viewWillAppear() {
           System.out.println("viewWillAppear");
    }

    @Override
    public void setView(IView _view) {
        this.view = _view;
        System.out.println("setView");
    }

    @Override
    public IView getView() {
        System.out.println("getView");
        return this.view;
    }
    
}
