public class BubbleSortUDT {
    public static void main(String args[]) {
        Person[] a = { new Person("Jonas", "Jonaitis", 10),
                        new Person("Tomas", "Tomaitis", 20),
                        new Person("Maksas", "Maksaitis", 30) };
        
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i].age);
    }
}

class Person {
    String name;
    String lastName;
    int age;
    
    Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
