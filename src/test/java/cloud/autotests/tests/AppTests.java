package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Case 1")
    void test() {

        step("Navigate to www.google.com", () -> {
            // todo
        });

        step("Search for cookies jar", () -> {
            // todo
        });

        step("First link should contains text "Gym Class Heroes"", () -> {
            // todo
        });

    }
}