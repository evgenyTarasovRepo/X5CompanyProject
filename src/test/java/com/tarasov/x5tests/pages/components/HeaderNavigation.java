package com.tarasov.x5tests.pages.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderNavigation {

    public void openSection(String section) {
        $(byText(section)).click();
        $("[aria-label='breadcrumbs']").shouldHave(Condition.text(section));
    }

}
