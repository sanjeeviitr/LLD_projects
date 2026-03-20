package InterviewPractice.Amazon;

public abstract class BaseDevice implements Device{
    protected Integer batteryPercentage;
    protected Boolean isCharging;

    public BaseDevice(Integer batteryPercentage, boolean isCharging){
        this.batteryPercentage = batteryPercentage;
        this.isCharging = isCharging;
    }

    @Override
    public void show(){
        if(batteryPercentage!=null && isCharging){
            System.out.println("Charging, Battery is : " +  batteryPercentage);
        }
      else if(batteryPercentage!=null){
            System.out.println("Battery is : " +  batteryPercentage + "%");
        }
        else if(batteryPercentage==null && isCharging){
            System.out.println("Charging, No Battery");
        }
        else if(!isCharging){
            System.out.println("No Charging, No Battery");
        }
    }
}
