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
public interface GetCalendarExceptionByServiceId {

	/**
	 * Exceptions for the service IDs defined in the calendar list, filtered by service id.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/calendarDate/serviceId/{service_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCalendarExceptionByServiceId(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {

		/**
		 * service id
		 */
		@XmlElement(required = true)
		@PathParam("service_id")
		protected String service_id;

	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
