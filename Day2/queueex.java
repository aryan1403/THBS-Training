import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queueex {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Aaryan"); // 0
        q.offer("Abhay"); // 1
        q.offer("Akash"); // 2
        q.offer("Shekhar"); // 3

        q.poll();

        // q.stream().forEach(System.out::println);

        Iterator<String> it = q.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // q.forEach(System.out::println);


    }
}
