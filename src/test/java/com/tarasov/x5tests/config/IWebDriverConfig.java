package com.tarasov.x5tests.config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${dev}.properties"
})
public interface IWebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://www.x5.ru/ru/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();
}
