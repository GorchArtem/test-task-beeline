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

    @Step("Ввод неверного кода аутентификации")
    public void enterInvalidCode(String code) {
        authorizePage.enterInvalidCode(code);
    }



    //Assertions

    @Step("Проверка появления сообщения о неверном коде")
    public void assertInvalidCode() {
        authorizePage.assertTextAboutInvalidCode();
    }



}
