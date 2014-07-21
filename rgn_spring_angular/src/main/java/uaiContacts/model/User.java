package uaiContacts.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "system_user")
public class User {

	private int id;
	private String name;
	private String enabled;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", enabled=" + enabled
				+ ", password=" + password + "]";
	}

}
