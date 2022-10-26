/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Oct 26, 2022
 */
package journal.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import journal.beans.Author;
import journal.beans.Entry;
import journal.beans.Journal;

/**
 * @author 15152
 *
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Author author() {
		Author bean = new Author();
		bean.setName("Alexander Kelly");
		return bean;
	}
	
	@Bean
	public Journal journal() {
		Journal bean = new Journal();
		bean.setTitle("My Austrailian Experiences");
		bean.setDescription("My Journey Through Austrailia");
		bean.setDateCreated(LocalDate.of(2022, Month.APRIL, 30));
		return bean;
	}
	
	@Bean
	public Entry entry() {
		Entry bean = new Entry();
		bean.setEntryDate(LocalDate.of(2022, Month.MAY, 4));
		bean.setEntryLog("Today was a great day in the sun!");
		return bean;
	}
	
	
}
