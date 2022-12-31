package GofranSir.Shadi.Controller;

public class Interest {
	
	

	private int id;
	private String likes;
	private String dislikes;
	private String hobbies;
	private String profileURL;
	private String about;
	/*
	 * public Interest(int id, String likes, String dislikes, String hobbies, String
	 * profileURL, String about) { super(); this.id = id; this.likes = likes;
	 * this.dislikes = dislikes; this.hobbies = hobbies; this.profileURL =
	 * profileURL; this.about = about; }
	 */
	//converting object into string
	public String toString() {
		return "Interest [id=" + id + ", likes=" + likes + ", dislikes=" + dislikes + ", hobbies=" + hobbies
				+ ", profileURL=" + profileURL + ", about=" + about + "]";
	}
	public Interest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public void setDislikes(String dislikes) {
		this.dislikes = dislikes;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getProfileURL() {
		return profileURL;
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
