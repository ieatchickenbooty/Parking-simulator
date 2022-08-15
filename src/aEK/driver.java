package aEK;

/* Authors :
Iita Saarie Tonata 
Petrus Immanuel Tuli-Megameno 

 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class driver implements ParkingDisc, SlotNumber{


    private static boolean input;

    public static void main(String[] args) {
        Scanner cav = new Scanner( System.in );
        irmao de = new irmao();
        Perthon per = new Perthon();
        Vehicle vrr = new Vehicle();
        double charge;
        double parkingRate = 0.75;
        int hourspent;


        de.setName( cav.next() );
      //  de.Display();

        Scanner bry = new Scanner( System.in );


        String vehName;
        double make;






        ArrayList<Vehicle> carro = new ArrayList<Vehicle>();
        carro.add( new Vehicle() );

        System.out.println( "Enter Vehicle Model: " );
        vrr.setVehName( bry.nextLine() );
        System.out.println( "Enter Vehicle Make: " );
        vrr.setMake( bry.nextLine() );
        System.out.println( "Enter Vehicle Color: " );
        vrr.setColor( bry.nextLine() );
        System.out.println( "Enter Vehicle year: " );
        vrr.setYear( bry.nextInt() );



        de.Display();
        carro.add(vrr);
        driver discno = new driver();
        discno.issueDisc();
        driver slon = new driver();
        slon.SlotNumber();


        System.out.println("Enter Number of hours spent: " );
        hourspent = cav.nextInt();

        charge = (parkingRate * hourspent );
        System.out.println("The amount you owe is N$"+charge);

        for (int x = 0; x<carro.size(); x++){
            System.out.println(carro.get( x ));
        }



    }

    @Override
    public void issueDisc() {
        System.out.println("Disc number is: " + discnumber);


    }
    @Override
    public void SlotNumber(){
        System.out.println("Your Parking Slot Number is: " + Slot_number);
    }

    /*  I hereby acknowledge that the work handed in is my own original work. If I
    have quoted from any other source this information has been correctly referenced.
    I also declare that I have read the Namibia University of Science and Technology
   Policies on Academic Honesty and Integrity as indicated in my course outline and
    the NUST general information and regulations - Yearbook 2018.

   */


      /*  Perthon per = new Perthon();

        Vehicle carro = new Vehicle();
        Date wmw = new Date();
        Address plek = new Address( " ", " ", " ", 0 );
        Scanner aek = new Scanner( System.in );
        irmao p1 = new irmao();


        System.out.println( "Enter FullName(s) and Surname: " + p1.getName() + p1.getSurname() );
        p1.setName( aek.findInLine( " " ) );

        p1.setSurname( aek.nextLine() );
        System.out.println( "Enter Student Identification number: " + p1.getStudentId() );

        p1.setStudentId( aek.nextLine() );
        System.out.println( "Enter e-Mail address: " + p1.geteMail() );
        p1.seteMail( aek.nextLine() );

        System.out.println( "Enter Gender: " + p1.getGendr() );
        p1.setGendr( aek.nextLine() );

        System.out.println( "Enter Mobile Number: " + p1.getPhonenumber() );
        p1.setPhonenumber( aek.nextLine() );

        Scanner vehiclereg = new Scanner( System.in );


        System.out.println( "Enter Vehicle & Enter Make: " + carro.getVehName() + carro.getMake() );
        carro.setVehName( vehiclereg.findInLine( "" ) );
        carro.setMake( vehiclereg.nextDouble() );

        ArrayList<String> vp = new ArrayList<String>();
        while (vehiclereg.hasNext()) {
            vp.add( String.valueOf( new Vehicle() ) );
            for (int z = 0; z < vp.size(); z++) {
                System.out.println( vp.get( z ) );

                ArrayList<String> row = new ArrayList<>();
                while (aek.hasNext()) {
                    row.add( String.valueOf( new irmao( aek.next() ) ) );
                    for (int x = 0; x < row.size(); x++) {
                        System.out.println( row.get( x ) );
                    }
                    System.out.println( "--------------------Registered Owners--------------------" );
                    regowners( row );
                }public static void regowners(){
                    for (int w = 0; w < row.size(); w++) {
                        if (row.get( w ).equals( "" ) && row.get( w ).equals( "" )) {

                        }

                    }
                    System.out.println( "The current date for registration is : " + wmw );
                    System.out.println( "Enter Residential Address: " + plek.getAddress() );
                }
            }
        }
    }

    private static void regowners(ArrayList<String> row) {

       */
        }


