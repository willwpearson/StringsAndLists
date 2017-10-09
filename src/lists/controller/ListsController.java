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
//		showTheList();
//		changeTheList();
		practiceTheList();
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
			
			String topic = currentKahoot.getTopic();
			
			for(int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1)
			{
				popup.displayText(topic.substring(letter, letter + 1));
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
	
	private void changeTheList()
	{
		popup.displayText("The current list size is: " + myKahoots.size());
		Kahoot removed = myKahoots.remove(3);
		popup.displayText("I removed the Kahoot by " + removed.getCreator());
		popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("The list is still: " + myKahoots.size() + " items big.");
		removed = myKahoots.set(2, new Kahoot());
		popup.displayText("The kahoot by " + removed.getCreator() + " was replaced with one by: " + myKahoots.get(2).getCreator());
	}

	private void practiceTheList()
	{
		// Adding an item to the list
		popup.displayText("The list is: " + myKahoots.size() + " items big.");
		Kahoot rickAndMorty = new Kahoot("Rick Sanchez", Integer.MAX_VALUE, "Everything");
		myKahoots.add(rickAndMorty);
		popup.displayText("I added the Kahoot on: " + myKahoots.get(5).getTopic());
		popup.displayText("The new list is: " + myKahoots.size() + " items big.");
		
		// Removing an item from the list
		Kahoot removes = myKahoots.set(6, rickAndMorty);
		myKahoots.remove(rickAndMorty);
		popup.displayText("I removed the Kahoot made by: " + removes.getCreator());
		popup.displayText("The list is now: " + myKahoots.size() + " items big.");
		
		// Getting all the items in the list
		String currentCreator = "";
		for(int index = 0; index < myKahoots.size(); index ++)
		{
			currentCreator = myKahoots.get(index).getCreator();
			popup.displayText(myKahoots.get(index).toString());
		}
		
		// Adding at a certain index
		popup.displayText("The list is: " + myKahoots.size() + " items big.");
		myKahoots.add(4, rickAndMorty);
		popup.displayText("I added a new Kahoot. This list is now: " + myKahoots.size() + " items big.");
		popup.displayText(myKahoots.get(4).toString());
		
		// Adding a new Kahoot with parameters
		myKahoots.add(new Kahoot("Jian", 10, "why Jian sux"));
		popup.displayText("I added a new Kahoot");
		popup.displayText(myKahoots.get(7).toString());
		
	}

	public ListsDisplay getPopup()
	{
		return popup;
	}
	
	public ArrayList<Kahoot> getMyKahoots()
	{
		return (ArrayList<Kahoot>)myKahoots;
	}
}
