package maps;

import java.util.Collection;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("db.name", "cars");
        map.put("db.user.name", "user1");
        map.put("key1", "value1");
        map.put("key2", "value2");


        // cos tu robie


        System.out.println(map.get("db.name"));

        map.remove("db.name");

        System.out.println(map.size());

        Collection<String> wartosci = map.values();

        /*System.out.println(wartosci);

        int i = 0;
        while (i<wartosci.size()) {
            //cos tu robimy

            i++;
        }*/

        for(String value : wartosci) {
            System.out.println("TEST: " + value);
        }
    }
}
