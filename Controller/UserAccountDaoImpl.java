package GofranSir.Shadi.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccountDaoImpl implements UserAccountDao {

	Map<Integer, UserAccount> userAccount = new HashMap<>();

	public void save(UserAccount account) {
		userAccount.put(account.getId(), account);
		System.out.println(UserAccount.class.getName());
	}

	@Override
	public UserAccount findById(int id) {
		// TODO Auto-generated method stub
		// get() is a predefined method of Map class which returns value.
		return userAccount.get(id);
	}

	@Override
	public List<UserAccount> findAll() {

		return new ArrayList<UserAccount>(userAccount.values());
	}

	@Override
	public List<UserAccount> findMatches(int age, String city) {
		Collection<UserAccount> accounts = userAccount.values();
		ArrayList<UserAccount> matches = new ArrayList<>();
		for (UserAccount userAccount : accounts) {
			if (userAccount.getAge() == age && userAccount.getCity().equals(city)) {
				matches.add(userAccount);
			}
		}
		return matches;
	}

	@Override
	public void delete(int id) {
		userAccount.remove(id);

	}

}
