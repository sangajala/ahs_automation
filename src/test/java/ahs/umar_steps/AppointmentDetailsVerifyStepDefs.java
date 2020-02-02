package ahs.umar_steps;

import ahs.pageObjects.umar.AppointmentDetailsVerifyObj;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppointmentDetailsVerifyStepDefs {

    AppointmentDetailsVerifyObj appointmentDetailsVerifyObj = new AppointmentDetailsVerifyObj();
    @When("^user click on appointment details page$")
    public void user_click_on_appointment_details_page()  {
        appointmentDetailsVerifyObj.appointmentpage();

    }

    @Then("^user should navigate to appointment details page$")
    public void user_should_navigate_to_appointment_details_page()  {
        appointmentDetailsVerifyObj.on_appointmentpage();

    }

    @When("^user enters ID or Name in search box$")
    public void user_enters_ID_or_Name_in_search_box()  {
        appointmentDetailsVerifyObj.search();

    }

    @Then("^user should see the desired ID or Name$")
    public void user_should_see_the_desired_ID_or_Name()  {
        appointmentDetailsVerifyObj.patient();

    }

    @When("^user performs the cancel action$")
    public void user_performs_the_cancel_action()  {
        appointmentDetailsVerifyObj.cancel_action();

    }

    @Then("^comment box should appear$")
    public void comment_box_should_appear()  {
        appointmentDetailsVerifyObj.comment_box();

    }

    @When("^user enters the comment$")
    public void user_enters_the_comment()  {
        appointmentDetailsVerifyObj.write_comment_box();

    }

    @When("^user click on submit button$")
    public void user_click_on_submit_button()  {
        appointmentDetailsVerifyObj.submit_btn();

    }

    @Then("^user should navigate back to appointment details page$")
    public void user_should_navigate_back_to_appointment_details_page()  {
        appointmentDetailsVerifyObj.mainpage_appointmentdetail();

    }

    @Then("^user should see the statusof the selected ID or Name$")
    public void user_should_see_the_statusof_the_selected_ID_or_Name()  {
        


    }
}