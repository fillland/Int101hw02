/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work02;
import java.util.Objects;
import work01.Utilitor;

/**
 *
 * @author User
 */
public class Person {
    private static int NextId= 1;
    private final int Id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        Utilitor P = new Utilitor();
        try{
        P.testString(firstname);
        P.testString(lastname);
        }catch (Exception e) {}
           this.Id = NextId;
           NextId++;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person(");
        sb.append("Id=").append(Id);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(')');
        return sb.toString();
    }

    public int getId() {
        return Id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        Utilitor SF = new Utilitor();
        SF.testString(firstname);
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        Utilitor SF = new Utilitor();
        SF.testString(lastname);
        this.lastname = lastname;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else return false;
    }

    
    
    
}

