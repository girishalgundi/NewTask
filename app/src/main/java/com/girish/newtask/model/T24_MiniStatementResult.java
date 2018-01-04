package com.girish.newtask.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11/8/2015.
 */
public class T24_MiniStatementResult {
    public Boolean IsValid;
    public String Remarks;
    public String Account_No;
    public String Balance;
    public List<EachStatement> EachStatement = new ArrayList<EachStatement>();

    public class EachStatement {
        public String Date;
        public String Des;
        public String Amount;
        public String CurrencyType;
        public String TransType;
        public String TranNo;
    }

    @Override
    public String toString() {
        return "T24_MiniStatementResult{" +
                "IsValid=" + IsValid +
                ", Remarks='" + Remarks + '\'' +
                ", Account_No='" + Account_No + '\'' +
                ", Balance='" + Balance + '\'' +
                ", EachStatement=" + EachStatement +
                '}';
    }
}
