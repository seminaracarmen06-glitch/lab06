package it.unibo.collections;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * Program entry point.
     */
    public static void main() {

        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        

        final ArrayList<Integer> set = new ArrayList<>();
        for (int i=1000; i<2000; i++){
            set.add(i);
        }

        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */

        final LinkedList<Integer> set2= new LinkedList<>();
        set2.addAll(set);

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */

        int a=set.get(0);
        int dim=set.size();
        dim--;
        int b=set.get(dim);
        set.set(0, b);
        set.set(dim,a);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for (int p: set){
            IO.println(p);
        }

        for (int j=0; j<=100000;j++){
            set.add(j);
        }
         /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */


        long time = System.nanoTime();
        var millis = TimeUnit.NANOSECONDS.toMillis(time);
        IO.println(
             "Converting "
                    + set.size()
                    + " ints to String and inserting them in a Set took "
                    + time
                    + "ns ("
                    + millis
                    + "ms)"
            );
        time=System.nanoTime()-time;

        time=System.nanoTime();
        for (int j=0; j<=100000;j++){
            set2.add(j);
        }

        time = System.nanoTime() - time;
        millis = TimeUnit.NANOSECONDS.toMillis(time);
        IO.println(
             "Converting "
                    + set.size()
                    + " ints to String and inserting them in a Set took "
                    + time
                    + "ns ("
                    + millis
                    + "ms)"
            );

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */

       
        dim=set.size();
        time=System.nanoTime();

        for (int k=0; k<=1000; k++){
            set.get(dim);
        }
        time = System.nanoTime() - time;
        millis = TimeUnit.NANOSECONDS.toMillis(time);
        IO.println(
             "Converting "
                    + set.size()
                    + " ints to String and inserting them in a Set took "
                    + time
                    + "ns ("
                    + millis
                    + "ms)"
            );

        int dim2=set2.size();
        time=System.nanoTime();
        for (int k=0; k<=1000; k++){
            set2.get(dim2);
        }
        time = System.nanoTime() - time;
        millis = TimeUnit.NANOSECONDS.toMillis(time);
        IO.println(
             "Converting "
                    + set.size()
                    + " ints to String and inserting them in a Set took "
                    + time
                    + "ns ("
                    + millis
                    + "ms)"
            );

        final Map <String, Long > continents =new HashMap<>();
        
        continents.put("Africa", 1110635000L);
        continents.put("Americas", 972005000L);
        continents.put("Antartica", 0L);
        continents.put("Asia", 4298723000L);
        continents.put("Oceania", 38304000L);
        continents.put("Europe", 742452000L);

        long somma=0;
        for (final long value: continents.values()){
            somma+=value;
        }
        
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
