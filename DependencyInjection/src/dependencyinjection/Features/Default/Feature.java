/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.Features.Default;

import dependencyinjection.MVC.IController;

/**
 *
 * @author david
 */
public class Feature {
    
    private View view = null;
    
    private Model model = null;
    
    private Controller controller = null;
    
    private Delegate delegate = null;
    
    public Feature(){
        
        this.delegate = new Delegate();
        this.controller = new Controller();
        
        this.view = new View();
        this.view.delegate = this.delegate;
        this.controller.loadView(this.view);
        
        this.model = new Model();
        
    
    }
    
    public Feature( View view , Model model , Controller controller  )
    {
        this.view = view;
        
        this.model = model;
        this.controller = controller;
        
        this.controller.loadView(this.view);
    }
    
    
    public IController getController()
    {
        return this.controller;
    }
    
    public void execute()
    {
        this.controller.getView().display();
    }
            
    
    
}
