/*
 *
 *  * *
 *  *  * @author : Udara Deshan <udaradeshan.ud@gmail.com>
 *  *  * @since : 08/07/2021
 *  *  *
 *
 */

package lk.pirate.demoFx.model;

public class Item {
    private String name;
    private String price;
    private String expDate;
    private String qty;

    public Item(String name, String price, String expDate, String qty) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
