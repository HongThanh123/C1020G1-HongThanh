package Model.Service;

import Model.Bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface IService {
    List<Customer> selectAllUsers();

    Customer selectUser(int id);

    String insertUser(Customer newUser);

    boolean updateUser(Customer book) throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    List<Customer> searchUser(String dia_chi);
}
