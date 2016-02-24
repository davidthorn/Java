/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection;

import dependencyinjection.Features.Default.*;
import dependencyinjection.Features.Welcome.*;

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
        Welcome welcome = new Welcome();
        FeatureController controller = feature.getController();
        Controller controller2 = welcome.getController();
        
        feature.execute();
        welcome.execute();
        
    }
}
