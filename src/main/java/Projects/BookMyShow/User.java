package Projects.BookMyShow;

public class User {

    private String userName;
    private String userId;
    private String userEmail;
    private String phoneNo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public User(String userName, String userId, String userEmail, String phoneNo) {
        this.userName = userName;
        this.userId = userId;
        this.userEmail = userEmail;
        this.phoneNo = phoneNo;
    }
}

/*
User
userName;
userId;
userEmail;
userPhoneNo;
 */
