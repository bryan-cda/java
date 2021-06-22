import br.com.person.Person;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.BDDAssertions.*;

@ExtendWith(SpringExtension.class)
public class PersonTest {
    @Test
    @DisplayName("Verify if to string exists")
    public void givenGenericPerson_whenTestIfHasToString_thenReturn(){//Using AssertJ
        Person person = new Person("John", 30);
        String personToString = person.toString();
        assertThat(person).hasToString(personToString);

    }

    @Test
    @DisplayName("Verify if property exist")
    public void givenGenericPerson_whenTestIfHasProperty_thenReturn(){
        Person person = new Person("John", 30);
        String personToString = person.toString();
        assertThat(person).hasFieldOrProperty("name");

    }

    @Test
    @DisplayName("Verify if property exist")
    public void givenGenericPerson_whenTestIfPropertyIsGreaterThanNumber_thenReturn(){
        Person person = new Person("John", 30);
        String personToString = person.toString();
        assertThat(person.getAge()).isGreaterThan(29);
    }
}
