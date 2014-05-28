package nz.co.aetheric.api.at.client.gtfs;

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
public interface GetRoutesListByShortName {

	/**
	 * Transit routes. A route is a group of trips that are displayed to riders as a single service.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/routes/routeShortName/{route_short_name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRoutesListByShortName(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {

		/**
		 * name of the route
		 */
		@XmlElement(required = true)
		@PathParam("route_short_name")
		protected String route_short_name;

	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
