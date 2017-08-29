package com.kodoma.services;

import com.kodoma.dao.DAO;
import com.kodoma.dao.FactoryDAO;
import com.kodoma.datasource.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Observer;

/**
 * Created by Кодома on 26.07.2017.
 */
public class UserService implements Service<User> {
    private DAO contactDAO = FactoryDAO.getDAO(User.class);
    public static UserService instance;

    private UserService() {
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    @Override
    public void setObserver(Observer o) {
        contactDAO.setObserver(o);
    }

    @Override
    public int validate(String userName, String userPassword) throws Exception {
        return contactDAO.validate(userName, userPassword);
    }

    public void add(User user) throws Exception {
        contactDAO.add(user);
    }

    public void label(User user) throws Exception {
        contactDAO.label(user);
    }

    @Override
    public void editContact(User obj) throws Exception {
        contactDAO.editContact(obj);
    }

    @Override
    public void removeContact(User obj) throws Exception {
        contactDAO.removeContact(obj);
    }

    @Override
    public User showContactByID(User user) throws Exception {
        return contactDAO.showContactByID(user);
    }

    @Override
    public List<User> showAllContacts() throws Exception {
        return contactDAO.showAllContacts();
    }

    @Override
    public User showContactByName(User user) throws Exception {
        return contactDAO.showContactByName(user);
    }

    @Override
    public List<User> showContactsOfGroup(String groupName) throws Exception {
        return contactDAO.showContactsOfGroup(groupName);
    }

    @Override
    public List<String> showAllGroupsNames() throws Exception {
        return contactDAO.showAllGroupsNames();
    }

    @Override
    public void deleteLabel(User user) throws Exception {
        contactDAO.deleteLabel(user);
    }

    @Override
    public void editGroup(String name, String newName) throws SQLException {
        contactDAO.editGroup(name, newName);
    }

    @Override
    public void removeGroup(String name) throws Exception {
        contactDAO.removeGroup(name);
    }

}
