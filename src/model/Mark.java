package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //Specifies that this corresponts to a Database table.
@Table(name= "Mark") //Specifies the tributes of the table or schema if needed
public class Mark {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //with this tag we make the id auto_increment
	@Column(name = "id", unique = true, nullable = true) //with this tag we specify the atributes
	private int id;										 //name specify the column name on the Database
														 //unique = true/false specifies if there is a unique constraint
	@Column												 //nullable = treu/false specifies that the values can be null or not
	private int number;
	
	@Column
	private String letter;
	
	//Empty constructor is needed
	public Mark(){} 
	 
	public Mark(int number, String letter) {
		this.number = number;
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "Mark [id=" + id + ", number=" + number
				+ ", letter=" + letter + "]";
	}
	
}
