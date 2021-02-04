package Model.Service.impl;

import Model.Bean.Customer;
import Model.Repository.CustomerRepository;
import Model.Service.IService;
import Model.Repository.IRepository;
import Model.Service.Validate.CustomerValidator;

import java.sql.SQLException;
import java.util.List;

public class ServiceCustomer implements IService {
    private  IRepository reposCustomer = new CustomerRepository();

    @Override
    public List<Customer> selectAllUsers() {
        return reposCustomer.selectAllUsers();
    }

    @Override
    public Customer selectUser(int id) {
        return reposCustomer.selectUser(id);
    }

    @Override
    public String insertUser(Customer customer) {
        String result = validateInput(customer);

        if(result.equals("OK"))
            reposCustomer.insertUser(customer);

        return result;

    }

    @Override
    public boolean updateUser(Customer customer) throws SQLException {
        return reposCustomer.updateUser(customer);
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return reposCustomer.deleteUser(id);
    }

    @Override
    public List<Customer> searchUser(String dia_chi) {
        return reposCustomer.searchUser(dia_chi);
    }

    private String validateInput(Customer customer){
        if(!CustomerValidator.validateName(customer.getName()))
            return "Name is not valid !";

        if(!CustomerValidator.validatePhone(customer.getSdt()))
            return "Phone is not valid !";

        if(!CustomerValidator.validateEmail(customer.getEmail()))
            return "Email is not valid !";

        if(!CustomerValidator.validateIdCard(customer.getCmnd()))
            return "ID Card is not valid !";

        return "OK";
    }
}
