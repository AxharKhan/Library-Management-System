package srccode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asad Ali
 */
public class Stdlist {

    public int id;
    public String name;
    public String father;
    public String course;
    public int year;
    public int semester;
    public String address;
    public String contact;

    public Stdlist(int Id, String Name, String Father, String Course, int Year, int Semester, String Address,
            String Contact) {
        this.id = Id;
        this.name = Name;
        this.father = Father;
        this.course = Course;
        this.year = Year;
        this.semester = Semester;
        this.address = Address;
        this.contact = Contact;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }
}
