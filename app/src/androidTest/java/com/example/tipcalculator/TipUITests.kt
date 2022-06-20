import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.tipcalculator.TipTimeScreen
import com.example.tipcalculator.ui.theme.TipCalculatorTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipCalculatorTheme {
                TipTimeScreen()
            }
        }

        composeTestRule.onNodeWithText("Bill amount")
            .performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")

        val expectedText = "Tip amount: ${NumberFormat.getCurrencyInstance().format(2.0)}"
        composeTestRule.onNodeWithText(expectedText).assertExists()
    }
}