/*
 *
 *  * *
 *  *  * @author : Udara Deshan <udaradeshan.ud@gmail.com>
 *  *  * @since : 08/07/2021
 *  *  *
 *
 */

package lk.pirate.demoFx.model;

public class Customer {
    private String name;
    private String address;
    private String telephone;
    private String dOb;

    public Customer(String name, String address, String telephone, String dOb) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.dOb = dOb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }
}
