public class Main {
    public static void main(String[] args){
        Tree drzewo = new Tree();
        drzewo.add(4,200.0);
        drzewo.add(1,300);
        drzewo.add(0,64);
        drzewo.add(3,640);
        drzewo.add(2,334);
        drzewo.add(7,520);
        drzewo.add(5,400);
        drzewo.add(6,600);

        drzewo.printFormated();

        System.out.println("Element numer 1:" + drzewo.get(1));
        System.out.println("Element numer 4:" + drzewo.get(4));
        System.out.println("Element numer 2:" + drzewo.get(2));
        System.out.println("Element numer 6:" + drzewo.get(6));


    }
}
