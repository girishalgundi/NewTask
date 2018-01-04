package com.girish.newtask.model;

/**
 * Created by Admin on 11/8/2015.
 */
public class T24_MiniStatementInput {
    public LoginResult LoginResult;
    public String AccountNo;
    public String AgentPinNo;
    public String CustPinNo;
    public String Lat;
    public String Lng;
    public String DeviceId;
    public String AccountName;
    public String FromDate;
    public String ToDate;

    public T24_MiniStatementInput(LoginResult loginResult, String accountNo, String agentPinNo, String custPinNo,
                                  String lat, String lng, String deviceId, String fromDate, String toDate) {
        LoginResult = loginResult;
        AccountNo = accountNo;
        AgentPinNo = agentPinNo;
        CustPinNo = custPinNo;
        Lat = lat;
        Lng = lng;
        DeviceId = deviceId;
        FromDate = fromDate;
        ToDate = toDate;
    }

    public T24_MiniStatementInput(LoginResult loginResult, String accountNo, String agentPinNo, String custPinNo,
                                  String lat, String lng, String deviceId) {
        LoginResult = loginResult;
        AccountNo = accountNo;
        AgentPinNo = agentPinNo;
        CustPinNo = custPinNo;
        Lat = lat;
        Lng = lng;
        DeviceId = deviceId;
    }

    @Override
    public String toString() {
        return "T24_MiniStatementInput{" +
                "LoginResult=" + LoginResult +
                ", AccountNo='" + AccountNo + '\'' +
                ", AgentPinNo='" + AgentPinNo + '\'' +
                ", CustPinNo='" + CustPinNo + '\'' +
                ", Lat='" + Lat + '\'' +
                ", Lng='" + Lng + '\'' +
                ", DeviceId='" + DeviceId + '\'' +
                ", AccountName='" + AccountName + '\'' +
                ", FromDate='" + FromDate + '\'' +
                ", ToDate='" + ToDate + '\'' +
                '}';
    }
}
