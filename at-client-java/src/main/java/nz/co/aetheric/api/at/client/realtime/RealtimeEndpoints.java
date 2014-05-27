package nz.co.aetheric.api.at.client.realtime;

import javax.ws.rs.Path;

/**
 * This interface aggregates all the method interfaces in one place, and provides a global path for them all to be
 * served on.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Path("/realtime")
public interface RealtimeEndpoints extends
		GetVehicleLocations {
}
