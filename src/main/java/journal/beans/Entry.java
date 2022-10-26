/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Oct 26, 2022
 */
package journal.beans;

import java.time.LocalDate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 15152
 *
 */
//Entry for the Journal aka Pages
@Entity
public class Entry {
@Id
@GeneratedValue
private long id;
private LocalDate entryDate;
private String entryLog;

public Entry() {
	super();
}
public Entry(int id, LocalDate entryDate, String entryLog) {
	super();
	this.id = id;
	this.entryDate = entryDate;
	this.entryLog = entryLog;
}

public Entry(LocalDate entryDate, String entryLog) {
	super();
	this.entryDate = entryDate;
	this.entryLog = entryLog;
}
public LocalDate getEntryDate() {
	return entryDate;
}
public void setEntryDate(LocalDate entryDate) {
	this.entryDate = entryDate;
}
public String getEntryLog() {
	return entryLog;
}
public void setEntryLog(String entryLog) {
	this.entryLog = entryLog;
}
@Override
public String toString() {
	return "Entry [entryDate=" + entryDate + ", entryLog=" + entryLog + "]";
}










}
