package aEK;

import java.util.Scanner;

public class irmao {
    private String name;
    private String sur_name;
    private String StaffId;
    private String gendr;
    private String eMail;
    private String phonenumber;
    private String department;
// private int slot_num;
    private String reason;
    private Address address;
    private Date dateofbirth;



    public void setName(String d) {
      this.name = d;
    }
    public  String getName(){
        return this.name;
    }
    public void setSurname(String s) {
        this.sur_name = s;
    }

    public String getSurname() {
        return this.sur_name;}

    public void setStaffId(String n){
        this.StaffId = n;
    }public String getStaffId(){
        return this.StaffId;}

    public void seteMail(String e){
        this.eMail = e;
    }
    public String geteMail(){
        return this.eMail;
    }
    public void setPhonenumber(String p) {
        this.phonenumber = p;
    }
    public String getPhonenumber(){
        return this.phonenumber;}

        public void setDepartment(String g){
        this.department = g;
        }public String getDepartment(){
        return this.department;
    }
    public void setReason(String y){
        this.reason = y;
    }public String getReason(){
        return this.reason;
    }

    public void Display(){
        Scanner wmwa = new Scanner( System.in );

        System.out.println("Enter Name: " );
        setName( wmwa.nextLine() );

        System.out.println("Enter Surname: " );
        setSurname( wmwa.nextLine() );

        System.out.println("Enter Staff Identification Number: " );
        setStaffId( wmwa.nextLine() );

        System.out.println("Enter e-mail: " );
        seteMail( wmwa.nextLine() );

        System.out.println("Enter Mobile Details: " );
        setPhonenumber( wmwa.nextLine() );

        System.out.println("Enter Department: " );
        setDepartment( wmwa.nextLine() );

        System.out.println("Visitor or Worker: " );
        setReason( wmwa.nextLine() );



// Prints out the details for the individual
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Staff Identification Number: " + this.getStaffId());
        System.out.println("e-mail: " + this.geteMail());
        System.out.println("Mobile Details: " + this.getPhonenumber());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("Reason: " + this.getReason());

    }




    /* public irmao(String next){

}
public irmao(String name, String sur_name, String StudentID, String eMail, String gendr, String phonenumber, Address address){

    this.name = name;
    this.StudentId  = StudentID;
    this.sur_name = sur_name;
    this.eMail = eMail;
    this.gendr = gendr;
//this.slot_num = slot_num;
    this.phonenumber = phonenumber;
    this.address = address;
}
public irmao(String name, String sur_name, String StudentID, String eMail,String gendr, String phonenumber, int slot_num, Address address, int day, String month, int year){

    this.name = name;
    this.sur_name = sur_name;
    this.StudentId  = StudentID;
    this.eMail = eMail;
    this.phonenumber = phonenumber;

    this.address = address;
    this.dateofbirth = new Date();

}

    public irmao() {

    }


    public void setName(String newName){
        this.name = newName;}
        public String getName(){
        return this.name;
    }

    public void setSurname(String surname) {
        this.sur_name = sur_name;
    }

    public String getSurname() {
        return sur_name;
    }

    public void setStudentId(String newStuID){
        this.StudentId = newStuID;
    }public String getStudentId(){
        return this.StudentId;}

    public void seteMail(String eMail){
        this.eMail = eMail;}
            public String geteMail(){
                return this.eMail;
        }
    public void setPhonenumber(String newPhone) {
        this.phonenumber = newPhone;
    }
    public String getPhonenumber(){
        return this.phonenumber;}


        public void setAddress(Address address)
        {this.address = address;}

    public Address getAddress() {
        return address;}

    public void setGendr(String gendr){this.gendr = gendr;}
    public String getGendr(){
        return this.gendr;
        }


    @Override
    public String toString() {
            return "First Name:" + name + ", Surname:" + sur_name + ", Gender:" + gendr + ", Student ID number:" + StudentId + ", Residential Address:" + address;
            // + ", Slot Number:" + slot_num


    }


 */


}