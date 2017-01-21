package fixcode;
/**
 * A model of student with name and id.
 * @author Kongpon C.
 *
 */
public class Student extends Person {
	/**
	 * Student's identification number.
	 */
	private long id;

	/**
	 * Initialize a Student object by name and id.
	 * 
	 * @param name
	 *            is the student's name
	 * @param id
	 *            is the identification number of the student
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/**
	 * Return a string representation of this Student.
	 * @return a string consisting of Student followed by name and id
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student by name and id. They are equal if the name and id
	 * matches.
	 * 
	 * @param obj
	 *            is another Student to compare to this one.
	 * @return true if the name and id is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		// cannot compare null.
		if (obj == null)
			return false;
		// cannot compare different class.
		if (obj.getClass() != this.getClass())
			return false;

		Student other = (Student) obj;
		return this.name.equalsIgnoreCase(other.name) && this.id == other.id;
	}

	/**
	 * Get student's id.
	 * 
	 * @return student's id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Set or change student's id.
	 * 
	 * @param id
	 *            is the student's identification number
	 */
	public void setId(long id) {
		this.id = id;
	}


}
