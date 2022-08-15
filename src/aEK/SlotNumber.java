package aEK;

import java.util.Random;

public interface SlotNumber extends ParkingDisc{
    Random icebox = new Random(  );
    int Slot_number = icebox.nextInt( 1000 );
    void SlotNumber();

}
