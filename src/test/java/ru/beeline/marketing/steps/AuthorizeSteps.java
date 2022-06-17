package ru.beeline.marketing.steps;

import io.qameta.allure.Step;
import ru.beeline.marketing.pages.AuthorizePage;

public class AuthorizeSteps {

    AuthorizePage authorizePage = new AuthorizePage();
    @Step("Открыть главную страницу {url}")
    public void openMainPage(String url) {
        authorizePage.openPage(url);
    }

    @Step("Заполнить поле для ввода телефонного номера и нажать Войти")
    public void fillNumberFieldAndEnter(String number) {
        authorizePage.fillNumberField(number);
        authorizePage.clickEnter();
    }

    @Step("Ввод инвалидного кода аутентификации и проверка появления сообщения о неверном коде")
    public void enterInvalidCodeAndAssertText(String code) {
        authorizePage.enterInvalidCode(code);
        authorizePage.assertTextAboutInvalidCode();
    }


}
