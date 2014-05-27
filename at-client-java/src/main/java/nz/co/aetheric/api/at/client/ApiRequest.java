package nz.co.aetheric.api.at.client;

import lombok.Data;

import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlElement;

/**
 * TODO: What is the purpose of this class?
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Data
public abstract class ApiRequest implements ApiPayload {

	/**
	 * JSONP callback - overrides mimetype and returns JSON with padding
	 */
	@XmlElement
	@QueryParam("callback")
	protected String callback;

}
