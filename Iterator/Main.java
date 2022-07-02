package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        IteratorHash hash = new IteratorHash(10);

        hash.put("가","가");
        hash.put("가","가가");
        hash.put("나", "나");

        System.out.println(hash.get("가"));
        System.out.println(hash.get("나"));
        System.out.println(hash.get("다"));


    }

}
