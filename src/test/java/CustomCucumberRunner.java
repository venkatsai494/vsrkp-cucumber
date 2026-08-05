import io.cucumber.core.cli.Main;
import utilities.ConfigReader;

public class CustomCucumberRunner {
    public static void main(String[] args) {
        String tags = ConfigReader.getTags();
        Main.main(new String[]{
                "-g", "stepdefinition",
                "-t", tags,
                "src/test/resources/features"
        });
    }
}
