package InterviewPractice.Amazon;

public class DeviceFactory {

    public Device getDevice(DeviceType type){
        switch(type){
            case AUDIO:
                return new AudioDevice(null, true);
            case SCREEN:
                return new ScreenDevice(80, false);
            case FULL:
                return new FullDevice(50, true);
            default:
                return null;
        }
    }
}
