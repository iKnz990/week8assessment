package journal;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import journal.beans.Author;
import journal.beans.Entry;
import journal.beans.Journal;
import journal.controller.BeanConfiguration;
import journal.repository.AuthorRepository;
import journal.repository.JournalRepository;
@SpringBootApplication
public class Week8assessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8assessmentApplication.class, args);
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Author a = appContext.getBean("author", Author.class);
		//System.out.println(a.toString());
	}
@Autowired
AuthorRepository repo;

public void run(String... args) throws Exception {
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	//Creating a bean to use -- not managed by Spring
	Author d = new Author("Alexander Kelly");
	Journal j = new Journal ("My Austrailian Experiences", "My Journey Through Austrailia", LocalDate.of(2022, Month.APRIL, 30));
	Entry e = new Entry(LocalDate.of(2022, Month.MAY, 2), "Today was a sunny day!");
		j.setEntry(e);
		d.setJournal(j);
		repo.save(d);
		
	Author p = new Author("Jacob Kelly");
	Journal k = new Journal ("My France Experiences", "My Trip through France", LocalDate.of(2021, Month.AUGUST, 15));
	Entry r = new Entry(LocalDate.of(2021, Month.JULY, 3), "The trip was awesome, the french are great!");
	
		k.setEntry(r);
		
		p.setJournal(k);
		repo.save(p);
		Entry l = new Entry(LocalDate.of(2021, Month.APRIL, 2), "Yippie a new Journal!");
		k.setEntry(l);
		repo.save(p);
		
	List<Author> allMyAuthors = repo.findAll();
		for(Author people: allMyAuthors) {
			System.out.println(people.toString());
			}
		((AbstractApplicationContext) appContext).close();
		

	}
}
