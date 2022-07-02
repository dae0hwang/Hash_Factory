package Factory_Hash;

public class Main {

    public static void main(String[] args) {
        //테스트
        Factory factory = new Factory();
        HashTable hashTable = factory.createHash(10);

        hashTable.put("가", "가");
        hashTable.put("나", "니");
        hashTable.put("다", "다");
        hashTable.put("가", "가가가");

        System.out.println(hashTable.get("가"));
        System.out.println(hashTable.get("나"));
        System.out.println(hashTable.get("다"));
        System.out.println(hashTable.get("라"));
    }

}
