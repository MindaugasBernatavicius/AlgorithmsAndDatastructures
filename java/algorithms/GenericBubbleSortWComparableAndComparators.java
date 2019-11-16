import java.util.Comparator;

public class GenericBubbleSortWComparableAndComparators {

    private static void bubbleSortWithComparable(Comparable arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j].compareTo(arr[j+1]) > 0){
                    Comparable temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void bubbleSortWithComparator(Human arr[], Comparator comparator){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (comparator.compare(arr[j], arr[j+1]) > 0){
                    Human temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Human[] a = { new Human("Mikas", "Mikaitis", 30),
                new Human("Jonas", "Jonaitis", 40),
                new Human("Tomas", "Tomaitis", 20),
                new Human("Maksas", "Maksaitis", 30)
        };

        System.out.print("Before sorting: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i].lastName + " " + a[i].age + " ");
        System.out.println();

        // bubbleSortWithComparable(a);
        bubbleSortWithComparator(a, new HumanDescendingComparator());

        System.out.print("After sorting: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i].lastName + " " + a[i].age + " ");
        System.out.println();
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

class Human implements Comparable {
    String name;
    String lastName;
    int age;

    Human(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(this.age == ((Human)o).age)
            return 0;
        else if (this.age > ((Human)o).age)
            return 1;
        else
            return -1;
    }
}

class HumanDescendingComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Human)o2).age - ((Human)o1).age;
    }
}
