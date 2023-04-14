package test;

public class Triangle {
    static double area;
    int b=2;
    int h=3;
    public static void main(String[] args){
        double p = 0;
        double b = 0;
        double h = 0;
        if (area==0){
            b=3;
            h=4;
            p=0.5;
        }
        area = p * b * h;
        System.out.println("Area is "+area);
    }
}
