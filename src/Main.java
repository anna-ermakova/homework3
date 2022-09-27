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

    //task 4
    System.out.println("Задача 4");
    int bottleСount=16;//productivity in 2 minutes
    bottleСount=bottleСount/2;
    System.out.println("Производительность машины за 1 мин-"+bottleСount+" бутылок");
    byte twentyMinutes=20;
    System.out.println( "За "+twentyMinutes+" минут машина произвела бутылок "+bottleСount*twentyMinutes+" штук");
    short perDay=60*24;
    System.out.println( "За "+perDay+" минут машина произвела бутылок "+bottleСount*perDay+" штук");
    int threeDays=perDay*3;
    System.out.println("За "+threeDays+" минут машина произвела бутылок "+bottleСount*threeDays+" штук");
    int oneMonth=perDay*30;
    System.out.println("За "+oneMonth+" минут машина произвела бутылок "+bottleСount*oneMonth+" штук");

    //task 5
    System.out.println("Задача 5");
    int totalCans=120;
    byte perClassWiteCans=2;
    byte perClassBownCans=4;
    int totalClasses=totalCans/(perClassWiteCans+perClassBownCans);
    int totalWiteCans=totalClasses*perClassWiteCans;
    int totalClassBownCans=totalClasses*perClassBownCans;
    System.out.println("В школе, где "+totalClasses+ " классов, нужно "+totalWiteCans+" банок белой краски и "+totalClassBownCans+" банок коричневой краски");

    //task 6
    System.out.println("Задача 6");
    //ингридиенты завтрака
    short bananasCount=5;
    short oneBananaWeight=80;//gr
    short milkVolume=2;// по 100 мл
    short onehundredMlMilkWeight=105;//gr
    short icecreamCount=2;//брикета пломбира
    short oneIcecreamWeight=100;//gr
    short eggsCount=4;
    short oneEggWeight=70;//gr
    int totalBananasWeight=bananasCount*oneBananaWeight;
    int totalMilkWeight=milkVolume*onehundredMlMilkWeight;
    int totalIcecreamWeight=icecreamCount*oneIcecreamWeight;
    int totalEggsWeight=eggsCount*oneEggWeight;
    int totalBreakfastWeight=totalEggsWeight+totalBananasWeight+totalIcecreamWeight+totalMilkWeight;
    float totalBreakfastWeightInKg=totalBreakfastWeight/1000F;
    System.out.println("Вес такого спорт-завтрака равен "+totalBreakfastWeightInKg+" кг!");

    //task 7
    System.out.println("Задача 7");
    byte needToLoseWeight=7;//kg
    int needToLoseWeightGr=needToLoseWeight*1000;//gr
    int weightLossPerDayVar1=250;//gr
    int weightLossPerDayVar2=500;//gr
    System.out.println("Если каждый день терять вес по "+weightLossPerDayVar1+" гр, то для достижения нужного веса понадобится "+needToLoseWeightGr/weightLossPerDayVar1+" дней.");
    System.out.println("Если каждый день терять вес по "+weightLossPerDayVar2+" гр, то для достижения нужного веса понадобится "+needToLoseWeightGr/weightLossPerDayVar2+" дней.");
    System.out.println("В среднем понадобится "+(needToLoseWeightGr/weightLossPerDayVar1+needToLoseWeightGr/weightLossPerDayVar2)/2+" дней.");
    }
}