package Step_2_Learn_Important_Sorting_Techniques.sorting_2;


class bookTrainSeats{
    int total_seats = 10;
    synchronized public void bookSeat(int seats, String name){

        if(total_seats >= seats){
            total_seats -= seats;
            System.out.println(name + " your seat has been booked successfully = " + seats);
            System.out.println("total seats left " + total_seats);
        }
        else{
            System.err.println(name + " Sorry No seats left :)");
            System.err.println(name + " Total seats left   = " + total_seats);
        }
    }
}

class myThread extends Thread{
    bookTrainSeats bts;
    int seats;

      public myThread(bookTrainSeats bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    public void run(){
        bts.bookSeat(seats,currentThread().getName());
    }
}

 public class trainReservation {
    public static void main(String[] args) {
        bookTrainSeats bts = new bookTrainSeats();
        myThread amaan = new myThread(bts,5);
        amaan.setName("amaan");
        amaan.start();

        myThread amit = new myThread(bts,3);
        amit.setName("amit");
        amit.start();

        myThread rahul = new myThread(bts,4);
        rahul.setName("rahul");
        rahul.start();

    }
}
