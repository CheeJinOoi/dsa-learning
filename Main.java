// import java.util.LinkedList;
// import java.util.ArrayList;

// public class Main{
//     public static void main(String[] args){
//         LinkedList<Integer> linkedlist = new LinkedList<>();
//         ArrayList<Integer> arraylist = new ArrayList<>();

//         long startTime;
//         long endTime;
//         long elapsedTime;
        
//         for(int i = 0; i < 100000; i++){
//             linkedlist.add(i);
//             arraylist.add(i);
//         }
//         startTime = System.nanoTime();
//         linkedlist.remove(5000);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("LinkedList:\t" + elapsedTime + "ns");

//         startTime = System.nanoTime();
//         arraylist.remove(5000);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("ArrayList:\t" + elapsedTime + "ns");

//     }
// }