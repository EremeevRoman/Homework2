public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }

}

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        var totalWeight = weightFirst + weightSecond;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var weightDifference = weightFirst - weightSecond;
        System.out.println("Разница между весами бойцов " + Math.abs(weightDifference) + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        var weightDifference1 = weightSecond - weightFirst;
        System.out.println(weightDifference1 + " кг");
        var weightDifference2 = (weightFirst + weightSecond) % weightFirst;
        System.out.println(weightDifference2 + " кг");

    }

    public static void task8() {
        System.out.println("Задача 8");
        var allTime = 640;
        var workTime = 8;
        var people = allTime / workTime;
        System.out.println("Всего работников в компании — " + people + " человек");
        var newPeople = people + 94;
        var newTime = allTime / newPeople;
        System.out.println("Если в компании работает " + newPeople + " человека, то всего " + newTime + " часа работы может быть поделено между сотрудниками");


    }
}