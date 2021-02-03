package Repository;

import Model.UserCustomer;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepositoryCustomer {
  List<UserCustomer> selectAllUsers();

   UserCustomer selectUser(int id);

   void insertUser(UserCustomer newUser);

   boolean updateUser(UserCustomer book) throws SQLException;

    boolean deleteUser(int id) throws SQLException;

    List<UserCustomer> searchUser(String dia_chi);
}
