import java.util.*;
import javax.ws.rs.core.Application;

//@ApplicationPath("web")
@javax.ws.rs.ApplicationPath("api")
public class AppConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses(){
		//Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;		
	}
	
	private void addRestResourceClasses(Set<Class<?>> resources){
		resources.add(ProductRestful.class);
		resources.add(InfoRestful.class);
	}
}
