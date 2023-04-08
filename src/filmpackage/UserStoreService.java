package filmpackage;

import java.util.ArrayList;

public class UserStoreService {

	String[] filmActors = { "Tom Hanks\r\n", "David Morse\r\n", "Michael Clarke Duncan\r\n", "Barry Pepper\r\n",
			"Bonnie Hunt" };
	String[] film2Actors = { "Tom Hanks\r\n", "David Morse\r\n", "Michael Clarke Duncan\r\n", "Barry Pepper\r\n",
			"Bonnie Hunt" };
	String[] film3Actors = { "	Tim Robbins\r\n", "Morgan Freeman\r\n", "Bob Gunton\r\n", "Clancy Brown\r\n",
			"William Sadler\r\n", "Gil Bellows\r\n", "James Whitmore" };
	Film film = new Film(1, "Yeşil Yol ", "Frank Darabont", filmActors, "17 Mart 1999",
			"Yeşil Yol (Orijinal adı: The Green Mile), 1999 yılında çekilen ABD yapımı bir dram filmidir. ", "Dram ");
	Film film2 = new Film(2, "Cesur Yürek", "	Bruce Davey", film2Actors, "11 Nisan 1995",
			"William Wallace'ın hayatını anlatır. Film Türkiye sinemalarında yıllarca gösterilerek bir rekora imza atmıştır.",
			"Tarihi Kurgusal");
	Film film3 = new Film(3, "Esaretin Bedeli", "Frank Darabont", film2Actors, "23 Eylül 1994",
			"Stephen King'in Rita Hayworth ve Shawshank'in Kefareti adlı novellasından uyarlanan film, masumiyetini iddia etmesine rağmen karısını ve sevgilisini öldürdüğü gerekçesiyle Shawshank Devlet Cezaevi'nde yaklaşık 20 yılını geçiren bankacı Andy Dufresne'in hikâyesini anlatır. ",
			"Dram");
	
	User user1= new User(1, "seyma-aksoy", "Aa123457", "seyma@gmail.com");
	User user2= new User(2, "faik-aygün", "1123421", "faik@gmail.com");
	User user3= new User(3, "selda-bağcan", "L92J", "selda@gmail.com");
	User user4= new User(4, "nefise-yıldız", "AUJ27", "nefise@gmail.com");
	User user5= new User(5, "akgün-yatır", "KOP90", "akgün@gmail.com");
	User user6= new User(6, "seyma-yatır", "KOeeeP90", "akgün@gmail.com");

	
	public ArrayList<Film> filmStore = new ArrayList<Film>();
	public ArrayList<User> userStore = new ArrayList<User>();

	
	public ArrayList<Film> getFilmStore() {
		filmStore.add(film);
		filmStore.add(film2);
		filmStore.add(film3);
		return filmStore;
	}
	public ArrayList<User> getUserStore() {
		userStore.add(user1);
		userStore.add(user2);
		userStore.add(user3);
		userStore.add(user4);
		userStore.add(user5);
		userStore.add(user6);
		return userStore;
	}

}
