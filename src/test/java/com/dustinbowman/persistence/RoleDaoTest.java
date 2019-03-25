package com.dustinbowman.persistence;

import com.dustinbowman.entity.Role;
import com.dustinbowman.entity.User;
import com.dustinbowman.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RoleDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao dao;
    List<Role> roles;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new GenericDao(Role.class);
        roles = dao.getAll();
    }

    @Test
    public void deleteRole() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }

    @Test
    public void getRoleById() {
        Role role = roles.get(0);
        Role returnedRole = (Role)dao.getById(1);
        assertEquals(role, returnedRole);
    }

    @Test
    public void getAllUserRoles() {
        roles = dao.findByPropertyEqual("role", "user");
        assertTrue(roles.size()>0);
        logger.debug(roles);
        logger.debug(roles.size());
    }

    @Test
    public void updateRole() {
        Role role = roles.get(0);
        int id = role.getId();
        role.setRole("test");
        dao.saveOrUpdate(role);
        Role updatedRole = (Role) dao.getById(id);
        assertEquals(updatedRole, role);
    }

    @Test
    public void addRole() {
        GenericDao userDao = new GenericDao(User.class);
        Role role = new Role();
        role.setRole("A Test role");
        User user = (User)userDao.getById(1);
        role.setUser(user);
        user.addRole(role);
        int insertedRole = dao.insert(role);
        userDao.saveOrUpdate(user);
        User returnedUser = (User) userDao.getById(user.getId());
        Role returnedRole = (Role) dao.getById(insertedRole);
        assertTrue(insertedRole > 0);
        assertEquals(role, returnedRole);
        assertTrue(returnedUser.getRoles().contains(role));
    }
}
