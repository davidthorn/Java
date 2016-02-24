/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.Features.Default;

import dependencyinjection.MVC.IDelegate;

/**
 *
 * @author david
 */
public class Delegate implements IDelegate {
    @Override
    public void getNameFromConsole( String name )
    {
        System.out.println("name " + name );
    }

   
}
