package com.tarasov.x5tests.pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Footer {
    SelenideElement footerElement = $(".footer .block");

    public Footer checkPhoneNumber(String number) {
        footerElement.shouldHave(Condition.text(number));
        return this;
    }

    public Footer checkAddress(String address) {
        footerElement.shouldHave(Condition.text(address));
        return this;
    }

    public Footer checkVK() {
        $(byText("VK")).click();
        switchTo().window("X5 Group | VK");

        Assertions.assertEquals(title(), "X5 Group | VK");

        $(".page_name").shouldHave(Condition.text("X5 Group"));
        return this;
    }

    public Footer checkDzen() {
        $(byText("Yandex.Zen")).click();
        switchTo().window("X5 Group | Дзен");

        Assertions.assertEquals(title(), "X5 Group | Дзен");

        $("[itemprop='name']").shouldHave(Condition.text("X5 Group"));
        return this;
    }
}