package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String>values=new ArrayList<>();
        values.add("Scrum");
        values.add("Java");
        values.add("Jira");
        values.add("Selenium");
        values.add("Cucumber");
        values.add("Postman");
        values.add("Rest Assured");

        for(String value1 : values){
            System.out.println(value1);
        }
    }
}
