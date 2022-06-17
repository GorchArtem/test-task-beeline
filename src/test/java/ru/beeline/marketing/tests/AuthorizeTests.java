package ru.beeline.marketing.tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class AuthorizeTests extends TestBase {

    @Test
    void authorizeAvailableUser() throws InterruptedException {
        String realNumber = "9015068354",
                url = "https://marketing.beeline.ru/my-campaigns";

        authorizePage.openPage(url);
        authorizePage.fillNumberField(realNumber);
        authorizePage.clickEnter();
        authorizePage.enterInvalidCode();

        authorizePage.assertTextAboutInvalidCode();


    }
}
