public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        int i = 1;
        if (isCheck()) {
            while (f1.chance == f2.chance){
                f1.chance = chanceCheck();
                f2.chance = chanceCheck();
            }
            if(f1.chance > f2.chance){
                System.out.println(f1.name + " START.");
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("Raunt " + i);
                    f2.health = f1.hit(f2,f1);
                    if(f2.health == 0){
                        break;
                    }
                    f1.health = f2.hit(f1,f2);
                    i++;
                    System.out.println("******************************");
                }
                isWin();
            } else {
                System.out.println(f2.name + " START.");
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("Raunt " + i);
                    f1.health = f2.hit(f1,f2);
                    if(f2.health == 0){
                        break;
                    }
                    f2.health = f1.hit(f2,f1);
                    i++;
                    System.out.println("******************************");
                }
                isWin();
            }
        } else {
            System.out.println("The weight of sportsman do not match ");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <=maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <=maxWeight);
    }

    void isWin(){
        boolean result = false;
        if(f2.health == 0 ){
            System.out.println(f1.name + " win.");
        }
       if (f1.health == 0){
           System.out.println(f2.name + " win.");
       }
    }

    double chanceCheck() {
        double randNum = Math.random() * 100;
        return randNum;
    }

    void fightForF1(){

    }
}
