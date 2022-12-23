package luma.us.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtility;
import luma.us.generics.WaitHelper;

public class LoginAndPurchase extends BasePage {

	public LoginAndPurchase() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	@CacheLookup
	// we are using encapsulation concept
	private WebElement clicksignBTN;

	public WebElement getClicksignBTN() {
		return clicksignBTN;
	}

	@FindBy(xpath = "//input[@title='Email']")
	@CacheLookup
	// we are using encapsulation concept
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	@FindBy(xpath = "//input[@title='Password']")
	@CacheLookup
	// we are using encapsulation concept
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
	@CacheLookup
	// we are using encapsulation concept
	private WebElement clicLogin;

	public WebElement getClicLogin() {
		return clicLogin;
	}

	@FindBy(xpath = "//*[text()='Welcome, Soumit Deb!']")
	@CacheLookup
	// we are using encapsulation concept
	private WebElement landingPageText;

	public WebElement getVerifiedlandingPageText() {
		return landingPageText;
	}

	@FindBy(xpath = "//span[text()='Men']")
	@CacheLookup

	private WebElement menModule;

	public WebElement getMenModule() {
		return menModule;
	}

	@FindBy(xpath = "(//span[text()='Tops'])[2]")
	@CacheLookup

	private WebElement selectTop;

	public WebElement getSelectTop() {
		return selectTop;
	}

	@FindBy(xpath = "(//span[text()='Jackets'])[2]")
	@CacheLookup

	private WebElement selectJackets;

	public WebElement getSelectJackets() {
		return selectJackets;
	}

	@FindBy(xpath = "(//a[@class='product-item-link'])[3]")
	@CacheLookup

	private WebElement selectJupiterJacket;

	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;
	}

	@FindBy(xpath = "//span[text()='Jupiter All-Weather Trainer ']")
	@CacheLookup

	private WebElement selectJupiterJackets;

	public WebElement getSelectJupiterJackets() {
		return selectJupiterJackets;
	}

	@FindBy(id = "option-label-size-143-item-168")
	@CacheLookup

	private WebElement selectSize;

	public WebElement getSelectSize() {
		return selectSize;
	}

	@FindBy(xpath = "//div[@option-label='Blue']")
	@CacheLookup

	private WebElement selectColor;

	public WebElement getSelectColor() {
		return selectColor;

	}

	@FindBy(xpath = "//*[@id='qty']")
	@CacheLookup

	private WebElement selectQty;

	public WebElement getSelectQty() {
		return selectQty;

	}

	@FindBy(xpath = "//span[text()='Add to Cart']")
	@CacheLookup

	private WebElement selectAddToCart;

	public WebElement getSelectAddToCart() {
		return selectAddToCart;

	}

	
	@FindBy(xpath = "//a[text()='shopping cart']")
	@CacheLookup

	private WebElement selectShoppingCart;

	public WebElement getSelectShoppingCart() {
		return selectShoppingCart;

	}
	
	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	@CacheLookup

	private WebElement selectCheckOut;

	public WebElement getSelectCheckOut() {
		return selectCheckOut;

	}
	
	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup
	private WebElement clickOnNewAddress;

	public WebElement getClickOnNewAddress() {
		return clickOnNewAddress;

	}

	@FindBy(xpath = "(//*[@type='text'])[2]")
	@CacheLookup
	private WebElement inputFirstName;

	public WebElement getInputFirstName() {
		return inputFirstName;

	}

	@FindBy(xpath = "(//*[@type='text'])[3]")
	@CacheLookup
	private WebElement inputLastName;

	public WebElement getInputLastName() {
		return inputLastName;

	}

	@FindBy(xpath = "(//*[@type='text'])[4]")
	@CacheLookup
	private WebElement clickOnCompanyName;

	public WebElement getClickOnCompanyName() {
		return clickOnCompanyName;

	}

	@FindBy(xpath = "(//input[@type='text'])[5]")
	@CacheLookup
	private WebElement inputStreetName;

	public WebElement getInputStreetName() {
		return inputStreetName;

	}

	@FindBy(xpath = "(//input[@type='text'])[8]")
	@CacheLookup
	private WebElement inputCityName;

	public WebElement getInputCityName() {
		return inputCityName;

	}
	
	
	

	@FindBy(xpath = "//*[@name='region_id']")
	@CacheLookup
	private WebElement inputStateName;

	public WebElement getInputStateName() {
		return inputStateName;

	}
	
	@FindBy(xpath = "//*[@name='postcode']")
	@CacheLookup
	private WebElement inputZipCode;

	public WebElement getInputZipCode() {
		return inputZipCode;

	}
	
	@FindBy(xpath = "//*[@name='country_id']")
	@CacheLookup
	private WebElement inputCountryName;

	public WebElement getInputCountryName() {
		return inputCountryName;

	}
	
	@FindBy(xpath = "//*[@name='telephone']")
	@CacheLookup
	private WebElement inputPhoneNumber;

	public WebElement getInputPhoneNumber() {
		return inputPhoneNumber;

	}
	
	
	@FindBy(xpath = "//span[text()='Ship here']")
	@CacheLookup
	private WebElement clickOnShipHere;

	public WebElement getClickOnShipHere() {
		return clickOnShipHere;
	}
		
		

	@FindBy(xpath = "//*[@name='ko_unique_3']")
	@CacheLookup
	private WebElement clickRadioButton;

	public WebElement getClickRadioButton() {
		return clickRadioButton;
	}
		
		
	@FindBy(xpath = "//button[@class='button action continue primary']")
	@CacheLookup
	private WebElement clickNext;

	public WebElement getClickNext() {
		return clickNext;
	}
		
	@FindBy(xpath = "//button[@class='action primary checkout']")
	@CacheLookup
	private WebElement clickPlaceOrder;

	public WebElement getClickPlaceOrder() {
		return clickPlaceOrder;
	}
	
	
	@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
	@CacheLookup
	private WebElement varification;

	public WebElement getVarification() {
		return varification;
	}
	

	public void getShippingDetails() {
		
		
		log.info("inputFirstName");
		WaitHelper.seleniumWait(getInputFirstName(), 30);
		CommonUtility.getActionClick(getInputFirstName());
		getInputFirstName().clear();
		getInputFirstName().sendKeys("Shah");
		
		
		log.info("inputLastName");
		WaitHelper.seleniumWait(getInputLastName(), 30);
		CommonUtility.getActionClick(getInputLastName());
		getInputLastName().clear();
		getInputLastName().sendKeys("Imran");
		
		
		log.info("getClickOnCompanyName");
		WaitHelper.seleniumWait(getClickOnCompanyName(), 30);
		CommonUtility.getActionClick(getClickOnCompanyName());
		getClickOnCompanyName().sendKeys("SmartTech");
		
		log.info("getInputStreetName");
		WaitHelper.seleniumWait(getInputStreetName(), 30);
		CommonUtility.getActionClick(getInputStreetName());
		getInputStreetName().sendKeys("JacksonHeight");
		
		log.info("getInputCityName");
		WaitHelper.seleniumWait(getInputCityName(), 30);
		CommonUtility.getActionClick(getInputCityName());
		getInputCityName().sendKeys("Nashville");
		
		
		log.info("getInputStateName");
		WaitHelper.seleniumWait(getInputStateName(), 30);
		CommonUtility.getSelectValue(getInputStateName(),"Tennessee");
		
		log.info("getInputZipCode");
		WaitHelper.seleniumWait(getInputZipCode(), 30);
		CommonUtility.getJs(getInputZipCode());
		getInputZipCode().sendKeys("37214");
		
		log.info("getInputCountryName");
		WaitHelper.seleniumWait(getInputCountryName(), 30);
		CommonUtility.getActionClick(getInputCountryName());
		CommonUtility.getSelectValue(getInputCountryName(),"United States");
		
		
		log.info("getInputPhoneNumber");
		WaitHelper.seleniumWait(getInputPhoneNumber(), 30);
		getInputPhoneNumber().sendKeys("615482759");
		
		log.info("getClickOnShipHere");
		WaitHelper.seleniumWait(getClickOnShipHere(), 30);
		CommonUtility.getActionClick(getClickOnShipHere());
		
		
		//log.info("clickRadioButton");
		//WaitHelper.seleniumWait(getClickRadioButton(), 30);
		//CommonUtility.getJs(getClickRadioButton());
		//CommonUtility.getActionClick(getClickRadioButton());
		
		//getClickRadio()
		log.info("clickRadioButton");
		CommonUtility.Highlighter(getClickRadioButton());
		WaitHelper.seleniumWait(getClickRadioButton(), 30);
		//CommonUtility.pageDown();
		CommonUtility.getActionClick(getClickRadioButton());
		
		
		log.info("getClickNext");
		WaitHelper.seleniumWait(getClickNext(), 30);
		CommonUtility.getActionClick(getClickNext());
		////span[@class='base']
		
		
		
		
	}
	
	
	public void getLogin() {

		log.info("User able to click SignIn button");
		WaitHelper.seleniumWait(getClicksignBTN(), 30);
		CommonUtility.getActionClick(getClicksignBTN());

		log.info("User able to enter userName");
		WaitHelper.seleniumWait(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("userName"));

		log.info("User able to enter password");
		WaitHelper.seleniumWait(getEnterPassword(), 30);
		getEnterPassword().sendKeys(prop.getProperty("passWord"));

		log.info("User able to click login button");
		WaitHelper.seleniumWait(getClicLogin(), 30);
		CommonUtility.getActionClick(getClicLogin());
		
		

	}

}
