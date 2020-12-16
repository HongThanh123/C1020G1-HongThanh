package bai_10_Java_Colletion_Framework.bai_tap;

import java.util.*;

public class ProductManagerByArrayList {

    private List<Product> list = new ArrayList<>();

    private int id;
    Product p = getProductById(id);
    public void add(Product p) {
        list.add(p);
    }

    public void edit(int id) {
//        Product p  = getProductById(id);
        if (p == null){
            System.out.println("not found");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá : ");
        double gia = scanner.nextDouble();

        p.setName(name);
        p.setPrice(gia);

    }

    public void delete(int id) {
//        Product p = getProductById(id);

        if (p == null){
            System.out.println("Not found");
            return;
        }

        list.remove(p);
    }

    private Product getProductById(int id){
        for (Product p : list){
            if (id == p.getId()){
                return p;
            }
        }

        return null;
    }

    public void display() {
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public void search(int id) {
//        Product p = getProductById(id);
        if (p == null){
            System.out.println("Not found");
            return;
        }
        System.out.println(p);

    }

       public void sortByUp(){
        Collections.sort(list, new SortByUp());
    }

    public void sortByDown(){
        Collections.sort(list, new SortByDown());
    }






}
