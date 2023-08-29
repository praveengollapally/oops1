package oops;

class Shapes {
    public void area() {
        System.out.println("Find area ");
    }

    public void area(int r) {
        System.out.println("Circle area = " + 3.14 * r * r);
    }

    public void area(double b, double h) {
        System.out.println("Triangle area = " + 0.5 * b * h);
    }

    public void area(int l, int b) {
        System.out.println("Rectangle area = " + l * b);
    }
        
}

class Methodoverloading1 {
    public static void main(String[] args) {
        Shapes mno = new Shapes(); 

        mno.area();
        mno.area(5);
        mno.area(6.0, 1.2);
        mno.area(6, 2);
        
    }
}
