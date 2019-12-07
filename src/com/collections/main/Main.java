package com.collections.main;

import com.collections.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // First array list
        List<Employee> empList1 = new ArrayList<Employee>();

        // using L suffix to tell compiler that the values are not int type but Long type
        empList1.add(new Employee("Srikanth", 20000000L, 1234L));
        empList1.add(new Employee("Prasanth", 10000000L, 1235L));
        empList1.add(new Employee("Henry", 12000000L, 12346L));
        empList1.add(new Employee("Kohli", 30000000L, 12347L));

        // Second array list
        List<Employee> empList2 = new ArrayList<Employee>();

        empList2.add(new Employee("Dravid", 22000000L, 12234L));

        // Observe here that salary is equal to Prasanth in list1
        empList2.add(new Employee("Tendulkar", 10000000L, 12235L));

        // Observe here that Henry from List1 and list2 are same except employeeID. Now these are equal objects
        empList2.add(new Employee("Henry", 12000000L, 122346L));

        empList2.add(new Employee("Arjun", 12000000L, 122346L));
        empList2.add(new Employee("Suravaram", 32200000L, 122347L));

        // check for equal employees in the lists

        // Iterate on list1
        for (Employee emp : empList1) {

            // check if list2 contains this emp fro list1

            // contains method works based on equals method in Employee class.
            // Try uncommenting hashcode, equals with salary only and
            // you should see that this program prints employees based on salary
            if (empList2.contains(emp)) {
                System.out.println(emp);
            }
        }

        System.out.println("End of Iteration");
    }
}
