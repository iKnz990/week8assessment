/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Oct 26, 2022
 */
package journal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import journal.beans.Author;

/**
 * @author 15152
 *
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
