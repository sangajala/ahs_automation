package ahs.Screens.suresh;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationScreen {
    @FindBy(xpath = "//li[@id='liRegistration']//a[1]")
    public WebElement register_link;
    @FindBy(xpath = "//input[@id='AppointmentDate']")
    public WebElement appointment_box;
    @FindBy(xpath = "//div[@class='md-radio-inline']//div[1]//label[1]")
    public WebElement newuser_button;
    @FindBy(xpath ="//div[@class='datepicker-days']//thead//tr[2]")
    public WebElement appointment_month;
    @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next']")
    public WebElement clander_nextClick;
    @FindBy(xpath = "//td[@class='day'][contains(text(),\" + AutomationContants.DAY + \")]")
    public WebElement appointment_day;
    @FindBy(xpath = "//div[@class='md-radio-inline']")
    public WebElement radio_button;
    @FindBy(xpath = "//div[@class='md-radio-inline']//div[1]//label[1]")
    public WebElement male_button;
    @FindBy(xpath = "//div[@class='col-md-4']//div[2]//label[1]")
    public WebElement female_button;
    @FindBy(xpath = "//div[@class='portlet-body']//div[2]//div[1]//span[1]//div[1]//button[1]//span[1]")
    public WebElement test_HAEMATOLOGY;
    @FindBy(xpath = "/div[@class='btn-group open']//li")
    public WebElement subtest_list;
    @FindBy(xpath = "//button[@id='btnBook']")
    public WebElement booking_button;
    @FindBy(css = "#Name")
    public WebElement name;
    @FindBy(css = "#Age")
    public WebElement age;
    @FindBy(css = "#RefDoctor")
    public WebElement refDoctor;
    @FindBy(css = "#MobileNumber")
    public WebElement mobile_no;
    @FindBy(css = "#Email")
    public WebElement email;
    @FindBy(css = "#Address")
    public WebElement address;
    @FindBy(css = "#PriceAmount")
    public WebElement total_amount;
    @FindBy(css = "#BranchID")
    public WebElement branch_name;
    @FindBy(xpath = "//select[@id='TimeSlotID']//option")
    public WebElement time;
    @FindBy(xpath = "//span[@class='caption-subject font-red sbold uppercase']" )
    public WebElement taxt;


}
