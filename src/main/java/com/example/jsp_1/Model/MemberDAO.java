package com.example.jsp_1.Model;

import java.sql.SQLException;

public class MemberDAO extends JDBC_connect{
    public MemberDAO(String sqlDriver, String sqlURL, String sqlId, String sqlPass) {
        super(sqlDriver, sqlURL, sqlId, sqlPass);
    }

    // 회원정보 조회
    public MemberDTO getMemberDTO(String id, String pass) {
        MemberDTO memberDTO = new MemberDTO();

        String sql = "SELECT * FROM member WHERE member_id=? AND member_pass=? ";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, pass);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                memberDTO.setMemberNumber(resultSet.getInt("member_number"));
                memberDTO.setMemberId(resultSet.getString("member_id"));
                memberDTO.setMemberPass(resultSet.getString("member_pass"));
                memberDTO.setMemberName(resultSet.getString("member_name"));
                memberDTO.setMemberBirth(resultSet.getDate("member_birth"));
                memberDTO.setMemberAuthority(resultSet.getInt("member_authority"));
                memberDTO.setMemberAddress(resultSet.getString("member_address"));
                memberDTO.setMemberPhone(resultSet.getString("member_phone"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return memberDTO;
    }
}
