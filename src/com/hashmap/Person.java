package com.hashmap;
public class Person {
  private String lastName;
  private String firstName;
  private boolean female;
  
  
  
  public Person(String lastName, String firstName, boolean female) {
	super();
	this.lastName = lastName;
	this.firstName = firstName;
	this.female = female;
}

@Override
  public boolean equals(Object obj)
  {
     if (obj == null)
     {
        return false;
     }
     if (getClass() != obj.getClass())
     {
        return false;
     }
     final Person other = (Person) obj;
     if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName))
     {
        return false;
     }
     if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName))
     {
        return false;
     }
     if (this.female != other.female)
     {
        return false;
     }
     return true;
  }
  
  @Override
  public int hashCode()
  {
     int hash = 3;
     hash = 19 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
     hash = 19 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
     hash = 19 * hash + (this.female ? 1 : 0);
     return hash;
  }

  @Override
  public String toString()
  {
     return  "Person{" + "lastName=" + lastName + ", firstName=" + firstName
           + ", female=" + female +  '}';
  }
}