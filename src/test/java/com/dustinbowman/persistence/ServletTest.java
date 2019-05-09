package com.dustinbowman.persistence;

import com.dustinbowman.controller.AddGame;
import com.dustinbowman.test.util.Database;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;


public class ServletTest {
//    Testing out servlet test...
//    @Mock
//    HttpServletRequest request;
//
//    @Mock
//    HttpServletResponse response;
//
//    @Mock
//    RequestDispatcher dispatcher;
//
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @BeforeEach
//    public void sqlSetup() {
//        Database database = Database.getInstance();
//        database.runSQL("cleandb.sql");
//    }
//
//    @Test
//    public void addGameServlet() throws IOException, ServletException {
//        AddGame addGame = new AddGame();
//        when(request.getRemoteUser()).thenReturn("testuser2");
//        when(request.getParameter("gameName")).thenReturn("This is a test game");
//        when(request.getParameter("gameId")).thenReturn("42");
//        when(request.getRequestDispatcher("/gameStatusSuccess.jsp")).thenReturn(dispatcher);
//
//        addGame.doPost(request,response);
//
//        verify(request, atLeast(1)).getParameter("gameName");
//        verify(dispatcher).forward(request, response);
//    }
}
