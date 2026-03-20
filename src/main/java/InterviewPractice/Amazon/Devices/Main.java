package InterviewPractice.Amazon;

public class Main {

    public static void main(String[] args) {
        Device audioDevice = new DeviceFactory().getDevice(DeviceType.AUDIO);
        Device screenDevice = new DeviceFactory().getDevice(DeviceType.SCREEN);
        Device fullDevice = new DeviceFactory().getDevice(DeviceType.FULL);

        fullDevice.show();
        screenDevice.show();
        audioDevice.show();
    }
}
