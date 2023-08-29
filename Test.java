package oops;

class Test{  
	 public static void main(String[] args) {
	        Student spy = new Student();
	        
	       
	        spy.setName("ramesh");
	        spy.setAge(24);
	        
	        
	       
	        System.out.println("Name: " + spy.getName());
	        System.out.println("Age: " + spy.getAge());
	        
	       
	        spy.setAge(-5);
	    }
}
	