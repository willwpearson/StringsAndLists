package lists.controller;

import java.util.List;
import java.util.ArrayList;
import lists.model.Kahoot;
import lists.view.ListsDisplay;

public class ListsController
{
	// Created a list for Kahoots
	private List<Kahoot> myKahoots;
	private ListsDisplay popup;
	
	public ListsController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new ListsDisplay();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for(int index = 0; index < myKahoots.size(); index ++)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		// Created multiple Kahoots
		Kahoot fiftyStates = new Kahoot("Kashish", 50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot worldCountries = new Kahoot("Will", 195);
		Kahoot continentName = new Kahoot("Will", 7);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		// Added Kahoots into a list
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(worldCountries);
		myKahoots.add(continentName);
		myKahoots.add(bigQuiz);
	}
}
