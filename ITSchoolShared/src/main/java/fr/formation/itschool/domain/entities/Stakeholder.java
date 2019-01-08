package fr.formation.itschool.domain.entities;

import java.util.Objects;

/**
 * Represents a stakeholder with its identity, contact information and status.
 */
public class Stakeholder extends AbstractEntity {

    private static final long serialVersionUID = -1449701680675705536L;

    private Person person;

    private ContactInfo contactInfo;

    private Status status;

    /*
     * Explicit protected constructor for ensuring security and consistency.
     */
    protected Stakeholder() {
	// Default no-arg empty constructor
    }

    /**
     * Indicates whether some other object is "equal to" this
     * {@code stakeholder}.
     * <p>
     * Two {@code Stakeholder} objects are considered equal if their identities
     * ({@code person}) are equal.
     *
     * @param obj
     *            an object to test equality against
     * @return {@code true} if this {@code stakeholder} is the same as
     *         {@code obj}; {@code false} otherwise
     * @see Person#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (!(obj instanceof Stakeholder)) {
	    return false;
	}
	Stakeholder other = (Stakeholder) obj;
	return person.equals(other.person);
    }

    /**
     * Returns a hash code value for this {@code stakeholder}.
     * <p>
     * This implementation is consistent with {@link #equals(Object)}.
     *
     * @return a hash code value for this {@code stakeholder}
     */
    @Override
    public int hashCode() {
	return Objects.hash(person);
    }

    /**
     * Returns a string representation of this {@code stakeholder}.
     * <p>
     * Returns a view of all the properties.
     *
     * @return a string representation of this {@code stakeholder}
     * @see Person#toString()
     * @see ContactInfo#toString()
     */
    @Override
    public String toString() {
	return "{id=" + getId() + ", person=" + person + ", contactInfo="
		+ contactInfo + ", status=" + status + "}";
    }

    /**
     * The enumeration of status.
     * <p>
     * Please not that the enumeration order is not meaningful.
     */
    public enum Status {
	/**
	 * Student status.
	 */
	STUDENT,
	/**
	 * Student status.
	 */
	TEACHER;
    }
}
