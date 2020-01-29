package ahs.Screens.suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AppointmentScreen {
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = " Appointment Details\n" +
            "                                    ")
    public List<WebElement> menu_links;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]/a/i")
    public WebElement appointment_link;
    @FindBy(css = "#FromDate")
    public WebElement fromdate_box;
    @FindBy(css = "#ToDate")
    public WebElement toDate_box;
    @FindBy(xpath = "//button[@class='button btn green']")
    public WebElement submit_button;
    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement submit_button2;
    @FindBy(css = "input[type='Search']")
    public WebElement search_button;
    @FindBy(css = "[name='sample_123_length']")
    public WebElement noOf_entry;
    @FindBy(css = "div[class='table-scrollable']")
    public WebElement table_list;
    @FindBy(xpath = "//tr//td[11]//a")
    public WebElement assignUser_tab;
    @FindBy(css = "//tr//td[12]//a")
    public WebElement edit_tab;
    @FindBy(xpath = "//tr//td[13]//a[1]")
    public WebElement cancel_tab;
    @FindBy(css = "#TimeSlotID")
    public WebElement time_slot;
    @FindBy(xpath = "//textarea[@id='txtSender']")
    public WebElement send_text;
    @FindBy(xpath = "//input[@id='btnSend']")
    public WebElement send_button;
    @FindBy(css = "th[class='all sorting_desc']")
    public WebElement arrow_button;
    @FindBy(xpath = "//td[@class='sorting_1']")
    public WebElement plus_sign;
    @FindBy(xpath = "//div[@class='breadcrumbs']")
    public WebElement inner_text;


    public AppointmentScreen(WebDriver driver) {

    }
}
