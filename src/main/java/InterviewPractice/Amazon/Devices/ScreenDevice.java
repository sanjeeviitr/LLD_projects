package InterviewPractice.Amazon;

public class ScreenDevice extends BaseDevice implements Screenable{

    public ScreenDevice(Integer batteryPercentage, boolean isCharging){
        super(batteryPercentage, isCharging);
    }

    @Override
    public void present() {
        System.out.println("Presenting...");
    }
}
