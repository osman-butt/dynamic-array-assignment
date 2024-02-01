public class DynamicArray {
    
    private final int INITIAL_SIZE = 10;
    private Person[] list;
    public int size;

    public DynamicArray() {
        list = new Person[INITIAL_SIZE];
        size = 0;
    }

    public void add(Person newPerson) {
        list[size] = newPerson;
        ++size;
    }

    public int size() {
        return size;
    }

    public void remove() {
        list[size-1] = null;
        --size;
    }

    public void remove(int index) {
        if (index>=0 && index < size) {
            for (int i = index; i<size-1; i++) {
                list[i] = list[i+1];
            }
            remove();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void clear() {
        size = 0;
        list = new Person[INITIAL_SIZE];
    }

    public String get(int index) {
        if(index>=0 && index < size) {
            return list[index].getName();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(int index, Person newPerson) {
        list[index] = newPerson;

        // JavaScript behaviour:
        // Make everything between i = size-1 up until i = index-1 null
        // if(index>=size) {
        //     for (int i = size; i<index; i++) {
        //         list[i] = new Person(null);
        //     }
        //     size = index+1;
        // }

        if(index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            ++size;
        }
    }
}
