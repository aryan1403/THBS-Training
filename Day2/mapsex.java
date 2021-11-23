import java.util.HashMap;
import java.util.Map;

public class mapsex {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Aaryan", "123");
        map.put("Abhay", "12345679");
        map.put("Akash", "12345679");

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
