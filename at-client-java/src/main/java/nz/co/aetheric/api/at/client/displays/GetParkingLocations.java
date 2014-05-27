package nz.co.aetheric.api.at.client.displays;

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
public interface GetParkingLocations {

	/**
	 * Returns parking locations in the Auckland region.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/parkinglocations")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getParkingLocations(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {
	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
