package behavioral.iterator;

import java.util.*;

public class IteratorEverydayDemo {

    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        Iterator<String> namesItr = names.iterator();

//        // Enhanced for loop has an Iterator under the hood
//        for (String name : names){
//            System.out.println(name);
//        }

//        for (int i = 0; i < names.size(); i++) {      // Set has no .get()
//            String name = names.get(i);
//        }

        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }

        System.out.println("Names size: " + names.size());

    }

}
