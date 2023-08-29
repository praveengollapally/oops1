package oops;
//Encapsulation

public class Student {
    private String name;
    private int age;
    
    // Getter and setter//
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getAge() {
        return age;
    }
    
    
    public void setAge(int age) {
       
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
    
   
}
 

