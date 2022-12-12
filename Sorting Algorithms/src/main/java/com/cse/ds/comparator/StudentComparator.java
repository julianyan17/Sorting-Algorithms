package com.cse.ds.comparator;

import com.cse.ds.Comparator;
import com.cse.ds.models.Student;
import java.util.*;


/**
 * Author: Julian Wai San Yan 
 * Date: 4/24/19
 * File: StudentComparator.java 
 *
 * This file includes a class that implements the Comparator interface to 
 * compare Students based on their CGPA.
 */

/**
 * This class implements the Comparator interface in order to compare Students 
 * based on their CGPA. This class includes a override of the comparison 
 * method from the Comparator interface. 
 */

public class StudentComparator implements Comparator<Student> {

    /**
     * Compares two Students based on their CGPA 
     *
     * @param x         first Student to compare
     * @param y         second Student to compare
     * @param ascending the order of Student to follow
     * @return          whether the Student are in proper order
     */

	@Override
	public boolean comparison(Student x, Student y, boolean ascending) 
        throws NullPointerException {
        
        // if Student objects are null or if CGPA of Student objects are null
        if(x == null || y == null 
                || x.getCGPA() == null || y.getCGPA() == null) {
            throw new NullPointerException();
        }

        // if ascending is true
        if(ascending == true) {
            // if x's CGPa is less than y's CGPA, return true
            if(x.getCGPA() < y.getCGPA()) {
                return true;
            }

            // if x's CGPA is equal to y's CGPA AND x's PID is less than y's
            // PID, return true
            else if(x.getCGPA() == y.getCGPA()) {
                
                // if PID is null, throw NullPointer
                if(x.getPID() == null || y.getPID() == null) {
                    throw new NullPointerException();
                }
                
                if(Integer.parseInt(x.getPID()) 
                        < Integer.parseInt(y.getPID())) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }

        // if ascending is false
        if(ascending == false) {
            // if x's CGPa is less than y's CGPA, return true          
            if(x.getCGPA() > y.getCGPA()) {
                return true;
            }
            
            // if x's CGPA is equal to y's CGPA AND x's PID is greater than y's
            // PID, return true            
            else if(x.getCGPA() == y.getCGPA()) {
                
                // if PID is null, throw NullPointer
                if(x.getPID() == null || y.getPID() == null) {
                    throw new NullPointerException();
                }
                
                if(Integer.parseInt(x.getPID()) 
                        > Integer.parseInt(y.getPID())) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
		return false;
	}
}
