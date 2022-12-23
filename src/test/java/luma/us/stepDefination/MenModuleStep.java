package luma.us.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtility;
import luma.us.generics.WaitHelper;
import luma.us.pagefactory.LoginAndPurchase;

public class MenModuleStep extends BasePage {

	LoginAndPurchase pf;

	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
		pf = PageFactory.initElements(driver, LoginAndPurchase.class);
		pf.getLogin();
		String expected = prop.getProperty("landingPageTitle");
		WaitHelper.seleniumWait(pf.getVerifiedlandingPageText(), 30);

		String actual = pf.getVerifiedlandingPageText().getText();
		CommonUtility.getAssert(expected, actual);

	}

	@When("User should be able to select Jupiter-All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
		
		CommonUtility.Highlighter(pf.getMenModule());
		WaitHelper.seleniumWait(pf.getMenModule(), 30);
		CommonUtility.mouseHover(pf.getMenModule());
		
		CommonUtility.Highlighter(pf.getSelectTop());
		WaitHelper.seleniumWait(pf.getSelectTop(), 30);
		CommonUtility.mouseHover(pf.getSelectTop());
		
		CommonUtility.Highlighter(pf.getSelectJackets());
		WaitHelper.seleniumWait(pf.getSelectJackets(), 30);
		CommonUtility.getActionClick(pf.getSelectJackets());
		
		CommonUtility.Highlighter(pf.getSelectJupiterJacket());
		WaitHelper.seleniumWait(pf.getSelectJupiterJacket(), 30);
		CommonUtility.getActionClick(pf.getSelectJupiterJacket());
		
	
	}

	@When("Verify the jacket name on the Jupiter-All-Weather Trainer list")
	public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
		CommonUtility.Highlighter(pf.getSelectJupiterJackets());
		String expected = prop.getProperty("jacketName");
		WaitHelper.seleniumWait(pf.getSelectJupiterJackets(), 30);
		String actual = pf.getSelectJupiterJackets().getText();
		CommonUtility.getAssert(expected, actual);
		
	}

	@When("User should be able to select the M and Green and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_m_and_green_and_then_click_on_the_add_to_cart(Integer int1) {
		CommonUtility.Highlighter(pf.getSelectSize());
		log.info("User can select size");
		WaitHelper.seleniumWait(pf.getSelectSize(), 30);
		//CommonUtility.getActionClick(pf.getSelectSize());;
		CommonUtility.getJs(pf.getSelectSize());
		
		CommonUtility.Highlighter(pf.getSelectColor());
		WaitHelper.seleniumWait(pf.getSelectColor(), 30);
		//CommonUtility.getActionClick(pf.getSelectColor());
		CommonUtility.getJs(pf.getSelectColor());
		
		CommonUtility.Highlighter(pf.getSelectQty());
		WaitHelper.seleniumWait(pf.getSelectQty(), 30);
		//CommonUtility.getActionClick(pf.getSelectColor());
		//CommonUtility.getJs(pf.getSelectQty());
		pf.getSelectQty().clear();
		pf.getSelectQty().sendKeys("1");
		
		CommonUtility.Highlighter(pf.getSelectAddToCart());
		WaitHelper.seleniumWait(pf.getSelectAddToCart(), 30);
		//CommonUtility.getActionClick(pf.getSelectColor());
		CommonUtility.getJs(pf.getSelectAddToCart());
		
	}

	@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {

		CommonUtility.Highlighter(pf.getSelectShoppingCart());
		WaitHelper.seleniumWait(pf.getSelectShoppingCart(), 30);
		CommonUtility.getActionClick(pf.getSelectShoppingCart());
		//CommonUtility.getJs(pf.getSelectShoppingCart());
		
		CommonUtility.Highlighter(pf.getSelectCheckOut());
		WaitHelper.seleniumWait(pf.getSelectCheckOut(), 30);
		CommonUtility.getActionClick(pf.getSelectCheckOut());
		
		
	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		CommonUtility.Highlighter(pf.getClickOnNewAddress());
		WaitHelper.seleniumWait(pf.getClickOnNewAddress(), 30);
		CommonUtility.getJs(pf.getClickOnNewAddress());
		
		pf.getShippingDetails();
		
		
		
	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {

		CommonUtility.Highlighter(pf.getClickPlaceOrder());
		WaitHelper.seleniumWait(pf.getClickPlaceOrder(), 30);
		//CommonUtility.getActionClick(pf.getClickPlaceOrder());
		CommonUtility.getJs(pf.getClickPlaceOrder());
		
	}

	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {

		CommonUtility.Highlighter(pf.getVarification());
		String expected = prop.getProperty("Varification");
		WaitHelper.seleniumWait(pf.getVarification(), 30);
		String actual = pf.getVarification().getText();
		CommonUtility.getAssert(expected, actual);
		
	}
}
