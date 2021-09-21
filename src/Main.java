public class Main {

    public static void main(String[] args) {

        Television television1 = new Television();
        Television television2 = new Television();
        Television television3 = new Television();

        television1.togglePower();
        television1.setChannelNumber(99);
        television1.increaseVolumeLevel();
        System.out.println("TV Serial Number: " + television1.generateId());
        System.out.println("Current Channel Number: " + television1.getChannelNumber());
        System.out.println("Volume is Set to: " + television1.getVolumeLevel());
        System.out.println(" TV Power on is: " + television1.getPower());
        television2.togglePower();
        television2.setChannelNumber(55);
        television2.increaseVolumeLevel();
        television2.increaseVolumeLevel();
        television2.increaseVolumeLevel();
        television2.increaseVolumeLevel();
        System.out.println("TV Serial Number: " + television2.generateId());
        System.out.println("Current Channel Number: " + television2.getChannelNumber());
        System.out.println("Volume is Set to: " + television2.getVolumeLevel());
        System.out.println(" TV Power on is: " + television2.getPower());
        television3.togglePower();
        television3.setChannelNumber(44);


        television3.increaseVolumeLevel();
        television3.increaseVolumeLevel();
        System.out.println("TV Serial Number: " + television3.generateId());
        System.out.println("Current Channel Number: " + television3.getChannelNumber());
        System.out.println("Volume is Set to: " + television3.getVolumeLevel());
        System.out.println(" TV Power on is: " + television3.getPower());
    }


}
