public class Main {
    public static void main(String[] args){
        Person harry = new Person("Harry Potter");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");
        Person draco = new Person("Draco Malfoy");
        Person snape = new Person("Severus Snape");
        DynamicArray myArr = new DynamicArray();
        myArr.add(harry);
        myArr.add(ron);
        myArr.add(hermione);
        myArr.add(draco);

        // myArr.remove();
        // myArr.remove(4);
        // myArr.clear();
        // myArr.get(0);
        myArr.set(4,snape);
        for (int i = 0; i<myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }
    }
}
