/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kunal
 */
public class DoctorAttributes {

    private String name;
    private int age;
    private int id;
    private String gender;
    private Resident residence;
    private static int count =0;

    @Override
    public String toString() {
        return name;
    }
    
    public DoctorAttributes() {
        count++;
        this.id = count;
    }
    
     public DoctorAttributes(String name, int age, String gender, Resident residence) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.residence = residence;
    }
    
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Resident getResidence() {
        return residence;
    }

    public void setResidence(Resident residence) {
        this.residence = residence;
    }
}
