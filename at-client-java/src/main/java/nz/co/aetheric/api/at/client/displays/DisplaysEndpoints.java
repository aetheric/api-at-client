package nz.co.aetheric.api.at.client.displays;

import javax.ws.rs.Path;

/**
 * This interface aggregates all the method interfaces in one place, and provides a global path for them all to be
 * served on.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Path("/display")
public interface DisplaysEndpoints extends
		GetCustomerServiceCentres,
		GetParkingLocations,
		GetScheduledWorks {
}
