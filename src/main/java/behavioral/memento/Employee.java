package behavioral.memento;

//originator
public class Employee {

    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " : " + phone;
    }

    // Saves the Originator state to a new Memento instance
    public EmployeeMemento save(){
        return new EmployeeMemento(name, phone);
    }

    // Reverts the state from the Memento to the Originator
    public void revert(EmployeeMemento empMem){
        this.name = empMem.getName();
        this.phone = empMem.getPhone();
    }
}
