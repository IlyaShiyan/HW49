import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfIntegersEven = new ArrayList<>();
        List<Integer> listOfIntegersOdd = new ArrayList<>();
        listOfIntegersEven.add(5);
        listOfIntegersEven.add(7);
        listOfIntegersEven.add(8);
        listOfIntegersEven.add(4);
        listOfIntegersEven.add(3);

        for (Integer i: listOfIntegersEven) {
            if(i%2 != 0){
                listOfIntegersOdd.add(i);
            }
        }

        Iterator<Integer> listOfIntegersIterator = listOfIntegersEven.iterator();
        while (listOfIntegersIterator.hasNext()){
            Integer nextInteger = listOfIntegersIterator.next();
            if(nextInteger%2 != 0){
                listOfIntegersIterator.remove();
            }
        }

        System.out.println(listOfIntegersEven);
        System.out.println(listOfIntegersOdd);
    }
}
