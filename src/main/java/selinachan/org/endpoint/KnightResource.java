package selinachan.org.endpoint;

import selinachan.org.KnightRepository;
import javax.ws.rs.Path;

@Path("/knights")
public class KnightResource {

	private KnightRepository knightRepository;
}
