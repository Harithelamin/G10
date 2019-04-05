package Registration.Programlogic;

import java.util.ArrayList;

public class Local {
    private String local_ID;
    private String type;
    private int number_of_seat; // movie theatre, concert hall, theatre,presentation hall.


    public Local(String local_ID, String type, int number_of_seat) {
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


    public String Save(String local_ID, String type, int number_of_seat) {
        return local_ID;

    }


    @Override
    public String toString() {
        String output = "";
        output = "ID : " + local_ID + "\n" +
                "Type :" + type + "\n" +
                "Number_of_seat :" + number_of_seat;

        return output;

    }

 }



