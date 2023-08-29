package oops;


class Fruits {
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class  Apple extends Fruits {
    @Override
    public void speak() {
        System.out.println("Apples are red");
    }
}



class Orange extends Apple {
    @Override
    public void speak() {
        System.out.println("orange");
    }
}

public class Multilevel {
    public static void main(String[] args) {
    	Fruits uvw = new Apple(); 
    	Fruits xyz= new Orange(); 

        uvw.speak();  
        xyz.speak();      
    }
}
