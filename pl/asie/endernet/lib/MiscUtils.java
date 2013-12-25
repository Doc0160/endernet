package pl.asie.endernet.lib;

public class MiscUtils {
	public static int getSideFromName(String endpoint) {
		endpoint = endpoint.toLowerCase();
		if(endpoint.equalsIgnoreCase("up") || endpoint.equalsIgnoreCase("top")) return 1;
		if(endpoint.equalsIgnoreCase("down") || endpoint.equalsIgnoreCase("bottom")) return 0;
		if(endpoint.equalsIgnoreCase("left") || endpoint.equalsIgnoreCase("west")) return 4;
		if(endpoint.equalsIgnoreCase("right") || endpoint.equalsIgnoreCase("east")) return 5;
		if(endpoint.equalsIgnoreCase("front") || endpoint.equalsIgnoreCase("forward") || endpoint.equalsIgnoreCase("north")) return 2;
		if(endpoint.equalsIgnoreCase("back") || endpoint.equalsIgnoreCase("south")) return 3;
		return -1;
	}
}
