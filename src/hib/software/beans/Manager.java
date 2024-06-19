/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.software.beans;

/**
 *
 * @author Lenovo
 */
public class Manager 
{
    private String FullName;
    private String ManagerId;
    private String contact;
    private String Address;
    private String Password;

    public Manager() {
    }

    public Manager(String FullName, String ManagerId, String contact, String Address, String Password) {
        this.FullName = FullName;
        this.ManagerId = ManagerId;
        this.contact = contact;
        this.Address = Address;
        this.Password = Password;
    }

    /**
     * @return the FullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param FullName the FullName to set
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * @return the ManagerId
     */
    public String getManagerId() {
        return ManagerId;
    }

    /**
     * @param ManagerId the ManagerId to set
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
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
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
