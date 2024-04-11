import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args){
        long time1,time2;
        List<Employee> eList = new ArrayList<Employee>();
        for(int i =0; i<100;i++){
            eList.add(new Employee("John",20));
            eList.add(new Employee("Rohn",30));
            eList.add(new Employee("Tom",15));
            eList.add(new Employee("Bheem",8));
            eList.add(new Employee("Shiva",2));
            eList.add(new Employee("Krishna",50));
        }
        //Sequential processing
        time1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count = "+eList.stream().filter(e-> e.getSalary()>1).count());

        time2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken = "+(time2-time1) + "\n");

        //parallel processing
        time1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count = " + eList.parallelStream().filter(e-> e.getSalary()>1).count());

        time2  = System.currentTimeMillis();
        System.out.println("Time taken by parallel processing: "+(time2-time1));

//        Sequential Stream Count = 600
//        Sequential Stream Time Taken = 29
//
//        Parallel Stream Count = 600
//        Time taken by parallel processing: 11




    }
}
