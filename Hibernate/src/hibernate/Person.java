/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 *
 * @author Nimesha
 */
public class Person {

    private int personid;
    private String name;
    private int age;
    private Set hats;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }
// Generate Getters and Setters for the above
// Properties

    public Person() {
        hats = new HashSet();
    }
// Getters and Setters
    public void addHat(Hat hat) {
        this.hats.add(hat);


    }

    public void removeHat(Hat hat) {
        this.hats.remove(hat);
    }

    public Set getHats() {
        return hats;
    }

    public void setHats(Set hats) {
        this.hats = hats;
    }
@Override
    public String toString() {
        String personString = "Person: " + getPersonid()
                + " Name: " + getName()
                + " Age: " + getAge();
        String hatString = "";
        for (Iterator iter = hats.iterator(); iter.hasNext();) {
            Hat hat = (Hat) iter.next();
            hatString = hatString + "\t\t" + hat.toString() + "\n";
        }
        return personString + "\n" + hatString;
    }
}
