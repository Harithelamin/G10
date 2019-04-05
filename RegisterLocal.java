package Registration.Programlogic;

import java.util.ArrayList;

public class RegisterLocal {
       private ArrayList<Local> locals = new ArrayList<>();

       public void register_local(String local_ID, String type, int number_of_seat) {

           Local a_local = new Local("01", "Kino", 35);
           locals.add(a_local);

       }


       public String show_all_locals() {
           String out = "";
           for (Local a_local : locals) {
               out += a_local.getLokal_ID() + "\n " + a_local.getType() + "\n" +
                       a_local.getNumber_of_seat();
           }
           return out;
       }


   }
