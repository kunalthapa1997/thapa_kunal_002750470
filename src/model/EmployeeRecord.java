/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class EmployeeRecord {
    
    private ArrayList<Employee> employee;
    public EmployeeRecord() {
        this.employee = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmpRecord() {
        return employee;
    }
    
    public void setHistory(ArrayList<Employee> employee) {
        this.employee = employee;
    }
    
    public Employee addNewRecords() {
        
        Employee newEmp = new  Employee();
        employee.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmployee(Employee emp) {
        employee.remove(emp);
    } 
}
