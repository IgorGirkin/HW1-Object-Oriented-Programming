import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Human maksim = new Human(1988, "Максим", "Минск","Бренд-менеджер");
        Human anna = new Human(1993, "Аня", "Москва","Методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград","Продакт-менеджер");
        Human artem = new Human(1999,null, "Москва","Директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", "Сейчас нигде не работаю", 21);
        maksim.setYearOfBirth(-25);
        System.out.println(artem);
        System.out.println(katya);
        System.out.println(anna);
        System.out.println(maksim);
        System.out.println(vladimir);


        //ООП. Урок 2 (инкапсуляция) Домашнее задание 1 Задание 2 "Создайте новый класс flower."

        Flower rose = new Flower("", "Голландия", 35.59,3,"Роза");
        Flower chrysanthemum = new Flower("", "", 15.0, 5,"Хризантема");
        Flower pion = new Flower("", "Англия", 69.9, 1,"Пион");
        Flower gypsophila = new Flower("", "Турция", 19.50, 10,"Гипсофила");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        rose.setFlowerColor("  ");
//        chrysanthemum.setFlowerColor(null);
//        chrysanthemum.setCountry("");
//        pion.setFlowerColor("    "+"   ");
//        pion.setCost(-25);
//        gypsophila.setFlowerColor("желтый");
//        gypsophila.setCountry("     ");
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose).addFlower(rose).addFlower(rose).addFlower(gypsophila).addFlower(chrysanthemum).
        addFlower(chrysanthemum).addFlower(chrysanthemum).addFlower(chrysanthemum).addFlower(chrysanthemum);
        System.out.println(bouquet.getCost());
        System.out.println(bouquet.getLifeSpan());





    }
}