/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection;

import dependencyinjection.Features.Default.*;


/**
 *
 * @author david
 */
public class DependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Feature feature = new Feature();
        Controller controller = feature.getController();
        
        feature.execute();
        
    }
}
