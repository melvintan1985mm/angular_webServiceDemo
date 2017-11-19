import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import models.*;

@Path("products")
public class ProductRestful {
	
	@GET
	@Path("findAllProducts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAll(){
		List<Product> result = new ArrayList<Product>();
		result.add(new Product("p01","Name 1", 11040));
		result.add(new Product("p02","Name 2", 2400));
		result.add(new Product("p03","Name 3", 3020));
		result.add(new Product("p04","Name 4", 4030));
		
		return result;
	}
}
