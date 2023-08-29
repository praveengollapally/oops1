package oops;



class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Lion extends Animal {
    @Override
    public void speak() {
        System.out.println("King of the forest");
    }
}



class Tiger extends Animal {
    @Override
    public void speak() {
        System.out.println("National animal of India");
    }
}

public class Inheritance {
    public static void main(String[] args) {
    	Animal lion = new Lion(); 
    	Animal tiger = new Tiger(); 

        lion.speak();  
        tiger.speak();      
    }
}

