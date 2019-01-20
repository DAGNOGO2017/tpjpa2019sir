package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sondage {
	
	private int idSondage;
	private String libelle;
	
	private Collection<DateReunion> datesReunions;
	private Collection<User> users;
	
	@Id
	@GeneratedValue
	public int getIdSondage() {
		return idSondage;
	}
	public void setIdSondage(int id) {
		this.idSondage = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	public Collection<DateReunion> getDatesReunions() {
		return datesReunions;
	}
	public void setDatesReunions(Collection<DateReunion> datesReunions) {
		this.datesReunions = datesReunions;
	}
	@ManyToMany(cascade=CascadeType.ALL)
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
}
