package InterviewPractice.Amazon;

public class FullDevice extends BaseDevice implements Audible, Screenable{

    public FullDevice(Integer batteryPercentage, boolean isCharging) {
        super(batteryPercentage, isCharging);
    }

    @Override
    public void listen() {
        System.out.println("Listening...");
    }

    @Override
    public void present() {
        System.out.println("Presenting...");

    }
}
