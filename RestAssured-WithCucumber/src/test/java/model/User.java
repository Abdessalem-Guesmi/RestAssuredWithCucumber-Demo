package model;

public class User {
	private int id;
	private String fname;
	private String lname;
	private String DepId;

	public User(int id, String fname, String lname, String DepId) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.DepId = DepId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDepId() {
		return DepId;
	}

	public void setDepId(String DepId) {
		this.DepId = DepId;
	}

	public User(String fname, String lname, String DepId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.DepId = DepId;
	}

}
