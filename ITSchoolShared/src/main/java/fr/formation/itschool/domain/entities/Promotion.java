package fr.formation.itschool.domain.entities;

import java.time.LocalDate;
import java.util.Set;

/**
 * Represents a promotion with its name, start and end dates; teachers and
 * students.
 */
public class Promotion extends AbstractEntity {

    private static final long serialVersionUID = -7795215991284760793L;

    private String name;

    private LocalDate startDate;

    private LocalDate endDate;

    private Set<Stakeholder> teachers;

    private Set<Stakeholder> students;

    /*
     * Explicit protected constructor for ensuring security and consistency.
     */
    protected Promotion() {
	// Default no-arg empty constructor
    }

    /**
     * Returns a string representation of this {@code promotion}.
     * <p>
     * Returns a view of all the properties but the teachers and students.
     *
     * @return a string representation of this {@code promotion}
     * @see {@link LocalDate#toString()} for the start and end dates string
     *      representation
     */
    @Override
    public String toString() {
	return "{id=" + getId() + ", name=" + name + ", startDate=" + startDate
		+ ", endDate=" + endDate + "}";
    }
}
