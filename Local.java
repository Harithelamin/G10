package sample;

public class Local {
    private String local_ID;
    private String type;
    private int number_of_seat; // movie theatre, concert hall, theatre,presentation hall.



    Local(String local_ID, String type, int number_of_seat){
      this.local_ID = local_ID;
      this.type = type;
      this.number_of_seat = number_of_seat;
    }

    public String getLokal_ID() {
        return local_ID;
    }

    public String getType() {
        return type;
    }


    public int getNumber_of_seat() {
        return number_of_seat;
    }


}



