package univ.lang.java.lab3;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ContactServiceTest {

    private ContactService contactService = null;

    @Before
    public void setUp() throws Exception {
        this.contactService = ContactService.create();
    }

    @Test
    public void testCount() throws Exception {
        assertEquals("Number of contact should be 497", this.contactService.count(), 497);
    }

    @Test
    public void testLoadContactFromCity() throws Exception {
        assertThat("Number of contacts in Luxembourg should be 82", this.contactService.loadContactFromCity(City.LUXEMBOURG), hasSize(82));
    }

    @Test
    public void testLoadContactNameAndLastNameFromFrenchCity() throws Exception {
        assertThat("Number of contacts in French city should be 252", this.contactService.loadContactNameAndLastNameFromFrenchCity(), hasSize(252));
        assertThat("First contact in French city should be [Aguettaz Anne]", this.contactService.loadContactNameAndLastNameFromFrenchCity().get(0), equalToIgnoringCase("Aguettaz Anne"));
    }

    @Test
    public void testGroupContactByAge() throws Exception {
        final Map<Long, List<Contact>> contactsGroup = this.contactService.groupContactByAge();

        assertThat("Number of contact have XX years old 16", contactsGroup.get(25L), hasSize(16));
        assertThat("Number of contact have 52 years old 12", contactsGroup.get(52L), hasSize(12));
    }

}
