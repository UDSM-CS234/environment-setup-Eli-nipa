package Pencil;

class PencilItem {

   // colour, length, and price.

    String color ;
    int length ;
    double price ;

    PencilItem(String color,int length , double price){
        this.color =color ;
        this.length = length;
        this.price = price ;

    }

    void display(){
        System.out.println("A pencil color is"+"  "+color);
        System.out.println("A pencil length"+"  "+length);
        System.out.println("A pencil price is"+"  "+price);
    }

}


public  class Pencil{

    public static void main(String[] args) {

        PencilItem penseli1 = new PencilItem("blue",12,1500.00);

        penseli1.display();



    }



}






