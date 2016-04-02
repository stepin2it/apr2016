// POJO : Plain Old Java Object
public class Person {
    
    // These are properties
    private String name;
    private int age;

    // ConstructorString allocates memory for a object
    public Person(String aName, int aAge) {
        name = aName;
        age = aAge;
    
    }
    // These are methods
    // getter for Name
    public String getName() {
        return name;
    }    
    // setter for Name
    public void setName(String aName) {
        name = aName;
    }
    
    // getter for Age
    public int getAge() {
        return age;
    }
    
    // setter for Age
    public void setAge(int aAge) {
        age = aAge;
    }

}
