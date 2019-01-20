package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	private int idUser;
	private String Nom;
	private String Prenom;
	private String Email;
	
	private Preference preferences;
	private DateReunion datesReunions;
	private Collection<Allergie> allergies;
	private Collection<Sondage> sondages;
	
	@Id
	@GeneratedValue
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@ManyToOne
	public Preference getPreferences() {
		return preferences;
	}
	public void setPreferences(Preference preferences) {
		this.preferences = preferences;
	}
	@OneToOne(cascade=CascadeType.ALL)
	public DateReunion getDatesReunions() {
		return datesReunions;
	}
	public void setDatesReunions(DateReunion datesReunions) {
		this.datesReunions = datesReunions;
	}
	@ManyToMany(mappedBy="users")
	public Collection<Allergie> getAllergies() {
		return allergies;
	}
	public void setAllergies(Collection<Allergie> allergies) {
		this.allergies = allergies;
	}
	@ManyToMany(mappedBy="users")
	public Collection<Sondage> getSondages() {
		return sondages;
	}
	public void setSondages(Collection<Sondage> sondages) {
		this.sondages = sondages;
	}
	
	
}
