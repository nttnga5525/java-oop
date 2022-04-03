package lab11;

import java.util.Arrays;
import java.util.List;

public class LoginHandler {
    public static void main(String[] args) {
        LoginHandler loginHandler = new LoginHandler();

        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();
        loginHandler.login(Arrays.asList(internalLoginPage, externalLoginPage));

    }

    public void login(List<LoginPage> allType) {
        for (LoginPage type : allType) {
            type.performLogin();
        }

    }
}
