public class Main {
    public static void main(String[] args) {

    //task 1
    System.out.println("Задача 1");
    int dogsCount=0;
    byte catsCount=1;
    short mousesCount=10;
    long ratsCount=5_000_000L;
    float medicine=2.2F;
    double water=1.5;
    System.out.println("Значение переменной dogsCount с типом int равно "+dogsCount);
    System.out.println("Значение переменной catsCount типом byte равно "+catsCount);
    System.out.println("Значение переменной mousesCount с типом short равно "+mousesCount);
    System.out.println("Значение переменной ratsCount с типом long равно "+ratsCount);
    System.out.println("Значение переменной medicine с типом float равно "+medicine);
    System.out.println("Значение переменной water с типом double равно "+water);

    //task 2
    double a=2.4;
    long b=987_678_965_549L;
    float c=2.786F;
    boolean e=false;
    char f=569;
    short g=-159;
    int h=27897;
    byte i=67;

    //task 3
    System.out.println("Задача 3");
    byte firstClass=23;//количество учеников Людмилы Павловны
    byte seсondClass=27;//количество учеников Анны Сергеевны
    byte thirdClass=30;//количество учеников Екатерины Андреевны
    short allSheetsCount=480;
    int allClass=firstClass+seсondClass+thirdClass;
    System.out.println("На каждого ученика рассчитано "+allSheetsCount/allClass+" листов бумаги");
    }
}