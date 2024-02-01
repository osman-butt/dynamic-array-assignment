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
        myArr.add(draco);
        myArr.add(hermione);
        myArr.remove();
        myArr.remove(1);
        myArr.set(0,snape);
        // myArr.clear();
        for (int i = 0; i<myArr.size(); i++) {
            System.out.println(myArr.get(i));
        }
    }
}
