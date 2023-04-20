package application.entities;

public class Weapon {

	private Integer id;
	private String name;
	private Integer damage;

	public Weapon() {

	}

	public Weapon(Integer id, String name, Integer damage, Integer amount) {
		this.id = id;
		this.name = name;
		this.damage = damage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Weapon's Data:\n");
		sb.append("Name : " + id + "\n");
		sb.append("Life: " + name + "\n");
		sb.append("Mana: " + damage + "\n");

		return sb.toString();
	}

}
