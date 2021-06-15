import java.util.ArrayList;
import java.util.List;

public class movie {
	
	public String name;
	public ArrayList<String> actorNames;
	public int year;
	public int licenseFee;
	
	public  movie(String filmName, String actorsNames, int realiseDate, int tax) {
		name = filmName;
		actorNames = new ArrayList();
		String[] actorsArray = actorsNames.split("; ");
		for(var actor : actorsArray) {
			actorNames.add(actor);
		}
		year = realiseDate;
		licenseFee = tax;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getActorNames(){
		return this.actorNames;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLicenseFee() {
		return licenseFee;
	}

	public void setLicenseFee(int licenseFee) {
		this.licenseFee = licenseFee;
	}
		
	}
		