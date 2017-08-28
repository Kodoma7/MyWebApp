
package com.kodoma.services;


import com.kodoma.datasource.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Observer;


/**
 * Created by Кодома on 27.07.2017.
 */
public interface Service<T> {
    void setObserver(Observer o);
    int validate(String userName, String userPassword) throws Exception;
    void add(T obj) throws Exception;
    void label(T obj) throws Exception;
    void editContact(T obj) throws Exception;
    void removeContact(T obj) throws Exception;
    User showContactByID(T obj) throws Exception;
    List<T> showAllContacts() throws Exception;
    void showContactByName(T obj) throws Exception;
    void showContactsOfGroup(String groupName) throws Exception;
    void showAllGroupsNames() throws Exception;
    void deleteLabel(User user) throws Exception;
    void editGroup(String name, String newName) throws SQLException;
    void removeGroup(String name) throws Exception;
}