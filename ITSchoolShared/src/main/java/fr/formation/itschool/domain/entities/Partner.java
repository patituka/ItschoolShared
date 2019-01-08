package fr.formation.itschool.domain.entities;

/**
 * Represents a partner with its name and contact information.
 */
public class Partner extends AbstractEntity {

    private static final long serialVersionUID = 523178222700962654L;

    private String name;

    private String contactName;

    private ContactInfo contactInfo;

    /*
     * Explicit protected constructor for ensuring security and consistency.
     */
    protected Partner() {
	// Default no-arg empty constructor
    }

    /**
     * Returns a string representation of this {@code partner}.
     * <p>
     * Returns a view of all the properties.
     *
     * @return a string representation of this {@code partner}
     * @see ContactInfo#toString()
     */
    @Override
    public String toString() {
	return "{id=" + getId() + ", name=" + name + ", contactName="
		+ contactName + ", contactInfo=" + contactInfo + "}";
    }
}
