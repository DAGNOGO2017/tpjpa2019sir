package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Allergie {

	private int idAllergie;
	private String nomAllergie;
	private Collection<User> users;
	
	@Id
	@GeneratedValue
	public int getIdAllergie() {
		return idAllergie;
	}
	public void setIdAllergie(int idAllergie) {
		this.idAllergie = idAllergie;
	}
	public String getNomAllergie() {
		return nomAllergie;
	}
	public void setNomAllergie(String nomAllergie) {
		this.nomAllergie = nomAllergie;
	}
	@ManyToMany
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
}
