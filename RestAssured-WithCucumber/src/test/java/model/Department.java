package model;

import java.util.Collection;

public class Department {
	private String id;
	private String name;
	private Collection<User> users;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String id, String name, Collection<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

}
