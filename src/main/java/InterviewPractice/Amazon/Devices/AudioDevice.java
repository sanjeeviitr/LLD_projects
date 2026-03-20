package InterviewPractice.Amazon;

public class AudioDevice extends BaseDevice implements Audible{

    public AudioDevice(Integer batteryPercentage, boolean isCharging){
        super(batteryPercentage, isCharging);
    }

    @Override
    public void listen() {
        System.out.println("Listening...");

    }
}
