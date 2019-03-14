package behavioral.memento;

import java.util.Stack;

//caretaker
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp){
        employeeHistory.push(emp.save());   // returns an instance of the Memento and saves to the Stack
    }

    public void revert(Employee emp){
        emp.revert(employeeHistory.pop());
    }
}
