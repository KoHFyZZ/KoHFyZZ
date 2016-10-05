import java.sql.Date;
public class Obrazovanie {

	private Long id;
	private String zavedenie;
	private Date vipysk;

	public Obrazovanie(){
		System.out.println("Obrazovanie");
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getZavedenie() {
		return this.zavedenie;
	}

	public void setZavedenie(String zavedenie) {
		this.zavedenie = zavedenie;
	}

	public Date getVipysk() {
		return this.vipysk;
	}

	public void setVipysk(Date vipysk) {
		this.vipysk = vipysk;
	}

}