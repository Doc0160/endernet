package pl.asie.endernet.lib;

import java.util.ArrayList;

public class EnderServer {
	public EnderServer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String name, address, password;
	public ArrayList<String> permissions = new ArrayList<String>();
}
