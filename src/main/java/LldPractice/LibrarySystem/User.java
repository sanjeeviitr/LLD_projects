package LldPractice.LibrarySystem;

public class User {

    private String name;
    private final String userId;
    private String mobileNo;

    public User(String name, String userId, String mobileNo) {
        this.name = name;
        this.userId = userId;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public int hashCode(){
        return userId.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof User)) return false;
        User user = (User) o;
        return userId.equals(user.userId);
    }
}
