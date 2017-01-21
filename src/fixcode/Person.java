package fixcode;

/**
 * A simple model for a person with a name.
 * 
 * @author Kongpon C.
 */

public class Person {
	/** The person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object by name.
	 * @param name is the name if the student
	 */
	public Person(String name) {
		this.name = name;
	}


	/**
	 * Get the person's name.
	 * @return name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set or change the person's name.
	 * @param name is the name of the person to be set to
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Compare person's by name. They are equal if the name matches.
	 * 
	 * @param obj
	 *            is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		// cannot compare null.
		if (obj == null)
			return false;
		// cannot compare different class.
		if (obj.getClass() != this.getClass())
			return false;

		Person other = (Person) obj;
		return this.name.equalsIgnoreCase(other.name);
	}

	/**
	 * Get a string representation of this Person.
	 * @return a string consisting of Person and its name
	 */
	public String toString() {
		return "Person " + name;
	}
}
