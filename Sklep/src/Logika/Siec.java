package Logika;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Siec {
	
	@Id
	@GeneratedValue
	long id;
	String name;
	@OneToMany
	List<Sklep> sklepy;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sklep> getSklepy() {
		return sklepy;
	}

	public void setSklepy(List<Sklep> sklepy) {
		this.sklepy = sklepy;
	}

	public Siec()
	{
		this.name="Euro RTV AGD";
		this.sklepy=new ArrayList<Sklep>();
	}
	
	public void DodajSklep(Sklep sklep)
	{
		sklepy.add(sklep);
	}
}
