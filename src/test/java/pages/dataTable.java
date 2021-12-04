package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class dataTable {

    public dataTable(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement logInLink;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstname;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastname;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_office")
    public WebElement office;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extn;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement date;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement btnName;

    @FindBy(xpath = "//*[@id='example_filter']")
    public WebElement search;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchbox;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement datGrid;



}

