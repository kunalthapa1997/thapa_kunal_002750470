/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
/**
 *
 * @author kunal
 */
public class Doctor {

    private ArrayList<DoctorAttributes> doctorDirectory;

//defining directories
    public ArrayList<DoctorAttributes> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<DoctorAttributes> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
 
//operation on patient
    public void addDoctor(DoctorAttributes d) {
        if(d!=null)
            this.doctorDirectory.add(d);
    }
    public boolean isDoctor(DoctorAttributes d){
        return doctorDirectory.contains(d);
    }

    public void deleteDoctor(DoctorAttributes d){
        this.doctorDirectory.remove(d);
    }
}


