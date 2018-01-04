package com.girish.newtask.model;

/**
 * Created by Dell-PC on 12/13/2017.
 */

public class MiniGetrSetr {

    public String amount_type;
    public String transDetails;
    public String amount;
    public String trans_date;
    public String TranNo;
    public String TransType;


    public MiniGetrSetr(String amount_type, String transDetails, String amount, String trans_date, String tranNo, String transType) {
        this.amount_type = amount_type;
        this.transDetails = transDetails;
        this.amount = amount;
        this.trans_date = trans_date;
        TranNo = tranNo;
        TransType = transType;
    }


    public String getAmount_type() {
        return amount_type;
    }

    public void setAmount_type(String amount_type) {
        this.amount_type = amount_type;
    }

    public String getTransDetails() {
        return transDetails;
    }

    public void setTransDetails(String transDetails) {
        this.transDetails = transDetails;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(String trans_date) {
        this.trans_date = trans_date;
    }

    public String getTranNo() {
        return TranNo;
    }

    public void setTranNo(String tranNo) {
        TranNo = tranNo;
    }

    public String getTransType() {
        return TransType;
    }

    public void setTransType(String transType) {
        TransType = transType;
    }
}
