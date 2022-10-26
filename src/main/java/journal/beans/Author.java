/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Oct 26, 2022
 */
package journal.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 15152
 *
 */
//Author of Many Journals
@Entity
public class Author {
@Id
@GeneratedValue
private long id;
private String name;
@Autowired
@ManyToOne(cascade = {CascadeType.ALL})
private Journal journal;


public Author() {
	super();
}
public Author(String name) {
	super();
	this.name = name;
}
public Author(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
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

public Journal getJournal() {
	return journal;
}
public void setJournal(Journal journal) {
	this.journal = journal;
}
@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + ", journal=" + journal + "]";
}







}
