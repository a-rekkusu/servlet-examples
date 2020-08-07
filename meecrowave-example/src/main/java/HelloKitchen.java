import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("kitchen")
@ApplicationScoped
public class HelloKitchen {
    @GET
    public String getMenu() {
        return "good things";
    }
}