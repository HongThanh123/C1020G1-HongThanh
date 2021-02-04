package Model.Repository;

import Model.Bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface IRepository {
    List<Customer> selectAllUsers();

    Customer selectUser(int id);

    void insertUser(Customer newUser);

    boolean updateUser(Customer book) throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    List<Customer> searchUser(String name);
}
