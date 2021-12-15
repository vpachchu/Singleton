package com.company;

public class Hostel {

    private static Hostel room;
    private Hostel() {


    }

    public static Hostel getRoom(int roomNo) {

        if(room==null) {
            //synchronized is for double check. it doesn't allow any thread until the inside thread leave after processing.
           // synchronized (Hostel.class)
            {
                if(room==null) {
                    room=new Hostel();
                }
            }
        }

            System.out.println("Room Num is : " + roomNo);
            return room;
    }
}
