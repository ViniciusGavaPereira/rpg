package application.entities;

import java.util.List;

public class Inventory {

	private List<Weapon> weapons;

	public Inventory() {
	}

	public Inventory(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public List<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}

}
