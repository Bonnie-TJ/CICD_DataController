package sg.edu.nus.iss.d13revision;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sg.edu.nus.iss.d13revision.controllers.PersonController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PersonControllerTest {

    PersonController personController;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testShowAddPersonPage() {

        //assertEquals("HEALTH CHECK OK!", personController.showAddPersonPage(null));
    }

    @Test
    void testGetAllPersons() {

    }
}
