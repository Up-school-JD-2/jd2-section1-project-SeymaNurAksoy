package filmpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager implements Manager {

	UserStoreService service = new UserStoreService();
	public ArrayList<User> users = new ArrayList<>();
	public ArrayList<User> userStore = service.getUserStore();

	public boolean login( ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Giriş yapmak istediğiniz kullanıcı ismini giriniz");
		String searchUserName = scan.nextLine();
		System.out.println("Giriş yapmak istediğiniz kullanıcı şifresini ismini giriniz");
		String logInPassword = scan.nextLine();

		boolean result = false;
		boolean resultPassword=false;
		for (User user : userStore) {
			String name = user.getUserName();
			String password=user.getPassword();
			result = name.contains(searchUserName);
			resultPassword=logInPassword.contains(password);
			if (result && resultPassword) {
				System.out.println("Kullanıcı:" + user.getUserName());
				System.out.println("Kullanıcı başarıyla giriş yaptı.");
				return true;
			}
				System.out.println("Kullanıcı adı veya şifre hatalı.");
		}

		return false;
	}

	public void logout() {

		System.out.println("Kullanıcı başarıyla çıkış yaptı.");
	}

	@Override
	public void add(Generic generic) {
		users.add((User) generic);
		System.out.println("Kullanıcı eklendi.");
	}

	@Override
	public void delete(String email) {
		boolean result = false;
		String name = "";
		for (User user : userStore) {
			name = user.geteMail();
			result = name.contains(email);
			if (result) {
				users.remove(user);
				System.out.println("Kullanıcı silindi");
			}
		}
		for (User user2 : users) {
			name = user2.geteMail();
			result = name.contains(email);
			if (result) {
				users.remove(user2);
				System.out.println("Kullanıcı silindi");

			}
		}
	}

	@Override
	public void search() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Aramak istediğiniz kullanıcı ismini giriniz");
		String searchUserName = scan.nextLine();
		boolean result = false;
		for (User user : userStore) {
			String name = user.getUserName();
			result = name.contains(searchUserName);
			if (result) {
				System.out.println("Kullanıcı:" + user.getUserName());
				System.out.println("Aradığınız kullanıcı  vardır");
			}
		}
		for (User user : users) {
			String name = user.getUserName();
			result = name.contains(searchUserName);
			if (result) {
				System.out.println("Kullanıcı:" + user.getUserName());
				System.out.println("Aradığınız kullanıcı  vardır");
			}
		}
		if (result == false) {
			System.out.println("Aradığınız kullanıcı yoktur.");
		}
	}

	@Override
	public void list() {
		for (User user : users) {
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
			System.out.println("Kullanıcı Adı: " + user.getUserName());
			System.out.println("Kullanıcı Mail: " + user.geteMail());
		}

	}

}
