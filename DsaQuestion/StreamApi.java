import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;


public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90,100 ,11,21,31,41,51,61,71,81,91,01);
        //print even
        List<Integer> even = numbers.stream().filter(i -> i % 2==0).collect(toList());
        System.out.println(even);

        //print primeNumber
        List<Integer> prime = numbers.stream().filter( val->{
            if(val<1);
            if(val==1 || val==2 || val==3)return true;
            for(int i=2;i<=Math.sqrt(val);i++){
                if(val%i==0)return false;
            }
            return true;
        }).toList();
        System.out.println(prime);

        //find Max
        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);
        int MaxVal=numbers.stream().reduce(Integer.MIN_VALUE ,(a,b)->a > b ? a : b);
        System.out.println(MaxVal);

        //findDistinct
        List<Integer> disticnt = numbers.stream().distinct().collect(toList());
        System.out.println(disticnt);

        // print reverse
        List<Integer> reverse = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);

        //find x
        int x =20;
        int val=numbers.stream().reduce(x,(a,b)->a == b ? a : b);
        System.out.println(val);


        

        List<Integer> list1 = new ArrayList<>();  // 1st method//
        list1.add(25);
        list1.add(30);
        list1.add(45);
        list1.add(50);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(20, 45, 30, 60, 80, 195, 200, 100); //2nd method
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();  // 3rd method
        for (Integer i : list2) {
            if (i % 2 == 0) list3.add(i);
        }
        System.out.println(list3);
        ////////////////////////////////----------------/////////////////////////////////////////////////

        // Using StreamApi
        // 1st method
        Stream<Integer> stream = list2.stream();
        List<Integer> list4 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list4);

        // 2nd method
        List<Integer> list5 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list5);

        int[] arr = {2, 5, 7, 8};
        List<Integer> list6 = Arrays.stream(arr).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(list6);

    }
}


//In programming, a collection and a stream are both data structures or concepts used to handle groups of data elements. However, there are some key differences between them:
//Mutability: Collections are typically mutable, meaning you can modify, add, or remove elements from them after they are created. Streams, on the other hand, are often immutable or have limited mutability. Once a stream is created, you cannot modify its content directly. Instead, you apply operations on the stream to produce a new stream or a result.
//Eager vs. Lazy Evaluation: Collections usually perform eager evaluation, which means the elements are computed and stored in memory as soon as the collection is created. In contrast, streams usually follow lazy evaluation, where elements are computed and processed on-demand. Lazy evaluation can be more efficient for large data sets or when you only need to process a subset of the elements.
//Memory Usage: Collections store all their elements in memory, which can be a limitation when dealing with large data sets. Streams, on the other hand, can be more memory-efficient since they process elements one by one and don't need to store the entire data set in memory at once.
//Iteration: Collections provide random access to their elements, meaning you can access any element directly by its index. Streams, however, are typically processed sequentially, and you can only access the current element being processed. This sequential processing allows for efficient processing of large data sets or infinite streams.
//Intermediate Operations: Streams often provide a rich set of intermediate operations that can be applied to transform or filter the elements. These operations are typically chainable and allow for a declarative style of programming. Collections may also provide similar operations, but they are often performed eagerly and modify the collection directly.
//Terminal Operations: Both collections and streams provide terminal operations that produce a result or a side effect. However, in streams, terminal operations trigger the processing of elements and produce a new stream or a result without modifying the original stream. In collections, terminal operations can modify the collection directly.
//Overall, collections are typically used when you need random access and mutable data structures, while streams are useful for processing large or infinite data sets, performing transformation operations, and taking advantage of lazy evaluation. Streams promote functional programming paradigms and can often lead to more readable and efficient code when used appropriately.