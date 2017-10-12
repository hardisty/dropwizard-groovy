package info.hardisty.resource

import com.codahale.metrics.annotation.Timed

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path('hello-world')
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource {

    @GET
    @Timed
    String sayHello(@QueryParam('name') Optional<String> name) {
        return String.format('Hello world %s', name.orElse('Frank'))
    }

}
