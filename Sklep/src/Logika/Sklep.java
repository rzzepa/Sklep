package Logika;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sklep {

	@Id
	@GeneratedValue
	long id;
	String ulica;
	String kodpocztowy;
	String miasto;
	double dochod;
	
	@OneToMany(mappedBy="sklep")
	List<User> uzytkownicy;
	
	@OneToOne
	Magazyn magazyn;
	
	@OneToMany(mappedBy="sklep")
	List<Sprzedaz> historiasp;
	

	
	public Magazyn getMagazyn() {
		return magazyn;
	}

	public void setMagazyn(Magazyn magazyn) {
		this.magazyn = magazyn;
	}

	public List<Sprzedaz> getHistoriasp() {
		return historiasp;
	}

	public void setHistoriasp(List<Sprzedaz> historiasp) {
		this.historiasp = historiasp;
	}

	public Sklep(String miasto, String ulica, String kodpocztowy) {
		this.ulica = ulica;
		this.miasto = miasto;
		this.kodpocztowy = kodpocztowy;
		this.magazyn= new Magazyn();
		this.dochod = 0;
		uzytkownicy= new ArrayList<User>();

	}

	public List<User> getUzytkownicy() {
		return uzytkownicy;
	}

	public void setUzytkownicy(List<User> uzytkownicy) {
		this.uzytkownicy = uzytkownicy;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getKodpocztowy() {
		return kodpocztowy;
	}

	public void setKodpocztowy(String kodpocztowy) {
		this.kodpocztowy = kodpocztowy;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	/*
	 * public Magazyn getMagazyn() { return magazyn; }
	 * 
	 * public void setMagazyn(Magazyn magazyn) { this.magazyn = magazyn; }
	 */

	public double getDochod() {
		return dochod;
	}

	public void setDochod(double dochod) {
		this.dochod = dochod;
	}

}
