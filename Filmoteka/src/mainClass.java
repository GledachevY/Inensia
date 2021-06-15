import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mainClass {

	public static void main(String[] args) {
		List<movie> filmInfoList = new ArrayList<movie>();
		List<movie> filmoteka1 = new ArrayList<movie>();
		List<movie> filmoteka2 = new ArrayList<movie>();
		List<movie> filmoteka3 = new ArrayList<movie>();

		filmInfoList.add(new movie("Home alone", "Macaulay Culkin", 1990, 125000));
		filmInfoList.add(new movie("Forrest Gump", "Tom Hanks; Robin Wright", 1994, 64165));
		filmInfoList.add(new movie("Dirty Grandpa", "Robert De Niro; Zac Efron", 2016, 696969));
		filmInfoList.add(new movie("The Parent Trap", "Lindsay Lohan", 1998, 111112));
		filmInfoList.add(new movie("Prison Break: The Final Break", "Wentworth Miller; Dominic Purcell", 2009, 999999));
		filmInfoList.add(new movie("Meet the Parents", "Ben Stiller; Robert De Niro", 2016, 1128000));
		filmInfoList.add(new movie("Taxi Driver", "Robert De Niro", 1976, 121000));
		filmInfoList.add(new movie("Titanic", "Leonardo DiCaprio; Kate Winslet", 1997, 135000));
		filmInfoList.add(new movie("The Hot Chick", "Rob Schneider; Rachel McAdams", 2002, 225000));
		filmInfoList.add(new movie("Dennis the Menace", "Walter Matthau; Mason Gamble", 1993, 125010));
		filmInfoList.add(new movie("Grown Ups", "Adam Sandler", 2010, 125001));

		filmoteka1.add(new movie("Cape Fear", " Robert De Niro; Nick Nolte", 1991, 12650));
		filmoteka1.add(new movie("Inception", "Leonardo DiCaprio; Joseph Gordon-Levitt", 2010, 615600));
		filmoteka1.add(new movie("Heat", "Al Pacino; Robert De Niro", 1995, 96500));
		filmoteka1.add(new movie("The Social Network", "Jesse Eisenberg", 2010, 124000));
		filmoteka1.add(new movie("Black Swan", "Natalie Portman", 2010, 125000));
		filmoteka1.add(new movie("Goodfellas", "Robert De Niro; Ray Liotta", 1990, 78950));

		filmoteka2.add(new movie("Shutter Island", "Leonardo DiCaprio", 2011, 125100));
		filmoteka2.add(new movie("The Intern", "Robert De Niro, Anne Hathaway", 2015, 45980));
		filmoteka2.add(new movie("127 Hours", "Kate Mara", 2010, 36500));
		filmoteka2.add(new movie("A Bronx Tale", " Robert De Niro; Chazz Palminteri", 1993, 45989));
		filmoteka2.add(new movie("The Fighter", "Christian Bale", 2010, 999900));
		filmoteka2.add(new movie("Casino", "Robert De Niro; Sharon Stone", 1995, 200000));

		filmoteka3.add(new movie("Raging Bull", "Robert De Niro; Cathy Moriarty", 1980, 300000));
		filmoteka3.add(new movie("True Grit", "Jeff Bridges", 2010, 30000));
		filmoteka3.add(new movie("The Mission", "Robert De Niro; Jeremy Irons", 1986, 400000));
		filmoteka3.add(new movie("Winter's Bone", "Jennifer Lawrence", 2010, 90000));
		filmoteka3.add(new movie("Analyze This", "Robert De Niro; Billy Crystal", 1999, 500000));
		filmoteka3.add(new movie("Blue Valentine", "Ryan Gosling", 2010, 60000));

		getMovies(filmInfoList);

		System.out.println();
		System.out.println("Movies with Robert De Niro");
		
		printAllFilmsWithRobertDeNiro(filmInfoList);
		
		System.out.println();
		System.out.println("List with movies 1:");
		System.out.println();
		

		getMovies(filmoteka1);

		System.out.println();
		System.out.println("Movies with Robert De Niro");

		printAllFilmsWithRobertDeNiro(filmoteka1);
		getAverageLicenseFee(filmoteka1);

		System.out.println();
		System.out.println("List with movies 2:");
		System.out.println();

		getMovies(filmoteka2);

		System.out.println();
		System.out.println("Movies with Robert De Niro");

		printAllFilmsWithRobertDeNiro(filmoteka2);
		getAverageLicenseFee(filmoteka2);
		
		System.out.println();
		System.out.println("List with movies 3:");
		System.out.println();

		getMovies(filmoteka3);

		System.out.println();
		System.out.println("Movies with Robert De Niro");

		printAllFilmsWithRobertDeNiro(filmoteka3);
		getAverageLicenseFee(filmoteka3);
	}
	
	public static void getMovies(List<movie> filmLibary) {
		if(filmLibary.size() > 10000) {
			throw new Error("Movies in the film libary must be less than 10000");
		}
		sortByMovieName(filmLibary);
		printFilmLibary(filmLibary);
	}

	public static void sortByMovieName(List<movie> filmLibary) {
		Collections.sort(filmLibary, new Comparator() {
			@Override
			public int compare(Object filmInfoListOne, Object filmInfoListTwo) {
				// use instanceof to verify the references are indeed of the type in question
				return ((movie) filmInfoListOne).name.compareTo(((movie) filmInfoListTwo).name);
			}
		});
	}
	
	public static void getAverageLicenseFee(List<movie> filmLibary) {
		double allLicenseFees = 0;
		int moviesFrom2010 = 0;
		for(movie film : filmLibary ) {
			if(film.year == 2010) {
				allLicenseFees += film.licenseFee;
				moviesFrom2010++;
			}
		}
		System.out.println();
		System.out.print("Average license fee of movies from 2010 in this movie libary is " + allLicenseFees / moviesFrom2010 );
		System.out.println();
	}
	
	
	
	public static void printFilmLibary(List<movie> filmLibary) {
		for (movie sd : filmLibary) {
			System.out.print(sd.name + "; ");
			
			for(var actor : sd.actorNames) {
				boolean isLastElement = sd.actorNames.indexOf(actor) == sd.actorNames.size() - 1;
				if(isLastElement) {
					System.out.print(actor + "; ");
				}else {
					System.out.print(actor + ", ");
				}
			}
			System.out.print(sd.year + "; " + sd.licenseFee);
			System.out.println();
		}
	}
	
	public static void printAllFilmsWithRobertDeNiro(List<movie> filmLibary) {
		List<movie> moviesWithRobert = filmLibary.stream()
			    .filter(p -> p.getActorNames().contains("Robert De Niro")).collect(Collectors.toList());

		Collections.sort(moviesWithRobert, new Comparator() {
			@Override
			public int compare(Object m1, Object m2) {
				// use instanceof to verify the references are indeed of the type in question
				if (((movie) m1).year < ((movie) m2).year) {
					return 1;
				} else if (((movie) m1).year > ((movie) m2).year) {
					return -1;
				} else if (((movie) m1).year == ((movie) m2).year) {
					if (((movie) m1).licenseFee > ((movie) m2).licenseFee) {
						return 1;
					} else if (((movie) m1).licenseFee < ((movie) m2).licenseFee) {
						return -1;
					}

				}
				return 0;

			}
		});
		
		printFilmLibary(moviesWithRobert);
	}

}
