
package hib.software.beans;

public class student 
{
    private String EnrollNo;
    private String fullName;
    private String contact;
    private String DOB;
    private String gender;
    private String address;
    private String mailId;
    
    private String password;

    public student() {
    }

    public student(String EnrollNo, String fullName, String contact, String DOB, String gender, String address, String mailId, String password) {
        this.EnrollNo = EnrollNo;
        this.fullName = fullName;
        this.contact = contact;
        this.DOB = DOB;
        this.gender = gender;
        this.address = address;
        this.mailId = mailId;
        this.password = password;
    }

    /**
     * @return the EnrollNo
     */
    public String getEnrollNo() {
        return EnrollNo;
    }

    /**
     * @param EnrollNo the EnrollNo to set
     */
    public void setEnrollNo(String EnrollNo) {
        this.EnrollNo = EnrollNo;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mailId
     */
    public String getMailId() {
        return mailId;
    }

    /**
     * @param mailId the mailId to set
     */
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
