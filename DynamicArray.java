public class DynamicArray {
    
    private final int INITIAL_SIZE = 10;
    private Person[] list;
    private int size;
    private int growSize = 10;

    public DynamicArray() {
        list = new Person[INITIAL_SIZE];
        size = 0;
    }

    public void add(Person newPerson) {
        if(size+1 > list.length) {
            grow();
        }
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
        if(index>=0 && index < size) {
            list[index] = newPerson;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private void grow() {
        Person[] extendedList = new Person[list.length+growSize];
        for (int i=0; i<size;i++) {
            extendedList[i] = list[i];
        }
        list = extendedList;
    }
}
