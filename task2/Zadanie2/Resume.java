public class Resume {

	private Long id;
	private Subject subject;
	private String title;
	private AboutMe aboutMe;
	private Rabota rabota;
	private Obrazovanie obrazovanie;
	
	public Resume(){
		System.out.println("Resume");
	}

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AboutMe getAboutMe() {
		return this.aboutMe;
	}

	public void setAboutMe(AboutMe aboutMe) {
		this.aboutMe = aboutMe;
	}

	public Rabota getRabota() {
		return this.rabota;
	}

	public void setRabota(Rabota rabota) {
		this.rabota = rabota;
	}

	public Obrazovanie getObrazovanie() {
		return this.obrazovanie;
	}

	public void setObrazovanie(Obrazovanie obrazovanie) {
		this.obrazovanie = obrazovanie;
	}

}