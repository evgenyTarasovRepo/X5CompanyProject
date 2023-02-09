package com.tarasov.x5tests;

import com.codeborne.selenide.Condition;
import com.tarasov.x5tests.TestData.TestData;
import com.tarasov.x5tests.pages.MainPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("x5test")
@Feature("X5 web site tests")
@Story("UI tests")
public class LaunchTests extends TestBase {
    MainPage mainPage = new MainPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Open and verify main page")
    public void checkMainPage() {
        step("Open and check main page", () -> {
            open("https://www.x5.ru/ru/");
            $(".footer__bottom").shouldHave(Condition.text("X5 Retail Group"));
        });
    }

    @Test
    @DisplayName("Open and verify header sections")
    public void checkHeaderSections() {
        step("Open main page", () -> {
            mainPage.openMainPage();
        });

        step("Verify 'Company' section", () -> {
            mainPage.openMainPage();
            mainPage.checkHeaderNavigation(testData.company);
        });

        step("Verify 'Consumer' section", () -> {
            mainPage.openMainPage();
            mainPage.checkHeaderNavigation(testData.consumer);
        });

        step("Verify 'Partners' section", () -> {
            mainPage.openMainPage();
            mainPage.checkHeaderNavigation(testData.partners);
        });

        step("Verify 'Investors' section", () -> {
            mainPage.openMainPage();
            mainPage.checkHeaderNavigation(testData.investors);
        });

        step("Verify 'Press-center' section", () -> {
            mainPage.openMainPage();
            mainPage.checkHeaderNavigation(testData.pressCenter);
        });

        step("Verify 'Career' section", () -> {
            mainPage.openMainPage();
            mainPage.checkHeaderNavigation(testData.career);
        });
    }

    @Test
    @DisplayName("Verify address")
    public void verifyAddress() {
        mainPage
                .openMainPage()
                .checkAddress(testData.address);
    }

    @Test
    @DisplayName("Verify phone numbers")
    public void verifyPhoneNumber() {
        mainPage
                .openMainPage()
                .checkPhone(testData.phoneNumber_1)
                .checkPhone(testData.phoneNumber_2);
    }

    @Test
    @DisplayName("Verify X5 VK")
    public void checkX5Vk() {
        mainPage
                .openMainPage()
                .checkVkPage();
    }

    @Test
    @DisplayName("Verify X5 Dzen")
    public void checkX5Dzen() {
        mainPage
                .openMainPage()
                .checkDzen();
    }
}
