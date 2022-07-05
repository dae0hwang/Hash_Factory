package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//test
public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        IteratorHash hash1 = factory.createHash(10);

        hash1.put("가","가");
        hash1.put("가","가가");
        hash1.put("나", "나");

        System.out.println(hash1.get("가"));
        System.out.println(hash1.get("나"));
        System.out.println(hash1.get("다"));


    }

}
