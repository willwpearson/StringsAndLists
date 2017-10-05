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
		String currentCreator = "";
		for(int index = 0; index < myKahoots.size(); index ++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			
			Kahoot currentKahoot = myKahoots.get(index);
			String creator = currentKahoot.getCreator();
			
			popup.displayText(myKahoots.get(index).toString());
			
			if(currentCreator.equals("nobody"))
			{
				for(int loop = 0; loop < 5; loop += 1)
				{
					popup.displayText("wow nobody does a lot");
				}
			}
			
			for(int currentLetterIndex = 0; currentLetterIndex < currentCreator.length(); currentLetterIndex += 1)
			{
				popup.displayText(currentCreator.substring(currentLetterIndex, currentLetterIndex + 1));
			}
		}
	}
	
	private void fillTheList()
	{
		// Created multiple Kahoots
		Kahoot fiftyStates = new Kahoot("Kashish", 50, "The Fifty United States");
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2, "The Double data type");
		Kahoot worldCountries = new Kahoot("Will", 195, "The World Countries");
		Kahoot continentName = new Kahoot("Jian", 7, "The Continents");
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE, "Everything");
		// Added Kahoots into a list
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(worldCountries);
		myKahoots.add(continentName);
		myKahoots.add(bigQuiz);
	}
}
