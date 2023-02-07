package com.tarasov.x5tests;

import com.codeborne.selenide.Condition;
import com.tarasov.x5tests.components.HeaderNavigation;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("x5test")
@Feature("X5 main page header")
@Story("Navigation test")
public class LaunchTests extends TestBase {
    HeaderNavigation navigation = new HeaderNavigation();

    @Test
    @DisplayName("Open and verify main page")
    public void checkMainPage() {
        step("Open and check main page", () -> {
            open("https://www.x5.ru/ru/");
            $(".footer__bottom").shouldHave(Condition.text("X5 Retail Group"));
        });
    }

    @Test
    @DisplayName("Open and verify 'Company section'")
    public void checkCompanySections() {
        step("Open main page", () -> {
            open("https://www.x5.ru/ru/");
        });

        step("Verify 'Company' section", () -> {
            navigation.openCompanySection();
        });
    }

    @Test
    @DisplayName("Open and verify 'Consumer section'")
    public void checkConsumerSections() {
        step("Open main page", () -> {
            open("https://www.x5.ru/ru/");
        });

        step("Verify 'Consumer' section", () -> {
            navigation.openConsumerSection();
        });
    }

    @Test
    @DisplayName("Open and verify 'Partners section'")
    public void checkPartnersSections() {
        step("Open main page", () -> {
            open("https://www.x5.ru/ru/");
        });

        step("Verify 'Partners' section", () -> {
            navigation.openPartnersSection();
        });
    }

    @Test
    @DisplayName("Open and verify 'Press-center section'")
    public void checkPressCenterSections() {
        step("Open main page", () -> {
            open("https://www.x5.ru/ru/");
        });

        step("Verify 'Press-center' section", () -> {
            navigation.openPressCenterSection();
        });
    }

    @Test
    @DisplayName("Open and verify 'Career section'")
    public void checkCareerSections() {
        step("Open main page", () -> {
            open("https://www.x5.ru/ru/");
        });

        step("Verify 'Career' section", () -> {
            navigation.openCareerSection();
        });
    }
}
