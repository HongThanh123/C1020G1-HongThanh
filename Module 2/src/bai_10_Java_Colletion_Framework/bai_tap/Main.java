package bai_10_Java_Colletion_Framework.bai_tap;

public class Main {
    public static void main(String[] args) {
        ProductManagerByArrayList list = new ProductManagerByArrayList();
        Product p1 = new Product("Sách", 11,10);
        Product p2 = new Product("Bút", 12,11);
        Product p4 = new Product("Giày", 14,13);
        Product p3 = new Product("Balo", 13,12);
        Product p5 = new Product("Áo", 15,15);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        list.display();
//        System.out.println("-------------------");
//        list.delete(13);
//        list.display();
        System.out.println("-------------------");
//        list.search(16);
//        list.edit(11);

//        list.sortByUp();
        list.sortByDown();
        list.display();



    }
}
