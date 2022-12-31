package GofranSir.Shadi.Controller;

public class UserAccountController {

	public void registerUser() {
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();
		// user Account1 input
		userAccount.setId(1);
		userAccount.setUserName("Khan Ubaid");
		userAccount.setAge(28);
		userAccount.setCity("Mumbai");
		userAccount.setCountry("India");
		userAccount.setEmail("Ubaid@gmail.com");
		userAccount.setGender("Male");
		userAccount.setPassword("1234");
		userAccount.setPhoneNumber("7303555582");

		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Travelling");
		interest.setHobbies("Coding");
		interest.setDislikes("Mazak");
		interest.setProfileURL("http//sdf4dfgh852bhnjk");
		interest.setAbout("Good Personality");

		userAccount.setInterest(interest);
		dao.save(userAccount);
		System.out.println("User Account 1 Register Successfully");
		System.out.println(dao.findById(1));

	}

	public void findAllUsers() {
		UserAccountDao dao = new UserAccountDaoImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("Khan Ubaidur Rehman");
		userAccount.setAge(27);
		userAccount.setCity("Mumbai");
		userAccount.setCountry("India");
		userAccount.setEmail("kubaidurrehman@gmail.com");
		userAccount.setGender("Male");
		userAccount.setPassword("45612");
		userAccount.setPhoneNumber("7303222375");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Friends company");
		interest.setHobbies("Earning money");
		interest.setDislikes("Mazak");
		interest.setProfileURL("http//sdf4dfgh852bhnjk");
		interest.setAbout("Dashing Personality");
		userAccount.setInterest(interest);
		// save data
		dao.save(userAccount);
		System.out.println("Replace id 1");
		System.out.println(dao.findById(1));

		// user Account2 input
		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount2.setUserName("Khan Amjad");
		userAccount2.setAge(26);
		userAccount2.setCity("Mumbai");
		userAccount2.setCountry("India");
		userAccount2.setEmail("Amjad@gmail.com");
		userAccount2.setGender("Male");
		userAccount2.setPassword("1234");
		userAccount2.setPhoneNumber("789456123");

		Interest interest2 = new Interest();
		interest2.setId(2);
		interest2.setLikes("Cricket and Travelling");
		interest2.setHobbies("Playing Chess");
		interest2.setDislikes("Job");
		interest2.setProfileURL("http//sdf4dfgh852bhnjk");
		interest2.setAbout("Height 5.5 ft");
		userAccount2.setInterest(interest2);
		dao.save(userAccount2);
		System.out.println("User Account 2 Register Successfully");
		// dao.delete(1);
		System.out.println(dao.findAll());
		System.out.println(dao.findById(2));
	}

	public void findMatchingUsers() {
		UserAccountDao dao = new UserAccountDaoImpl();
		createUsers(dao);
		System.out.println(dao.findMatches(27, "Mumbai"));

	}

	private void createUsers(UserAccountDao dao) {
		System.out.println("Yes");
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("Khan Ubaidur Rehman");
		userAccount.setAge(25);
		userAccount.setCity("Mumbai");
		userAccount.setCountry("India");
		userAccount.setEmail("@gmail.com");
		userAccount.setGender("Male");
		userAccount.setPassword("1234");
		userAccount.setPhoneNumber("73035");

		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Travelling");
		interest.setHobbies("Coding");
		interest.setDislikes("Mazak");
		interest.setProfileURL("http//sdf4dfgh852bhnjk");
		interest.setAbout("Good Personality");

		userAccount.setInterest(interest);
		dao.save(userAccount);
		System.out.println("User Account 1 of create users method is Register Successfully");

		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount2.setUserName("Khan Amjad");
		userAccount2.setAge(26);
		userAccount2.setCity("Mumbai");
		userAccount2.setCountry("India");
		userAccount2.setEmail("Amjad@gmail.com");
		userAccount2.setGender("Male");
		userAccount2.setPassword("1234");
		userAccount2.setPhoneNumber("789456123");

		Interest interest2 = new Interest();
		interest2.setId(2);
		interest2.setLikes("Cricket and Travelling");
		interest2.setHobbies("Playing Chess");
		interest2.setDislikes("Job");
		interest2.setProfileURL("http//sdf4dfgh852bhnjk");
		interest2.setAbout("Height 5.5 ft");
		userAccount2.setInterest(interest2);
		dao.save(userAccount2);
		System.out.println("User Account 2 of create method is Register Successfully");
		// dao.delete(2);
		// System.out.println(dao.findAll());
	}

	public static void main(String[] args) {
		UserAccountController controller = new UserAccountController();
		controller.registerUser();
		controller.findAllUsers();
		controller.findMatchingUsers();
	}
}
