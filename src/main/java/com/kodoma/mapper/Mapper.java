package com.kodoma.mapper;


import com.kodoma.datasource.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    private List<User> list = new ArrayList<>();

    public User mapToUser(ResultSet resultSet) {
        User user = null;
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fname = resultSet.getString("first_name");
                String lname = resultSet.getString("last_name");
                String address = resultSet.getString("address");
                int phoneNumber = resultSet.getInt("phone_number");
                String groupName = resultSet.getString("group_name");

                user = new User(id, fname, lname, address, phoneNumber, groupName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<User> mapToUsers(ResultSet resultSet) {
        list.clear();
        User user;
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fname = resultSet.getString("first_name");
                String lname = resultSet.getString("last_name");
                String address = resultSet.getString("address");
                int phoneNumber = resultSet.getInt("phone_number");
                String groupName = resultSet.getString("group_name");

                user = new User(id, fname, lname, address, phoneNumber, groupName);
                list.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public String mapToGroup(ResultSet resultSet) {
        StringBuilder result = new StringBuilder();
        try {
            while (resultSet.next()) {
                result.append(resultSet.getString("group_name") + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
