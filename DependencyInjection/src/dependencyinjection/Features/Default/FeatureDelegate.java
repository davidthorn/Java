/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection.Features.Default;



/**
 *
 * @author david
 */
public class FeatureDelegate implements IFeatureDelegate {
    @Override
    public void getNameFromConsole( String name )
    {
        System.out.println("name " + name );
    }

   
}
