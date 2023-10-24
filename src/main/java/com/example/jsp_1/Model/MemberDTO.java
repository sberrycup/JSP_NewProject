package com.example.jsp_1.Model;

import java.sql.Date;

public class MemberDTO {
    private int memberNumber;
    private String memberId;
    private String memberPass;
    private String memberName;
    private Date memberBirth;
    private int memberAuthority;
    private String memberAddress;
    private String memberPhone;

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPass() {
        return memberPass;
    }

    public void setMemberPass(String memberPass) {
        this.memberPass = memberPass;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getMemberBirth() {
        return memberBirth;
    }

    public void setMemberBirth(Date memberBirth) {
        this.memberBirth = memberBirth;
    }

    public int getMemberAuthority() {
        return memberAuthority;
    }

    public void setMemberAuthority(int memberAuthority) {
        this.memberAuthority = memberAuthority;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }
}
