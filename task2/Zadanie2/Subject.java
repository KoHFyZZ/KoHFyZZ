import java.sql.Date;
public class Subject {

	private Long id;
	private String name;
	private Date age;
	private String nation;
	private String location;
	private Contacts contacts;
	
	public Subject(){
		System.out.println("Subject");
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAge() {
		return this.age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Contacts getContacts() {
		return this.contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

}