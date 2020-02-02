package ahs.Screens.sriram.umer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AppointmentDetailsVerifyScreen1 {
    @FindBy(how= How.XPATH,using = "/html[1]/body[1]/div[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
    public WebElement appointment_menu;

    @FindBy(how= How.CLASS_NAME,using = "page-content-row")
    public WebElement appointmentdetail_page;
    @FindBy(how= How.XPATH,using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/label[1]/input[1]")
    public WebElement search_text;

    @FindBy(how = How.XPATH,using = ("//td[contains(text(),'55')]"))
    public WebElement selected_ID;

//    @FindBy(how = How.XPATH,using = "//tr[3]//td[3]")
//    public WebElement selected_Name;


    @FindBy(how = How.XPATH,using = "//td[13]//a[1]")
    public WebElement cancel_action;


    @FindBy(how = How.CLASS_NAME,using = "modal-title")
    public WebElement comment_title;

    @FindBy(how = How.ID,using = "txtSender")
    public WebElement enter_text;

    @FindBy(how = How.ID,using = "btnSend")
    public WebElement submit_button;

    @FindBy(how = How.XPATH,using = "//th[@class='desktop sorting']")
    public WebElement Status_check;
}
