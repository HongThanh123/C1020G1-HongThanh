package controllers;

import models.Person.Customer;
import models.Person.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class AgeComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getFullName().equals(o2.getFullName())) {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = f.parse(o1.getBirthDay());
                date2 = f.parse(o2.getBirthDay());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (date1.compareTo(date2) == 0) {
                return o1.getFullName().compareTo(o2.getFullName());
            } else {
                return date1.compareTo(date2);
            }
        }
        return o1.getFullName().compareTo(o2.getFullName());
    }
    }

