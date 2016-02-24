/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.Features.Welcome;


import dependencyinjection.MVC.*;
import java.io.*;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author david
 */
public class View implements IView {

    public IDelegate delegate = null;
    
   @Override
   public String getName() {
        return name;
    }

   
 

    @Override
    public void display() {
        //System.out.println("view View is displayed");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        try {
            System.out.print("Please enter your name.\nName: ");
            String line = reader.readLine();
            this.delegate.getNameFromConsole(line);
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  



    @Override
    public void viewWillAppear() {
        System.out.println("view viewWillAppear");
    }

    @Override
    public void viewDidAppear() {
        System.out.println("view viewDidAppear");
    }
       
    
    
}
