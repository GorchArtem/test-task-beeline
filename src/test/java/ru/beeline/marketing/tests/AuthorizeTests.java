package ru.beeline.marketing.tests;

import org.junit.jupiter.api.Test;
import ru.beeline.marketing.steps.AuthorizeSteps;
public class AuthorizeTests {

    @Test
    void authorizeAvailableUser() {
        String realNumber = "9015068354",
                url = "https://marketing.beeline.ru/my-campaigns",
                code = "0000";

        AuthorizeSteps authorizeSteps = new AuthorizeSteps();

        authorizeSteps.openMainPage(url);
        authorizeSteps.fillNumberFieldAndEnter(realNumber);
        authorizeSteps.enterInvalidCodeAndAssertText(code);
    }
}
