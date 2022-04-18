import java.util.HashMap;
import java.util.Map;

public class Graph {
    private static Object Integer;

    public static void main(String[] args) {
        HashMap<String,Integer>obj = new HashMap<>();

        obj.put("ABC",50);
        obj.put("ABC",90);
        obj.getOrDefault("abc",0);


        System.out.println(obj.get("ABC"));
        for (Map.Entry<String,Integer>res:obj.entrySet()) {
            System.out.println(res.getKey());
            System.out.println(res.getValue());

        }
        }
    }

