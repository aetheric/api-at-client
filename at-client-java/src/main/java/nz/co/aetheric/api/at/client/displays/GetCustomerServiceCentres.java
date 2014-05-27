package nz.co.aetheric.api.at.client.displays;

import lombok.Data;
import nz.co.aetheric.api.at.client.ApiRequest;
import nz.co.aetheric.api.at.client.ApiResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Defines the contract on the customer service methods.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
public interface GetCustomerServiceCentres {

	/**
	 * Returns customer service centres in the Auckland region.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/customerservicecentres")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerServiceCentres(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {
	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
