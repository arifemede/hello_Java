package miniProject.bus.ticket.calculation;

import java.util.ArrayList;
import java.util.List;

public class Bus  {

    // Bus number , seats


    public String busNum;


    public List<String> seats = new ArrayList<>(); // to store all the seats number available

    public Bus(String busNum) {  // constructor
        this.busNum = busNum;

        for(int i =1; i<33; i++) {

            seats.add(i + "");   // is it convert i to string??

        }






    }




}
