package domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class DateReunion {
	
	private int idDateReunion;
	private String libelle;
	
	private User user;
	private Collection<Sondage> sondages;
	
	@Id
	@GeneratedValue
	public int getIdDateReunion() {
		return idDateReunion;
	}
	public void setIdDateReunion(int idDateReunion) {
		this.idDateReunion = idDateReunion;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@OneToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	public Collection<Sondage> getSondages() {
		return sondages;
	}
	public void setSondages(Collection<Sondage> sondages) {
		this.sondages = sondages;
	}
	
	
}
