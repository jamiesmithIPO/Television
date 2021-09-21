public class Television {

    private final int MIN_CHANNEL = 1;
    private final int MAX_CHANNEL = 100;
    private final int MIN_VOLUME = 1;
    private final int MAX_VOLUME = 100;

    private int channelNumber;
    private int volumeLevel;
    private boolean power;
    private static int latestId = 0;

    public Television() {

        this.power = false;
        this.channelNumber = 1;
        this.volumeLevel = 25;
    }

    public Television(int maxChannelNumber) {
        maxChannelNumber = MAX_CHANNEL;
    }

    public boolean getPower() {
        return power;
    }

    public int getChannelNumber() {
        testState(" get Channel State");
        if (channelNumber > MAX_CHANNEL || channelNumber < MIN_CHANNEL) {
            throw new IllegalArgumentException("Television channels are out of range. Please select between 1 - 100");
        }
        else {
        }
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        testState(" set Channel State");
        this.channelNumber = channelNumber;
    }

    private void testState(String Reason) {
        if (!getPower()) {
            throw new IllegalArgumentException("Cannot " + Reason + " As power is off");
        }
    }
    public void nextChannelNumber() {
        testState(" change to next Channel");
        this.channelNumber += 1;
        if (this.channelNumber > MAX_CHANNEL) {
            this.channelNumber = MAX_CHANNEL;
        }
    }

    public void previousChannelNumber() {
        testState(" change to previous Channel");
        this.channelNumber -= 1;
        if (this.channelNumber < MIN_CHANNEL) {
            this.channelNumber = MIN_CHANNEL;
        }
    }

    public int getVolumeLevel() {
        testState(" get Volume Level");
        return volumeLevel;
    }

    public void togglePower() {
        this.power = !this.power;
    }

    public void increaseVolumeLevel() {
        testState(" increase Volume Level");
        this.volumeLevel += 5;
        if (this.volumeLevel > MIN_VOLUME) {
            this.volumeLevel = MAX_VOLUME;
        }
    }

    public void decreaseVolumeLevel() {
        testState(" decrease Volume Level");
        this.volumeLevel -= 5;
        if (this.volumeLevel < MIN_VOLUME) {
            this.volumeLevel = MAX_VOLUME;
        }
    }
    public int generateId() {
        return ++latestId;
    }
}
