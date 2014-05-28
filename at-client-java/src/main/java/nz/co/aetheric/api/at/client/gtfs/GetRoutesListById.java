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
public interface GetRoutesListById {

	/**
	 * Transit routes. A route is a group of trips that are displayed to riders as a single service.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/routes/routeId/{route_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRoutesListById(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {

		/**
		 * identifier of the route
		 */
		@XmlElement(required = true)
		@PathParam("route_id")
		protected String route_id;

	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
