package com.example.domain.entity;

import com.example.domain.exception.WrongPasswordException;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void user_createUserWithCorrectPassword_successful() {

        //Arrange
        String userId= "user01";
        String password = "abc123AB";

        //Act
        User expected = new User(userId, password);

        //Assert
        Assert.assertNotNull(expected);
    }

    @Test
    public void user_createUserWithNullPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = null;
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void user_createUserWithEmptyPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = "";
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void user_createUserWithoutNumbersInPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = "asdsfsADFSDFDDFas";
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void user_createUserWithoutLettersInPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = "0123456789";
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void user_createUserWithoutCapitalLettersInPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = "0123456789asd";
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void user_createUserWithoutLowercaseLettersInPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = "0123456789A";
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void user_createUserWithLessThanEightCharactersInPassword_exception() {

        //Arrange
        String userId= "user01";
        String password = "123abcA";
        User user;
        String expectedMessage = "El password no tiene el formato correcto.";

        //Act
        try {

            user = new User(userId, password);
            Assert.fail();
        }
        catch (WrongPasswordException ex) {

            //Assert
            Assert.assertEquals(expectedMessage, ex.getMessage());
        }
    }
}
