
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public final class Student {

    private String mID;
    private String mFullName;
    private Date mDoB;
    private String mPhone;
    private String mAddress;

    public Student() {
    }

    public Student(String mID, String mFullName, Date mDoB, String mPhone, String mAddress) {
        this.setmID(mID);
        this.setmFullName(mFullName);
        this.mDoB = mDoB;
        this.mPhone = mPhone;
        this.mAddress = mAddress;
    }

    

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public Date getmDoB() {
        return mDoB;
    }

    public void setmDoB(Date mDoB) {
        this.mDoB = mDoB;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    @Override
    public String toString() {
        return String.format("ID: %s%nFullname: %s%n Date of Birth: %tD1%nPhone: %s%nAddress: %s%n", getmID(),getmFullName(),getmDoB(),getmPhone(),getmAddress());
    }

}
