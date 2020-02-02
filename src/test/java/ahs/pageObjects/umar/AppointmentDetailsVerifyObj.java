package ahs.pageObjects.umar;

import AppointmentDetailsVerifyScreen.umer.AppointmentDetailsVerifyScreen1;
import ahs.pageObjects.basePage;
import ahs.support.AutomationContants;
import ahs.support.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class AppointmentDetailsVerifyObj extends basePage {
   AppointmentDetailsVerifyScreen1 appointmentDetailsVerifyScreen1 = new AppointmentDetailsVerifyScreen1();
    public AppointmentDetailsVerifyObj(){
        driver = BrowserFactory.getBrowser();
        PageFactory.initElements(driver,appointmentDetailsVerifyScreen1);

    }
    public void appointmentpage(){
        appointmentDetailsVerifyScreen1.appointment_menu.click();
    }
    public void on_appointmentpage(){
        appointmentDetailsVerifyScreen1.appointmentdetail_page.getText();
        Assert.assertTrue(String.valueOf(appointmentDetailsVerifyScreen1.appointment_menu),true);
    }
    public void search(){
        //  appointmentdetail.search_text.sendKeys("ali");
        appointmentDetailsVerifyScreen1.search_text.sendKeys(AutomationContants.ID);
    }
    public void patient(){
        //appointmentdetail.selected_ID.getText();
        Assert.assertTrue(String.valueOf(appointmentDetailsVerifyScreen1.selected_ID),true);
//Assert.assertEquals(search(),AutomationContants.ID)
//        //Assert.assertThat(appointmentdetail.selected_ID,56);
////Assert.assertSame("55",appointmentdetail);
//
    }
    public void cancel_action(){
        appointmentDetailsVerifyScreen1.cancel_action.click();
    }
    public void comment_box(){
        // appointmentdetail.comment_title.getText();
        Assert.assertTrue(String.valueOf(appointmentDetailsVerifyScreen1.comment_title),true);
    }
    public void write_comment_box() {
        appointmentDetailsVerifyScreen1.enter_text.sendKeys(AutomationContants.comments);
    }
    public void submit_btn()
    {
        appointmentDetailsVerifyScreen1.submit_button.click();
    }

    public void mainpage_appointmentdetail(){
//appointmentdetail.appointment_menu.getText();
        Assert.assertTrue(String.valueOf(appointmentDetailsVerifyScreen1.appointment_menu),true);
        // appointmentdetail.search_text.sendKeys(AutomationContants.ID);
//appointmentdetail.selected_ID.isDisplayed();
        appointmentDetailsVerifyScreen1.Status_check.sendKeys(AutomationContants.status);
    }

}
