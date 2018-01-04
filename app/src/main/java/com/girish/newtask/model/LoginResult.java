package com.girish.newtask.model;

/**
 * Created by scriptnull on 29-Oct-15.
 */
public class LoginResult {
    public Boolean isLoggedIn;
    public String Token;
    public String agentid;
    public String isNewuser;
    public String Remarks;
    public String log_key;

    public LoginResult(Boolean isLoggedIn, String token, String agentid) {
        this.isLoggedIn = isLoggedIn;
        Token = token;
        this.agentid = agentid;
    }

    public LoginResult(Boolean isLoggedIn, String token, String agentid, String isNewuser, String Remarks, String log_key) {
        this.isLoggedIn = isLoggedIn;
        Token = token;
        this.agentid = agentid;
        this.isNewuser = isNewuser;
        this.Remarks = Remarks;
        this.log_key = log_key;
    }
}
