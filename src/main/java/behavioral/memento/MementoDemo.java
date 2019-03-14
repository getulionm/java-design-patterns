package behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();

        emp.setName("John Wick");
        emp.setAddress("111 Main Street");
        emp.setPhone("555-888-7777");

        System.out.println("Employee before save:                     " + emp);

        caretaker.save(emp);

        emp.setPhone("111-111-1111");

        caretaker.save(emp);

        System.out.println("Employee after changed phone number save: " + emp);

        emp.setPhone("666-666-6666"); // <--------------------- Not saving this

        caretaker.revert(emp);

        System.out.println("Reverts to last save:                     " + emp);

        caretaker.revert(emp);

        System.out.println("Reverts to original:                      " + emp);

    }
}
