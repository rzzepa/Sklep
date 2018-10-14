package Logika;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Magazyn {
	
	@Id
	@GeneratedValue
	long id;
	
	@OneToOne(mappedBy="magazyn")
	@JoinColumn(name = "Id_magazynu")
	Sklep sklep;
	
	
	@OneToMany(mappedBy="magazyn")
	List<Towar> towary;
	
	public Magazyn()
	{
		towary= new ArrayList<Towar>();
	}
}
