package nz.co.aetheric.api.at.client.gtfs;

import lombok.Data;
import nz.co.aetheric.api.at.client.ApiRequest;
import nz.co.aetheric.api.at.client.ApiResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * TODO: What is the purpose of this class?
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public interface GetRoutesList {

	/**
	 * Transit routes. A route is a group of trips that are displayed to riders as a single service.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/routes")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getRoutesList(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {
	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
