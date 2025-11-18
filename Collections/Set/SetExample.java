import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(String name , int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    
}



public class SetExample {


    
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Navin");
        hashSet.add("Rajesh Waghmode");

        set.add("Rajesh Waghmode");
        set.add("Sumit Puri");
        set.add("Sumit Pui");
        set.add("Sumit ui");
        set.add("Sumt ui");
        set.add("Sut ui");
        set.add("St ui");
        set.add("t ui");
        set.add("t ui");
        set.add("Apple");
        set.add("Banana");
        set.add("Cat");
        set.add("Dog");
        set.add("Elephant");
        set.add("Fish");

        // System.out.println(set.isEmpty());
        // int size = set.size();
        // System.out.println(size);
        
        // set.addAll(hashSet);
        // System.out.println(set.containsAll(hashSet));
        
        // set.forEach(item -> System.out.println(item));
        // System.out.println(set);

        // Iterator<String> it = set.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }


        // Set<String> names = new LinkedHashSet<>();
        // names.add(null);
        // names.add("Rajesh Waghmode");
        // // System.out.println(names.size());

        // names.add("ravi");
        // names.add("rahul");
        // names.add("suresh");
        // names.add("manoj");

        // names.forEach(items -> System.out.println(items));

        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Rajesh Waghmode", 23));
        persons.add(new Person("Rahul Waghmode", 2));
        persons.add(new Person("Avinash Waghmode", 23));
   
        Iterator<Person> it = persons.iterator();
    
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.getName());
            System.out.println(p.getAge());
        }
    }
}
