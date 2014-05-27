package nz.co.aetheric.api.at.client.realtime;

import lombok.Data;
import nz.co.aetheric.api.at.client.ApiRequest;
import nz.co.aetheric.api.at.client.ApiResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO: What is the purpose of this class?
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public interface GetVehicleLocations {

	/**
	 * Returns real-time GTFS vehicle locations in the Auckland region. If no filters are applied returns a 30 second
	 * window of results otherwise returns results for vehicle location based on filter.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/vehiclelocations")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getScheduledWorks(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {

		/**
		 * Optional - Returns GTFS real-time vehicle locations filtered by comma seperated trip ids
		 */
		@XmlElement
		@QueryParam("tripid")
		protected String tripid;

		/**
		 * Optional - Returns GTFS real-time vehicle locations filtered by comma seperated vehicle ids
		 */
		@XmlElement
		@QueryParam("vehicleid")
		protected String vehicleid;

	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
