package Logika;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Towar {

	@Id
	@GeneratedValue
	long id;
	
	String nazwa;
	double cena;
	String opis;
	int ilosc;
	
	@ManyToOne
	@JoinColumn(name = "Id_magazynu")
	Magazyn magazyn;
	
	
	public Towar(String nazwa,double cena,String opis)
	{
		this.nazwa=nazwa;
		this.cena=cena;
		this.opis=opis;
		this.ilosc=0;
	}
}
