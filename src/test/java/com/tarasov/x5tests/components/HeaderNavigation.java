package com.tarasov.x5tests.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HeaderNavigation {
    public void openCompanySection() {
        $(byText("Компания")).click();
        $("[aria-label='breadcrumbs']").shouldHave(Condition.text("Компания"));
    }

    public void openConsumerSection() {
        $(byText("Покупателю")).click();
        $("[aria-label='breadcrumbs']").shouldHave(Condition.text("Покупателю"));
    }

    public void openPartnersSection() {
        $(byText("Партнерам")).click();
        $("[aria-label='breadcrumbs']").shouldHave(Condition.text("Партнерам"));
    }

    public void openPressCenterSection() {
        $(byText("Пресс-центр")).click();
        $("[aria-label='breadcrumbs']").shouldHave(Condition.text("Пресс-центр"));
    }

    public void openCareerSection() {
        $(byText("Карьера")).click();
        $("[aria-label='breadcrumbs']").shouldHave(Condition.text("Карьера"));
    }
}
