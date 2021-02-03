package Repository;

import Model.UserCustomer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryCustomer implements IUserRepositoryCustomer {
    private static final String SELECT_ALL_CUSTOMER = "select * from khach_hang order by ho_ten";
    private static final String SELECT_EDIT_BY_CUSTOMER = "select ho_ten,ngay_sinh,so_cmtnd,sdt,email,dia_chi from khach_hang where id_khach_hang =?";
    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO khach_hang" + "  (ho_ten,ngay_sinh,so_cmtnd,sdt,email, dia_chi) VALUES " +
            " (?, ?, ? ,? ,? ,?);";
    private static final String UPDATE_CUSTOMER_SQL = "update khach_hang set ho_ten = ?,ngay_sinh= ?,so_cmtnd= ?,sdt= ?,email= ?, dia_chi =? where id_khach_hang = ?;" ;
    private static final String DELETE_CUSTOMER_SQL = "delete from khach_hang where id_khach_hang = ?;" ;
    private static final String SEARCH_CUSTOMER_SQL = "select id,`name`, email, dia_chi " +
            "from khach_hang " + "where dia_chi = ?";
    ;
    private String jdbcURL = "jdbc:mysql://localhost:3306/case_study?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "0347237427";

    public UserRepositoryCustomer() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<UserCustomer> selectAllUsers() {
        List<UserCustomer> userCustomerList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_khach_hang");
                String name = rs.getString("ho_ten");
                String ngaySinh = rs.getString("ngay_sinh");
                String so_cmnd = rs.getString("so_cmtnd");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String dia_chi = rs.getString("dia_chi");
                userCustomerList.add(new UserCustomer(id, name, ngaySinh, so_cmnd, sdt, email, dia_chi));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userCustomerList;
    }

    @Override
    public UserCustomer selectUser(int id) {
        UserCustomer userCustomer = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EDIT_BY_CUSTOMER);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("ho_ten");
                String ngaySinh = rs.getString("ngay_sinh");
                String so_cmnd = rs.getString("so_cmtnd");
                String sdt = rs.getString("sdt");
                String email = rs.getString("email");
                String dia_chi = rs.getString("dia_chi");
                userCustomer = (new UserCustomer(id, name, ngaySinh, so_cmnd, sdt, email, dia_chi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userCustomer;
    }

    @Override
    public void insertUser(UserCustomer newUser) {
        System.out.println(INSERT_CUSTOMER_SQL);
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            preparedStatement.setString(1, newUser.getName());
            preparedStatement.setString(2, newUser.getNgay_sinh());
            preparedStatement.setString(3, newUser.getCmnd());
            preparedStatement.setString(4, newUser.getSdt());
            preparedStatement.setString(5, newUser.getEmail());
            preparedStatement.setString(6, newUser.getDia_chi());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException e) {
    }

    @Override
    public boolean updateUser(UserCustomer userCustomer) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_SQL);) {
            statement.setString(1, userCustomer.getName());
            statement.setString(2, userCustomer.getNgay_sinh());
            statement.setString(3, userCustomer.getCmnd());
            statement.setString(4, userCustomer.getSdt());
            statement.setString(5, userCustomer.getEmail());
            statement.setString(6, userCustomer.getDia_chi());
            statement.setInt(7, userCustomer.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public List<UserCustomer> searchUser(String dia_chi) {
        List<UserCustomer> userCustomers = new ArrayList<>();
        UserCustomer userCustomeruser =null;
        try{
            PreparedStatement preparedStatement = this.getConnection().prepareStatement(SEARCH_CUSTOMER_SQL);
            preparedStatement.setString(1,dia_chi);

            ResultSet resultSet =  preparedStatement.executeQuery();

            while (resultSet.next()){
                userCustomeruser = new UserCustomer();
                userCustomeruser.setId(Integer.parseInt(resultSet.getString("id")));
                userCustomeruser.setName(resultSet.getString("name"));
                userCustomeruser.setEmail(resultSet.getString("email"));
                userCustomeruser.setDia_chi(resultSet.getString("country"));

                userCustomers.add(userCustomeruser);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userCustomers;
    }
}