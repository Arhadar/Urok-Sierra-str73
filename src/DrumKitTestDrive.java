class DrumKitTestDrive{

    public static void main (String[] args){
        DrumKit d = new DrumKit();  //проверь, переставь выше за metod main

        d.snare=false;
        if (d.snare==true) {
            d.playSnare();
        }

        d.playSnare();
        d.playTopHat();

    }
}

class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("Бах Ба Бах!");
    }

    void playTopHat() {
        System.out.println("Динь динь динь!");
    }

}









