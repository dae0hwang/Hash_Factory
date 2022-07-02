package Factory_Hash;

public class Factory {

    public HashTable createHash(int size) {
        return new HashTable(size);
    }

}
