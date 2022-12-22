package BusResv;
import  java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicalDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Vehicals> vehical= new ArrayList<Vehicals>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();

        vehical.add(new Vehicals(1,"Bus(Ac)",40,5,7500));
        vehical.add(new Vehicals(2,"Bus(N/Ac)",44,5,6000));
        vehical.add(new Vehicals(3,"Innova Car",8,5,5000));
        vehical.add(new Vehicals(4,"Scarpio Car",8,5,6000));
        vehical.add(new Vehicals(5,"Suziki car",6,5,4500));
        vehical.add(new Vehicals(6,"Traveller Car",26,5,10000));
        vehical.add(new Vehicals(7,"Traveller car",16,5,9000));

        for (Vehicals v:vehical){
            v.displayBusInformation();
        }
        int userOption=1;
        Scanner in=new Scanner(System.in);
        while (userOption==1){
            System.out.println("Enter 1 to Book and 2 to Exit ");
            userOption=in.nextInt();
            if (userOption==1){
                Booking booking=new Booking();
                if (booking.isAvailable(bookings,vehical)){
                    bookings.add(booking);
                    System.out.println("Your booking is conformed....");
                }
                else
                    System.out.println("Sorry Booking is full Choose Another Date & Vehical");
            }

        }

    }
}
