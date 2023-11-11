/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work01;
import work01.Utilitor;

public class Utilitor {
    public String testString(String value) {
        if (value == null) {throw new NullPointerException();}
        if (value.isBlank()) {throw new IllegalArgumentException();}
        return value;
    }
    
    public double testPositive(double value) {
     if (value < 0) {throw new IllegalArgumentException();}
     return value ;
    }
    
    public long computeIsbn10(long isbn10) {
        int count = (int) isbn10;
        int num = 1;
        int All = 0;
        int Plus = 0;
        while(count > 0) {
            int i = count % 10;
            count = count / 10;
            All = All + (i*num);
            num = num + 1;
        }
        return All%11;
    }
}
