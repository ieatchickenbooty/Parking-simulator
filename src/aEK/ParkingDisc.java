package aEK;

import java.util.Random;

public interface ParkingDisc {
    Random icebox = new Random(  );
    int discnumber = icebox.nextInt( 1000000 );
    void issueDisc();

    void SlotNumber();
}
