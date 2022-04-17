package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${properties}.properties"
})
public interface ProjectConfig extends Config {

    @Key("browser")
    @DefaultValue("Chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("99.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remoteDriverUrl")
    @DefaultValue("")
    String remoteDriverUrl();

    @Key("videoStorage")
    @DefaultValue("")
    String videoStorage();
}
