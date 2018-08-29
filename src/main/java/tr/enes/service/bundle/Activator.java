package tr.enes.service.bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("enes start1");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("enes stop1");
    }

}
