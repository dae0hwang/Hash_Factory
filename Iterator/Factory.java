package Iterator;

public class Factory {

    public IteratorHash createHash(int size) {
        return new IteratorHash(size);
    }

}
