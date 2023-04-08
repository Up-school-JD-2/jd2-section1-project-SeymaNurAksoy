package filmpackage;

import java.util.Iterator;
import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		UserStoreService service = new UserStoreService();
		FilmManager filmManager = new FilmManager();
		UserManager userManager = new UserManager();

		printMenu();
		do {
			System.out.print("Seçiminiz: ");
			choice = sc.nextInt(); // \n
			switch (choice) {
			case 0 -> {
				System.out.println("--------------------------------");
				userManager.login();
				System.out.println("--------------------------------");
			}
			case 1 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					userManager.list();
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}

			}
			case 2 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					userManager.search();
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}

			}
			case 3 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					System.out.println("Silmek istediğiniz hesabın email adresini giriniz:");
					String deleteEmail = sc.next();
					userManager.delete(deleteEmail);
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}
			}
			case 4 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					System.out.println("İd giriniz:");
					int id = sc.nextInt();
					System.out.println("UserName giriniz:");
					String name = sc.next();
					System.out.println("Şifre giriniz:");
					String password = sc.next();
					System.out.println("Email  giriniz:");
					String eMail = sc.next();
					User user = new User(id, name, password, eMail);
					userManager.add(user);
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}
			}
			case 5 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					filmManager.list();
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}
			}
			case 6 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					filmManager.search();
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}
			}
			case 7 -> {
				if (userManager.login() == true) {
					System.out.println("--------------------------------");
					System.out.print("İzleyeceğiniz filme özel numara: ");
					int id = 5;
					sc.next();
					System.out.print("Ekleyeceğiniz filmin ismi: ");
					sc.nextLine();

					String movieTitle = sc.nextLine();

					System.out.println("Ekleyeceğiniz filmin yönetmeni: ");
					String director = sc.nextLine();

					System.out.println("Filmin aktörlerinin sayısını giriniz: ");
					int count = sc.nextInt();

					String[] actors = new String[count];
					for (int i = 0; i < count; i++) {
						actors[i] = sc.nextLine();
					}
					System.out.println("Ekleyeceğiniz filmin yayın tarihi: ");
					String dateTime = sc.nextLine();

					System.out.println("Ekleyeceğiniz filmin açıklaması: ");
					String explanation = sc.nextLine();

					System.out.println("Ekleyeceğiniz filmin türü: ");
					String movieGenre = sc.nextLine();

					Film film = new Film(id, movieTitle, director, actors, dateTime, explanation, movieGenre);
					filmManager.add(film);
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");
				}
			}
			case 8 -> {
				if (userManager.login() == true) {

					System.out.println("--------------------------------");
					System.out.println("Silmek istediğiniz filmin ismini  giriniz:");
					String deleteFilmName = sc.next();
					filmManager.delete(deleteFilmName);
					System.out.println("--------------------------------");
				} else {
					System.out.println("Giriş Yapınız");

				}
			}
			case -1 -> {
				if (userManager.login() == true) {
					System.out.println("İyi günler");
				} else {
					System.out.println("Giriş Yapınız");
				}

			}
			default -> printMenu();
			}
		} while (choice != -1);
	}

	private static void printMenu() {
		System.out.println("##### Menu #####");
		System.out.println("0: Kullanıcı Girişi");
		System.out.println("1: Kullanıcıları listele");
		System.out.println("2: Kullanıcı ara");
		System.out.println("3: Kullanıcı sil");
		System.out.println("4: Kullanıcı ekle");
		System.out.println("5: Filmleri listele");
		System.out.println("6: Film ara");
		System.out.println("7: Film sil");
		System.out.println("8: Film ekle");
		System.out.println("-1: Çıkış \n\n");
	}

}
