package javax;

public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public Person(final String firstName, final String lastName, final int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (object == null)
      return false;
    if (getClass() != object.getClass())
      return false;

    Person other = (Person)object;

    if (!firstName.equals(other.firstName))
      return false;
    if (!lastName.equals(other.lastName))
      return false;
    if (age != other.age)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + firstName.hashCode();
    result = prime * result + lastName.hashCode();
    result = prime * result + age;
    return result;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(getClass().getName()).append("(").append(firstName).append(",").append(lastName).append(",").append(age).append(")");
    return result.toString();
  }

  public static String checkPerson(final Object object) {
    if (object == null)
      return "parameter is null";

    if (!(object instanceof Person))
      return "not human";

    final Person person = (Person)object;

    if (person.getAge() < 18) {
      return person.getFirstName() + " is a child";
    } else {
      return person.getFirstName() + " is a adult";
    }
  }

  public static void main(String[] args) {
    final Person kid = new Person("John", "Smith", 9);
    final Person adult = new Person("Martin", "Smith", 47);
    final String cat = "Fluffy";

    System.out.println(checkPerson(kid));
    System.out.println(checkPerson(adult));
    System.out.println(checkPerson(cat));
  }
}
