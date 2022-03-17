package com.employee;

public class Employee {
    private String empid;
    private String fname;
    private String lname;
    private String dob;
    private String cno;
    private String job;
    private String msal;
    private String ybonus;
    private String tsal;
    public Employee(String _empid, String _fname, String _lname, String _dob, String _cno, String _job, String _msal, String _ybonus)
    {
        empid = _empid; 
        fname = _fname; 
        lname = _lname;
        dob = _dob;
        cno = _cno;
        job = _job;
        msal = _msal;
        ybonus = _ybonus;
    }
    
    public String getEmpid() { return empid; }
    public String getFname() { return fname; }
    public String getLname() { return lname; }
    public String getDob() { return dob; }
    public String getCno() { return cno; }
    public String getJob() { return job; }
    public String getMsal() { return msal; }
    public String getYbonus() { return ybonus; }
    public String getTsal() { 
    	int rs = (Integer.parseInt(msal) * 12) +  Integer.parseInt(ybonus); 
    	return rs+""; 
    }
}