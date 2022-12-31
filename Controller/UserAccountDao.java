package GofranSir.Shadi.Controller;

import java.util.List;

public interface UserAccountDao {
	void save(UserAccount account);

	UserAccount findById(int id);

	List<UserAccount> findAll();

	List<UserAccount> findMatches(int age, String city);

	void delete(int id);
}
