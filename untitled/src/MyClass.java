import java.util.HashMap;
import java.util.Map;


public class MyClass {

    private Map<String, Integer> map;

    public MyClass() {
        map = new HashMap<>(); q
        map.put("foo", 1);
        map.put("bar", 3);
    }

    public int getValue(String input, int numRetries) throws Exception {
        try {
            return map.get(input);
        }
        catch (Exception e) {
            if (numRetries > 3) {
                throw e;
            }
            return getValue(input, numRetries + 1);
        }
    }

    public static void main(String[] args)throws Exception {
        System.out.println("Hello World");
        MyClass m = new MyClass();
        int x = m.getValue("fsoo",0);
        System.out.println(x);
    }
}