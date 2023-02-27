package com.tarasov.x5tests;

import com.codeborne.selenide.Condition;
import com.tarasov.x5tests.testdata.TestData;
import com.tarasov.x5tests.pages.MainPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Tag("x5test")
@Feature("X5 web site tests")
@Story("UI tests")
public class LaunchTests extends TestBase {
    MainPage mainPage = new MainPage();
    TestData testData = new TestData();

    @Test
    @DisplayName("Open and verify main page")
    public void checkMainPageOpen() {
        step("Open main page", () -> {
            mainPage.openMainPage();
        }); }

    @ValueSource(strings = {
            "Компания",
            "Партнерам",
            "Покупателю",
            "Инвесторам",
            "Пресс-центр",
            "Карьера"
    })
    @ParameterizedTest(name = "{index}: {0}")
    public void checkNavigation(String value) {
        System.setProperty("remoteUrl", "remote");
        step("Verify 'Company' section", () -> {
            mainPage.openMainPage();
            $(byText(value)).click();
            $("[aria-label='breadcrumbs']").shouldHave(Condition.text(value));
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

    @Disabled
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
