package com.tarasov.x5tests.pages;

import com.tarasov.x5tests.pages.components.Footer;
import com.tarasov.x5tests.pages.components.HeaderNavigation;

import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    HeaderNavigation navigation = new HeaderNavigation();
    Footer footer = new Footer();

    public MainPage openMainPage() {
        open("https://www.x5.ru/ru/");
        return this;
    }

    public void checkHeaderNavigation(String section) {
        navigation.openSection(section);
    }

    public MainPage checkPhone(String number) {
        footer.checkPhoneNumber(number);
        return this;
    }

    public MainPage checkAddress(String address) {
        footer.checkAddress(address);
        return this;
    }

    public MainPage checkVkPage() {
        footer.checkVK();
        return this;
    }

    public MainPage checkDzen() {
        footer.checkDzen();
        return this;
    }
}
