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
public class Isslist {

    public int bid;
    public String bname;
    public int edition;
    public String publisher;
    public int price;
    public int pages;
    public int sid;
    public String sname;
    public String father;
    public String course;
    public int year;
    public int semester;
    public String i_date;
    public String r_date;

    public Isslist(int Bid, String Bname, int Edition, String Publisher, int Price, int Pages, int Sid, String Sname,
            String Father, String Course, int Year, int Semester, String I_date, String R_date) {
        this.bid = Bid;
        this.bname = Bname;
        this.edition = Edition;
        this.publisher = Publisher;
        this.price = Price;
        this.pages = Pages;
        this.sid = Sid;
        this.sname = Sname;
        this.father = Father;
        this.course = Course;
        this.year = Year;
        this.semester = Semester;
        this.i_date = I_date;
        this.r_date = R_date;
    }

    public int getBid() {
        return bid;
    }

    public String getBname() {
        return bname;
    }

    public int getEdition() {
        return edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
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

    public String getI_date() {
        return i_date;
    }

    public String getR_date() {
        return r_date;
    }
}
