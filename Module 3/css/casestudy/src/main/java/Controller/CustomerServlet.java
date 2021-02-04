package Controller;

import Model.Bean.Customer;
import Model.Repository.CustomerRepository;
import Model.Service.IService;
import Model.Service.impl.ServiceCustomer;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CustomerServlet" , urlPatterns = "/userCustomers")
public class CustomerServlet extends HttpServlet {

    private IService serviceCustomer = new ServiceCustomer();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
            switch (action) {
                case "create":
                    insertCustomer(request, response);
                    break;
                case "edit":
                        updateCustomer(request, response);
                    break;
                case "search":
                    searchCustomer(request, response);
                    break;
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                        deleteCustomer(request, response);
                    break;
                case "search":
                    searchCustomer(request,response);
                    break;
                default:
                    listCustomer(request, response);
                    break;
            }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = serviceCustomer.selectAllUsers();
        request.setAttribute("listCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            serviceCustomer.deleteUser(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Customer> listUser = serviceCustomer.selectAllUsers();
        request.setAttribute("listCustomer", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer editCustomer = serviceCustomer.selectUser(id);
        request.setAttribute("userCustomer", editCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        dispatcher.forward(request, response);
    }


    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String ngay_sinh = request.getParameter("ngay_sinh");
        String cmnd = request.getParameter("so_cmnd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");

        Customer customer = new Customer(id,name,ngay_sinh,cmnd,sdt,email,dia_chi);
        try {
            serviceCustomer.updateUser(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
        dispatcher.forward(request, response);
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String ngay_sinh = request.getParameter("ngay_sinh");
        String cmnd = request.getParameter("so_cmnd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String dia_chi = request.getParameter("dia_chi");
        Customer newUser = new Customer(name,ngay_sinh,cmnd,sdt,email,dia_chi);

        String message =  serviceCustomer.insertUser(newUser);

        if(!message.equals("OK")){
            request.setAttribute("message",message);
            request.getRequestDispatcher("create.jsp").forward(request,response);
        }else{
            listCustomer(request,response);
        }
    }


}
