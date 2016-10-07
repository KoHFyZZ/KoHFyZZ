import java.sql.Date;
public class Rabota {

	private Long id;
	private String organization;
	private String stazh;
	private Date nachalo;
	private Date konec;
	private String dolzhnost;

	public Rabota(){
		System.out.println("Rabota");
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getStazh() {
		return this.stazh;
	}

	public void setStazh(String stazh) {
		this.stazh = stazh;
	}

	public Date getNachalo() {
		return this.nachalo;
	}

	public void setNachalo(Date nachalo) {
		this.nachalo = nachalo;
	}

	public Date getKonec() {
		return this.konec;
	}

	public void setKonec(Date konec) {
		this.konec = konec;
	}

	public String getDolzhnost() {
		return this.dolzhnost;
	}

	public void setDolzhnost(String dolzhnost) {
		this.dolzhnost = dolzhnost;
	}

}