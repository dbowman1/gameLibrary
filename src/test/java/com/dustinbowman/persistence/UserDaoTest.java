package com.dustinbowman.persistence;

import com.dustinbowman.test.util.Database;
import org.junit.jupiter.api.BeforeEach;

public class UserDaoTest {

    UserDao dao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();

        dao = new UserDao();
    }
}
