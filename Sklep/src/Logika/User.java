package Logika;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue
	long id;
	String imie;
	String nazwisko;
	String pesel;
	String username;
	String password;
	
	
	@ManyToOne
	@JoinColumn(name = "Id_Sklepu")
	Sklep sklep;
	
	
	public Sklep getSklep() {
		return sklep;
	}

	public void setSklep(Sklep sklep) {
		this.sklep = sklep;
	}

	boolean sadmin;
	boolean admin;

	public User(String imie, String nazwisko, String pesel, String username, String password) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSadmin() {
		return sadmin;
	}

	public void setSadmin(boolean sadmin) {
		this.sadmin = sadmin;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
