/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Dominic
 */
public abstract class CareProvider {
    
    private Patient patients[] = new Patient[100];
    public int noPatients = 0;
    
    public void addPacient(Patient p){
        patients[noPatients++]=p;
    }

    
    
    
    public String getOldestPatient(){
        int max = Integer.MIN_VALUE;
        String nume="";
        for(int i = 0;i<noPatients;i++){
            if (max < patients[i].getAge()){
                max = patients[i].getAge();
            }
        }
        for(int i = 0;i<noPatients;i++){
            if(max == patients[i].getAge()){
                nume = patients[i].getName();
            }
        }
        return nume;
    }

    public int getNoPatients() {
        return noPatients;
    }
    
    
    
    
    
    public abstract double computeSalary();
    
    
    
}
