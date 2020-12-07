package bai_3_Class_And_Object.bai_tap;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {

    }

    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Discriminant(){
        double delta = this.b * this.b - 4*this.a*this.c;
        double r1 ;
        double r2 ;
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if (delta == 0){
            r1 = -this.b/2*this.a;
            System.out.println("Phương trình có 1 nghiệm r1 = " + r1);
        }else {
            r1 = ((-this.b) + Math.sqrt(delta)) / (2*this.a);
            r2 = ((-this.b) - Math.sqrt(delta)) / (2*this.a);
            System.out.println("Phương trình có 2 nghiệm: \nr1 = " + r1 + "\nr2 =" + r2 );
        }


    }


}
