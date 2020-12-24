package bai_15_IO_Binary_File.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    public List<Product> readFromFile (List<Product> list){
//        try{
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("scr/bai_15_IO_Binary_File/bai_tap/product.io"));
//            Product product.io = null;
//            do{
//                product.io = (Product) ois.readObject();
//                System.out.println(product.io);
//            }while (product.io != null);
//
//        } catch (EOFException e) {
//            System.out.println("Hết file");
//        } catch ( ClassNotFoundException | IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//
//    }
    public static void main(String[] args)  {
        Product pr1 = new Product("Ao", 1, 12.5);
        Product pr2 = new Product("Quan", 2, 2.5);
        Product pr3 = new Product("But", 3, 1.5);
        Product pr4 = new Product("Cap", 4, 22.5);
        Product pr5 = new Product("Giay", 5, 13.5);
        List<Product> list = new ArrayList<>();
        list.add(pr1);
        list.add(pr2);
        list.add(pr3);
        list.add(pr4);
        list.add(pr5);
        try {
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("src/bai_15_IO_Binary_File/product.io"));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/bai_15_IO_Binary_File/product.io"));
            oos.writeObject(list);
            oos.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
