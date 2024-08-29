package JSON_Jackson;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class JacksonToJavaObject {

    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setId(1);
        emp.setfName("Rahul");
        emp.setlName("Bist");
        emp.getTech().add("Java");
        emp.getTech().add("Selenium");
        emp.getTech().add("API");

        ObjectMapper obj = new ObjectMapper();
        try {
            String jac = obj.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
            System.out.println(jac);

            Employee emp2 = obj.readValue(jac, Employee.class);
            System.out.println(emp2.getId()+" "+emp.getfName()+" "+emp.getlName()+" "+emp.getTech());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }



    }
}
