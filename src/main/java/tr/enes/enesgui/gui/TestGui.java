/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.enes.enesgui.gui;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import tr.enes.service.services.MathService;

/**
 *
 * @author enes
 */
@Component(immediate = true, enabled = true,
        property = {"service.exported.interfaces=*",
            "service.exported.configs=org.apache.cxf.rs",
            "org.apache.cxf.rs.address=/enes",
            "org.apache.cxf.rs.provider=com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider",}
)
@Path("/")
public class TestGui extends Application {

    @Reference
    MathService mathService;

    @Activate
    public void activate() {
        System.out.println("Sum is :" + mathService.sum(10, 15));
    }

    @GET
    @Path("hello")
    @Produces("text/plain")
    public String sayHello() {
        return "hello";
    }

    @GET
    @Path("topla/{a}/{b}")
    @Produces("text/plain")
    public int topla(@PathParam("a") int a, @PathParam("b") int b) {
        return mathService.sum(a, b);
    }

}
