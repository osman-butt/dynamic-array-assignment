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
        if(size>0) {
            list[size-1] = null;
            --size;
        } else {
            throw new IndexOutOfBoundsException();
        }
        if(canShrink()) {
            shrink();
        }
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

    private boolean canShrink() {
        // Kun hvis arrayets .length er større end size
        // Og kun hvis forskellen er større end growsize
        // Og kun hvis .length minus growsize stadig er større end (eller lig med) INITIAL_SIZE
        return list.length-size > growSize && list.length-growSize >= INITIAL_SIZE;
    }

    private void shrink() {
        Person[] shortendList = new Person[list.length-growSize];
        for (int i=0; i<size;i++) {
            shortendList[i] = list[i];
        }
        list = shortendList;
    }
}
