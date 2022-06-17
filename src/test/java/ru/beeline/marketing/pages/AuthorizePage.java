package ru.beeline.marketing.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizePage {
    private SelenideElement
            numberField = $x("//input[contains(@class, 'containers_phoneInput_38Va')]"),
            submitButton = $x("//button[contains(@type, 'submit')]"),
            codeField = $x("//input[contains(@class, 'containers_field_17g9')]"),
            textAboutInvalidCode = $x("//div[contains(@class, 'containers_errorTextMsg_am0e')]");


    //методы работы со страницой авторизации
    public void openPage(String url) {
        open(url);
    }

    public void fillNumberField(String realNumber) {
        numberField.click();
        numberField.sendKeys(realNumber);
    }

    public void clickEnter() {
        submitButton.click();
    }

    public void enterInvalidCode(String code) {
        codeField.click();
        codeField.sendKeys(code);
    }


    //Проверки
    public void assertTextAboutInvalidCode() {
        textAboutInvalidCode.shouldHave(text("Неверный код"));
    }

}
