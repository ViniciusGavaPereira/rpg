package application;

import java.io.FileNotFoundException;

import application.services.DatabaseFinder;
import application.services.Menu;

public class Program {

	public static void main(String[] args) throws FileNotFoundException{
		Menu.menu();
      
		DatabaseFinder.databseFinder("rpg/src/database-files/weapons-database");
	}
}
