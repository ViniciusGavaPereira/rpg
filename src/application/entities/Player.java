package application.entities;

public class Player {

	private String name;
	private Integer life;
	private Integer mana;
	private Integer stamina;
	private Inventory inventory;

	public Player() {
	}

	public Player(String name, Integer life, Integer mana, Integer stamina, Inventory inventory) {
		this.name = name;
		this.life = life;
		this.mana = mana;
		this.stamina = stamina;
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}

	public Integer getStamina() {
		return stamina;
	}

	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Player's Data:\n");
		sb.append("Name : " + name + "\n");
		sb.append("Life: " + life + "\n");
		sb.append("Mana: " + mana + "\n");
		sb.append("Stamina: " + mana + "\n");

		return sb.toString();
	}

}
