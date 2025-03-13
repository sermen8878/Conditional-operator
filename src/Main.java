public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 20; // Пример возраста
        System.out.println("Задача 1:");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();

        // Задача 2
        int temperature = 4; // Пример температуры
        System.out.println("Задача 2:");
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println();

        // Задача 3
        int speed = 70; // Пример скорости
        System.out.println("Задача 3:");
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println();

        // Задача 4
        int personAge = 10; // Пример возраста
        System.out.println("Задача 4:");
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете.");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу.");
        }
        System.out.println();

        // Задача 5
        int childAge = 12; // Пример возраста ребенка
        boolean isAdultPresent = true; // Пример наличия взрослого
        System.out.println("Задача 5:");
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14) {
            if (isAdultPresent) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println();

        // Задача 6
        int totalSeats = 60; // Сидячие места
        int totalCapacity = 102; // Общая вместимость
        int passengers = 95; // Пример количества пассажиров
        System.out.println("Задача 6:");
        if (passengers < totalSeats) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (passengers < totalCapacity) {
            System.out.println("В вагоне есть только стоячие места.");
        } else {
            System.out.println("Вагон полностью забит.");
        }
        System.out.println();

        // Задача 7
        int one = 10;
        int two = 20;
        int three = 15;
        System.out.println("Задача 7:");
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}