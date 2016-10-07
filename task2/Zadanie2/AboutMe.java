public class AboutMe {

	private Long id;
	private String osebe;
	private String language;
	
	public AboutMe(){
		System.out.println("AboutMe");
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOsebe() {
		return this.osebe;
	}

	public void setOsebe(String osebe) {
		this.osebe = osebe;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}