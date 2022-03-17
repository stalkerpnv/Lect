import java.util.Scanner;

class People {
    String name;
    int age;

    People(){
        name = "unknown";
        age = 20;
    }
    People(String name){
        this.name = name;
    }
    People(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name + " " + age);
    }
}

public class MyClass {
    static  Scanner sc;
    public  People[] fillArr(int size){
        Scanner sc = new Scanner(System.in);
        People []peoples = new People[size];
        for (int i = 0; i < peoples.length; i++) {
            peoples[i] = new People();
            System.out.println("name");
            peoples[i].name = sc.nextLine();
            System.out.println("age");
            peoples[i].age = sc.nextInt();
            sc.nextLine();
        }
        return peoples;
    }
    public static void main(String[] args) {
        // 1. if
        // 2. if else
        // 3. if else-if else
        int randomNum = (int)(Math.random()*10 +1);
        while (true) {
            System.out.println("Введите число");
            sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == randomNum) {
                System.out.println("Вы угадали");
                System.out.println("Игра закончена");
                break;
            } else {
                System.out.println("Вы не угадали");
                if (num < randomNum) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");
                }
            }
        }
        System.out.println("value");
        int value = sc.nextInt(); // 1 2 3
        switch (value){
            case 1:
            case 2:{
                System.out.println("case 1 and 2");
                break;
            }
            case 3:{
                System.out.println("case 3");
                break;
            }
            default:{
                System.out.println("error");
            }
        }
    }
}
