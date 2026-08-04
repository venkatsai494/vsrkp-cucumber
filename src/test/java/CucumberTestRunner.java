import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utilities.ConfigReader;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinition",
        dryRun = false,
        monochrome = true
)
public class CucumberTestRunner {
    static {
        System.out.println("This is the first line" +ConfigReader.getTags());
        String tags = ConfigReader.getTags();
        if (tags != null && !tags.isEmpty()) {
            System.setProperty("cucumber.filter.tags", tags);
        }
    }
}
