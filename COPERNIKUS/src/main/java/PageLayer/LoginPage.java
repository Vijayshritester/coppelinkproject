package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="mail")
	private WebElement email;
	
	@FindBy(name="field_first_name[0][value]")
	private WebElement fname;
	
	@FindBy(name="field_surname[0][value]")
	private WebElement lname;
	
	@FindBy(name="field_country")
	private WebElement country;
	
	@FindBy(name="field_sector")
	private WebElement sector;
	
	@FindBy(name="field_organisation[0][value]")
	private WebElement organization;
	
	@FindBy(name="field_reg_behalf_of[value]")
	private WebElement check1;
	
	@FindBy(name="field_tc_terms-of-use-cds")
	private WebElement checkbox2;
	
	@FindBy(name="field_tc_data-protection-privacy-statement")
	private WebElement checkbox3;
	
	public   LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginpagefunctionality(String Email,String firstname,
			String lastname,String Country,String Sector,String
			org)
	{
		email.sendKeys(Email);
		
		fname.sendKeys(firstname);
		
		lname.sendKeys(lastname);
		
		Select sel=new Select(country);
		sel.selectByVisibleText(Country);
		
		Select sel2=new Select(sector);
		sel2.selectByVisibleText(Sector);
		
		organization.sendKeys(org);
		
		check1.click();
		
		checkbox2.click();
		
		checkbox3.click();
		
		
	}

}
