package com.kodoma.dao;



import com.kodoma.datasource.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Observer;

/**
 * Created by Кодома on 26.07.2017.
 */
public interface DAO<T> {
    void setObserver(Observer o);
    int validate(String userName, String userPassword) throws Exception;
    void add(T obj) throws Exception;
    void label(T obj) throws Exception;
    void editContact(T obj) throws Exception;
    void removeContact(T obj) throws Exception;
    User showContactByID(T obj) throws Exception;
    List<T> showAllContacts() throws Exception;
    User showContactByName(T obj) throws Exception;
    List<User> showContactsOfGroup(String groupName) throws Exception;
    List<String> showAllGroupsNames() throws Exception;
    void deleteLabel(User user) throws Exception;
    void editGroup(String name, String newName) throws SQLException;
    void removeGroup(String name) throws Exception;
}