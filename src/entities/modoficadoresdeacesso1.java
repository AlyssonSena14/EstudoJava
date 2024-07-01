package entities;

import java.util.Date;

public class modoficadoresdeacesso1 {
    private Date date;
    private product product;

    public modoficadoresdeacesso1(Date date, product product) {
        this.date = date;
        this.product = product;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public entities.product getProduct() {
        return product;
    }

    public void setProduct(entities.product product) {
        this.product = product;
    }
}
