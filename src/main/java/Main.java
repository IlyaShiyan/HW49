import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        List<Integer> listOfIntegersOdd = new ArrayList<>();
        List<Integer> listOfIntegersEven = new ArrayList<>();
        listOfIntegers.add(5);
        listOfIntegers.add(7);
        listOfIntegers.add(8);
        listOfIntegers.add(4);
        listOfIntegers.add(3);

        for (Integer i: listOfIntegers) {
            if(i%2 != 0)
                listOfIntegersOdd.add(i);
            else
                listOfIntegersEven.add(i);
        }

        System.out.println(listOfIntegersEven);
        System.out.println(listOfIntegersOdd);

        if (listOfIntegersEven.size()>listOfIntegersOdd.size())
            System.out.println("The list of even numbers is greater than the list of odd numbers");
        else
            System.out.println("The list of odd numbers is greater than the list of even numbers");
    }
}
