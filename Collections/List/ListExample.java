
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

public class ListExample {
    

    public static void printList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            // System.out.println(list.get(i).getClass());
        }
    }

    public static void main(String[] args) {
        
        List<Object> list = new ArrayList<>();
        LinkedList<Object> linked = new LinkedList<>();
        linked.add("Sumit Puri");

        list.add(34);
        list.add("list");
        list.add(true);
        list.add(34.6);

        list.add(2, "Rajesh Waghmode");
        list.addAll(linked);

        list.remove(0);

        Iterator<Object> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        
        // list.clear();
        // printList(list);
        // System.out.println(list.hashCode());
        // String name = list.get(0).toString();

        // System.out.println(name);
        // Integer num = (Integer)list.get(0);


        // for(Object obj:list){
        //     System.out.println(obj);
        // }


        // list.forEach(items -> {
        //     System.out.println(items);
        // });

        // printList(list);

    }
}
