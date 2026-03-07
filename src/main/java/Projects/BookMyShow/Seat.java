package Projects.BookMyShow;

public class Seat {

    private String seatId;
    private int seatNo;
    private int price;
    private SeatType seatType;

    public Seat(String seatId, int seatNo, int price, SeatType seatType) {
        this.seatId = seatId;
        this.seatNo = seatNo;
        this.price = price;
        this.seatType = seatType;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
}

/*
Seat
seatId
seatNo
price
seatType
 */
