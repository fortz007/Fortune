package model;

import enums.Grade;
import enums.Role;

public class Main {
    public static void main(String[] args) {
Staff staff1= new Staff(123,"john",'M',"14262w32724",Role.MANAGER);
staff1.setName("Alex");
        System.out.println(staff1);
        Applicant applicant1 = new Applicant(1, "Faith", 'M', "Decagon", "Cashier", Grade.SECOND_CLASS_LOWER);
        System.out.println(applicant1.getGrade());
        Manager manager1 =  new Manager();
        System.out.println(manager1.hireCashier(applicant1));
        Product product1 = new Product(7, "CHiVita", 2);
        System.out.println(product1.getProductName());

  }
}
