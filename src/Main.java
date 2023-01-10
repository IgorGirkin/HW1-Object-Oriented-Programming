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


    }
}