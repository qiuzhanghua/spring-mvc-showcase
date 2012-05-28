package org.springframework.samples.mvc.form;
 
import java.util.Arrays;
import java.util.List;
 
public enum Gender {
    Male("Male"), Female("Female");
 
    final String value;
 
    Gender(String value) {
        this.value = value;
    }
 
    public String getKey() {
        return name();
    }
 
    public String getValue() {
        return value;
    }
 
    public static List<Gender> list() {
        return Arrays.asList(values());
    }
}