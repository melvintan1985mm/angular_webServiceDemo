import javax.ws.rs.*;

@Path("infos")
public class InfoRestful {
	
	@GET
	@Path("test")
	@Produces("text/plain")
	public String getPCount(){
				
		return "pcount text here";
	}
}
