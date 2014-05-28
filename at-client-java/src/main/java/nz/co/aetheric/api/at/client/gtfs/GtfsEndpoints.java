package nz.co.aetheric.api.at.client.gtfs;

import javax.ws.rs.Path;

/**
 * This interface aggregates all the method interfaces in one place, and provides a global path for them all to be
 * served on.
 * <p>Author: <a href="http://gplus.to/tzrlk">Peter Cummuskey</a></p>
 */
@Path("/gtfs")
public interface GtfsEndpoints extends
		GetAgenciesList,
		GetCalendarList,
		GetCalendarByServiceId,
		GetCalendarExceptionList,
		GetCalendarExceptionByServiceId,
		GetRoutesList,
		GetRoutesListById,
		GetRoutesListByLongName,
		GetRoutesListByShortName,
		GetRoutesBySearchText,
		GetRoutesBySearchArea,
		GetRoutesByStopId,
		GetShapeById,
		GetShapeByTripId,
		GetShapeGeometryById,
		GetStopsList,
		GetStopById,
		GetStopByCode,
		GetStopsBySearchName,
		GetStopsBySearchArea,
		GetStopTimesByStopId,
		GetStopTimesByTripId,
		GetTripsList,
		GetTripsByTripId,
		GetTripsByRouteId {
}
