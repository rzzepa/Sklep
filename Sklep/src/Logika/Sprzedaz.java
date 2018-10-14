package Logika;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sprzedaz {

	@Id
	@GeneratedValue
	long id;
	String data;
	
	@OneToOne
	User sprzedawca;
	
	@OneToMany
	@JoinColumn(name="id zakupu")
	List<Towar> zakupy;
	
	@ManyToOne
	@JoinColumn(name = "Id_sklepu")
	Sklep sklep;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getSprzedawca() {
		return sprzedawca;
	}
	public void setSprzedawca(User sprzedawca) {
		this.sprzedawca = sprzedawca;
	}

	public List<Towar> getZakupy() {
		return zakupy;
	}
	public void setZakupy(List<Towar> zakupy) {
		this.zakupy = zakupy;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Sklep getSklep() {
		return sklep;
	}
	public void setSklep(Sklep sklep) {
		this.sklep = sklep;
	}
}
