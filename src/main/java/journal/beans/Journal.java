/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Oct 26, 2022
 */
package journal.beans;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 15152
 *
 */
//This is the class for the Individual Journals
//Journal has many entries

@Entity
public class Journal {
	@Id
	@GeneratedValue
private long id;
private String title;
private String description;
private LocalDate dateCreated;
@Autowired
@ManyToOne(cascade = {CascadeType.ALL})
private Entry entry;


public Journal() {
	super();
}
public Journal(int id, String title) {
	super();
	this.id = id;
	this.title = title;
}
public Journal(String title, String description) {
	super();
	this.title = title;
	this.description = description;
}
public Journal(String title, String description, LocalDate dateCreated) {
	super();
	this.title = title;
	this.description = description;
	this.dateCreated = dateCreated;
}



public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public LocalDate getDateCreated() {
	return dateCreated;
}
public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}

public Entry getEntry() {
	return entry;
}
public void setEntry(Entry entry) {
	this.entry = entry;
}
@Override
public String toString() {
	return "Journal [id=" + id + ", title=" + title + ", description=" + description + ", dateCreated=" + dateCreated
			+ ", entry=" + entry + "]";
}







}
