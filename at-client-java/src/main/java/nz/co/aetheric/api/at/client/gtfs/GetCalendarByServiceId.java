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
public interface GetCalendarByServiceId {

	/**
	 * Dates for service IDs using a weekly schedule. Specify when service starts and ends, as well as days of the week
	 * where service is available, filtered by service id.
	 * @param request The request item.
	 * @return The response item.
	 */
	@GET
	@Path("/calendar/serviceId/{service_id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getScheduledWorks(Request request);

	@Data
	@XmlRootElement
	public static class Request extends ApiRequest {

		/**
		 * service id
		 */
		@XmlElement
		@PathParam("service_id")
		protected String service_id;

	}

	@Data
	@XmlRootElement
	public static class Response extends ApiResponse {
	}

}
