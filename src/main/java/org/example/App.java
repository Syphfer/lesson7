package org.example;

import java.util.Scanner;

//String название = "текст";
//sout(название стринга) - отпечатать стринг;
//StringBuilder название = new StringBuilder(емкость); - изменяемая строка
//strBuilder.append(); - append = добавить. Работает с циклами
//== - сравнение ссылок
//sout(str.equals(str2)); - сравнение ссылок через метод equals
//system.out.printf(" %d "); - %d = число, %s = строка
// \n - перенос строки
// (amount)
//объекты могут ссылаться друг на друга
//Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
//1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
//(например, в миске 10 еды, а кот пытается покушать 15-20).
//2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
//удалось покушать (хватило еды), сытость = true.
//3. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//наполовину сыт (это сделано для упрощения логики программы).
//4. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
//потом вывести информацию о сытости котов в консоль.
//5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
public class App 
{        public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args )
    {
int action;
Cat[] cats = new Cat[3];
cats[0] = new Cat("Бублик", 5, false);
cats[1] = new Cat("Булочка", 7, false);
cats[2] = new Cat("Пирожок", 10, false);

Plate plate = new Plate(100);
plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].hungry == false && cats[i].appetite < plate.food){
                cats[i].eat(plate);
                cats[i].hungry = true;
                System.out.println(cats[i].name + " поел");
            } else {
                System.out.println(cats[i].name + " не поел");
            }
        }
        plate.info();
        System.out.println("Сколько еды ещё положить в тарелку?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}
