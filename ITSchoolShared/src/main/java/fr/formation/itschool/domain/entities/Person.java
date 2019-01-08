package fr.formation.itschool.domain.entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents the identity of a physical person with its gender, first and last
 * names; birth date and social security number.
 */
public class Person extends AbstractEntity {

    private static final long serialVersionUID = -8339695911169764830L;

    private String socialSecNumber;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private Gender gender;

    /*
     * Explicit protected constructor for ensuring security and consistency.
     */
    protected Person() {
	// Default no-arg empty constructor
    }

    /**
     * Indicates whether some other object is "equal to" this {@code person}.
     * <p>
     * Two {@code Person} objects are considered equal if their social security
     * numbers ({@code socialSecNumber}) are equal case-sensitively.
     *
     * @param obj
     *            an object to test equality against
     * @return {@code true} if this {@code person} is the same as {@code obj};
     *         {@code false} otherwise
     * @see String#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (!(obj instanceof Person)) {
	    return false;
	}
	Person other = (Person) obj;
	return socialSecNumber.equals(other.socialSecNumber);
    }

    /**
     * Returns a hash code value for this {@code person}.
     * <p>
     * This implementation is consistent with {@link #equals(Object)}.
     *
     * @return a hash code value for this {@code person}
     */
    @Override
    public int hashCode() {
	return Objects.hash(socialSecNumber);
    }

    /**
     * Returns a string representation of this {@code person}.
     * <p>
     * Returns a view of all the properties.
     *
     * @return a string representation of this {@code person}
     * @see {@link LocalDate#toString()} for the birth date string
     *      representation
     */
    @Override
    public String toString() {
	return "{id=" + getId() + ", socialSecNumber=" + socialSecNumber
		+ ", firstName=" + firstName + ", lastName=" + lastName
		+ ", birthDate=" + birthDate + ", gender=" + gender + "}";
    }

    /**
     * The enumeration of genders.
     * <p>
     * Please not that the enumeration order is not meaningful.
     */
    public enum Gender {
	/**
	 * Female gender.
	 */
	FEMALE,
	/**
	 * Male gender.
	 */
	MALE;
    }
}
