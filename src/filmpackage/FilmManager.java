package filmpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class FilmManager implements Manager {

	UserStoreService service = new UserStoreService();
	
	public ArrayList<Film> films = new ArrayList<>();
	public ArrayList<Film> filmStore = service.getFilmStore();

	@Override
	public void add(Generic generic) {

		films.add((Film) generic);
		System.out.println("Film eklendi.");

	}

	@Override
	public void delete(String filmName) {

		boolean result = false;
		String name = "";
		for (Film film : filmStore) {
			name = film.getMovieTitle();
			result = name.contains(filmName);
			if (result) {
				films.remove(film);
				System.out.println("Film silindi");
			}
		}
		for (Film film2 : films) {
			name = film2.getMovieTitle();
			result = name.contains(filmName);
			if (result) {
				films.remove(film2);
				System.out.println("Film silindi");

			}
		}

	}

	public void search() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Aramak istediğiniz film ismini giriniz");
		String searchSongName = scan.nextLine();
		boolean result = false;
		for (Film film : filmStore) {
			String name = film.getMovieTitle();
			result = name.contains(searchSongName);
			if (result) {
				System.out.println("Aradığınız film  vardır");
				break;
			}
		}
		for (Film film : films) {
			String name = film.getMovieTitle();
			result = name.contains(searchSongName);
			if (result) {
				System.out.println("Aradığınız film  vardır");
				break;
			}
		}
		if (result == false) {
			System.out.println("Aradığınız film yoktur.");
		}

	}

	@Override
	public void list() {

		for (Film film2 : films) {
			System.out.println("🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸");

			System.out.println(
					"🎯Id: " + film2.getId() + " 🎯İsmi: " + film2.getMovieTitle() + " 🎯Yönetmen: " + film2.getDirector());
			System.out.println(" 🎯Tür: " + film2.getMovieGenre() + " Yayın Tarihi: " + film2.getDateTime());
			System.out.println(" 🎯Açıklama:" + film2.getExplanation());
			System.out.println("🎯Film Aktörleri:");
			for (int i = 0; i < film2.getActors().length; i++) {
				System.out.println(film2.getActors()[i] + " ");
			}
			System.out.println("🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸🌸");

		}

	}

}
