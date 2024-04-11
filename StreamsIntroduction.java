import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroduction {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(10));
        list.add(new Integer(20));
        list.add(new Integer(30));
        list.add(new Integer(40));
        list.add(new Integer(50));

        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(Integer i: list){
            if(i>30){
                newList.add(i);
            }
        }
        System.out.println(newList);

        //Streams
        List<Integer> l1 = list.stream().filter(x -> x>=30).collect(Collectors.toList());

        System.out.println(l1);
        //[30, 40, 50]

        //map
        List<Integer> l2 = list.stream().map(x-> x*2).collect(Collectors.toList());
        System.out.println(l2);
        //[20, 40, 60, 80, 100]

        //------------------------------------------------------------

        //count
        long cnt = list.stream().filter(i->i>=30).count();
        System.out.println(cnt);
        //3

        //-------------------------------------------------------------

        //Default natural sorting
        //custom sorting
        List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);
        //[10, 20, 30, 40, 50]

        //----------------------------------------------------------------------
        List<Integer> l4 = list.stream().sorted((m,n)-> n.compareTo(m)).collect(Collectors.toList());
        System.out.println(l4);
        //[50, 40, 30, 20, 10]

        //------------------------------------------------------------------------
        //forEach , min , max


    }
}
