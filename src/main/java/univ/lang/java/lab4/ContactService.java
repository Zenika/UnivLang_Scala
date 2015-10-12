package univ.lang.java.lab4;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;

public class ContactService {

    private ContactService() {}

    public static final ContactService create() {
        return new ContactService();
    }

    private final List<Contact> contacts = Utils.getContacts();

    public final int count() {
        return this.contacts.size();
    }

    /**
     * Load contacts from city parameter
     */
    public final List<Contact> loadContactFromCity(final City city) {

        final List<Contact> newContacts = Lists.newArrayList();

        for (int i = 0; i < this.contacts.size(); i++) {
            final Contact contact = this.contacts.get(i);
            final City contactCity = contact.getCity();
            if (contactCity == city) {
                newContacts.add(contact);
            }
        }

        return newContacts;
    }

    /**
     * Result must be sorted by lastName ascending
     */
    public final List<String> loadContactNameAndLastNameFromFrenchCity() {

        final List<String> newContacts = Lists.newArrayList();

        for (int i = 0; i < this.contacts.size(); i++) {
            final Contact contact = this.contacts.get(i);
            final City contactCity = contact.getCity();
            if (contactCity.isFrench()) {
                newContacts.add(contact.getLastName() + " " + contact.getName());
            }
        }

        return Ordering.natural().sortedCopy(newContacts);
    }

    /**
     * Group contact by age
     */
    public final Map<Long, List<Contact>> groupContactByAge() {

        final Map<Long, List<Contact>> contactsGroup = Maps.newHashMap();

        for (int i = 0; i < this.contacts.size(); i++) {
            final Contact contact = this.contacts.get(i);
            if (contactsGroup.get(contact.getAge()) == null) {
                contactsGroup.put(contact.getAge(), Lists.newArrayList(contact));
            } else {
                contactsGroup.get(contact.getAge()).add(contact);
            }
        }

        return contactsGroup;
    }
}
