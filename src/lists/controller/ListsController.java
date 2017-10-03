package lists.controller;

import java.util.List;
import java.util.ArrayList;
import lists.model.Kahoot;

public class ListsController
{
	private List<Kahoot> myKahoots;
	
	public ListsController()
	{
		myKahoots = new ArrayList<Kahoot>();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	
	private void fillTheList()
	{
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot worldCountries = new Kahoot("Will", 195);
		Kahoot continentName = new Kahoot("Will", 7);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(worldCountries);
		myKahoots.add(continentName);
		myKahoots.add(bigQuiz);
	}
}
