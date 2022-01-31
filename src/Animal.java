public class Animal {
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_DOG_WEIGHT = 10.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    private Double weight;
    final String species;
    Boolean isAlive;

    public Animal(String species){
        this.isAlive = true;
        this.species = species;
        if(this.species.equals("cat")){
            this.weight = DEFAULT_CAT_WEIGHT;
        }else if(this.species.equals("dog")){
            this.weight = DEFAULT_DOG_WEIGHT;
        }else{
            this.weight = DEFAULT_WEIGHT;
        }
    }

    public void feed(){
        if(this.weight > 0.0){
            this.isAlive = true;
            this.weight += 1.0;
            System.out.println("Omnomnomnom dzięki za jedzenie!");
        }else{
            System.out.println("Ja, Twój miłościwie Ci panujący, umarłem śmiercią głodową.. Nie karm martwego zwierza!");
        }
    }

    public void takeForAWalk(){
        if(this.isAlive){
            this.weight -= 1.0;
            System.out.println("Hopaj siupaj, hopaj siupaj.. spaceeer!! Dzięki!");
            if(this.weight == 0 ){
                this.isAlive = false;
            }
        }else{
            System.out.println("I co, będziesz mnie ciągnął na smyczy??!! Serio?! Nie widzisz, że nie żyję?!");
        }
    }
}
