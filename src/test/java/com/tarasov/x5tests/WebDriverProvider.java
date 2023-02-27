package com.tarasov.x5tests;

import com.codeborne.selenide.Configuration;
import com.tarasov.x5tests.config.IWebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {
    private IWebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(IWebDriverConfig.class, System.getProperties());
        createDriver();
    }

    public void createDriver() {
        if (config.getBrowser().equalsIgnoreCase("chrome")) {
            Configuration.browser = "chrome";
        }
        if (config.getBrowser().equalsIgnoreCase("firefox")) {
            Configuration.browser = "firefox";
        }

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.remote = config.getRemoteUrl();
        Configuration.browserVersion = config.getBrowserVersion();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
    }

}
