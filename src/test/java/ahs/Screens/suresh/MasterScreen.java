package ahs.Screens.suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterScreen {
    //xpath1
   /* @FindBy(how = How.XPATH, using = "//body[@class='page-header-fixed page-sidebar-closed-hide-logo']" +
            "/div[@class='wrapper']/header[@class='page-header']/nav[@class='navbar mega-menu']" +
            "/div[@class='container-fluid']/div[@class='nav-collapse collapse navbar-collapse navbar-responsive-collapse']" +
            "/ul[@class='nav navbar-nav']/li[5]/a[1]")
    public WebElement masters_link1;
    //xpath2
    @FindBy(how = How.XPATH,using ="//ul[@class='nav navbar-nav']/li[5]/a/i")
    public WebElement masters_link;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sub Test')]")
    public WebElement subtest_link;
    @FindBy(how = How.XPATH,using = "///li[@id='liAdmin']//li[3]//a[1]//i[1]")
    public WebElement grouptest_link;
    @FindBy(how = How.ID, using = "//a[@id='sample_editable_1_new']")
    public WebElement add_new_btn;
    @FindBy(how = How.ID,using = "GrouptestName")
    public WebElement group_test_box;
    @FindBy(how = How.ID,using = "Price")
    public WebElement price_box;
    @FindBy(how = How.CLASS_NAME,using = "btn green")
    public WebElement grouptest_submit_btn;
    @FindBy(how = How.XPATH,using = "//button[@class='btn grey-salsa btn-outline']")
    public WebElement cancel_btn;
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Assign Group Test')]")
    public WebElement assign_group_test;
    @FindBy(how = How.CLASS_NAME,using = "btn sbold green")
    public WebElement add_assign_group_test_btn;
    @FindBy(how = How.NAME, using = "MainTestID")
    public WebElement select_group_test;
    @FindBy(how = How.NAME,using = "AssignMaintestID")
    public WebElement select_category;
    @FindBy(how = How.NAME,using = "SubTestID")
    public WebElement select_sub_test;
    @FindBy(how = How.XPATH,using = "//button[@class='btn green']")
    public WebElement assign_grouptest_submit_btn;
    @FindBy(how = How.XPATH,using = "//button[@class='btn grey-salsa btn-outline']")
    public WebElement assign_grouptest_cancel_btn;
    @FindBy(how =How.XPATH,using = "//div[@class='table-scrollable']")
    public WebElement grouptest_nametable;
    @FindBy(how = How.NAME,using = "//select[@name='sample_length']")
    public WebElement entries;
    @FindBy(how=How.XPATH,using = "//input[@class='form-control input-sm input-small input-inline']")
    public WebElement search_name;
    @FindBy(how =How.CLASS_NAME,using = "fa fa-angle-down")
    public WebElement select_satus;
    @FindBy(how = How.CLASS_NAME,using = "fa fa-trash")
    public WebElement delete;
    @FindBy(how = How.CLASS_NAME,using = "fa fa-angle-right")
    public WebElement next_pagesign;
    @FindBy(how = How.CLASS_NAME,using = "fa fa-angle-left")
    public WebElement previous_pagesign;
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'2')]")
    public WebElement page_number;

    */
    //===============================================================
    @FindBy(xpath ="//ul[@class='nav navbar-nav']/li[5]/a/i")
    public WebElement masters_link;
    @FindBy(xpath = "//a[contains(text(),'Sub Test')]")
    public WebElement subtest_link;
    @FindBy(xpath= "//li[@id='liAdmin']//li[3]//a[1]//i[1]")
    public WebElement grouptest_link;
    @FindBy(xpath= "//a[@id='sample_editable_1_new']")
    public WebElement add_new_btn;
    @FindBy(id = "GrouptestName")
    public WebElement group_test_box;
    @FindBy(id= "Price")
    public WebElement price_box;
    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement grouptest_submit_btn;
    @FindBy(xpath= "//button[@class='btn grey-salsa btn-outline']")
    public WebElement cancel_btn;
    @FindBy(xpath= "//a[contains(text(),'Assign Group Test')]")
    public WebElement assign_group_test;
    @FindBy(className= "btn sbold green")
    public WebElement add_assign_group_test_btn;
    @FindBy(name= "MainTestID")
    public WebElement select_group_test;
    @FindBy(name= "AssignMaintestID")
    public WebElement select_category;
    @FindBy(name= "SubTestID")
    public WebElement select_sub_test;
    @FindBy(xpath= "//button[@class='btn green']")
    public WebElement assign_grouptest_submit_btn;
    @FindBy(xpath= "//button[@class='btn grey-salsa btn-outline']")
    public WebElement assign_grouptest_cancel_btn;
    @FindBy(xpath = "//div[@class='table-scrollable']")
    public WebElement grouptest_nametable;
    @FindBy(name= "//select[@name='sample_length']")
    public WebElement entries;
    @FindBy(xpath= "//input[@class='form-control input-sm input-small input-inline']")
    public WebElement search_name;
    @FindBy(className = "fa fa-angle-down")
    public WebElement select_satus;
    @FindBy(className= "fa fa-trash")
    public WebElement delete;
    @FindBy(xpath = "//li[@class='next']//a")
    public WebElement next_pagesign;
    @FindBy(xpath = "//li[@class='prev']//a")
    public WebElement previous_pagesign;
    @FindBy(xpath= "//a[contains(text(),'2')]")
    public WebElement page_number;
    @FindBy(xpath ="//div[@class='alert alert-danger']" )
    public WebElement alert_massage;
    @FindBy(xpath = "//select[@name='sample_length']")
    public WebElement num_entries;
    @FindBy(xpath = "//button[@class='btn green btn-xs btn-outline dropdown-toggle']")
    public WebElement select_option;
    @FindBy(xpath ="//div[@class='btn-group pull-right open']//ul[@class='dropdown-menu pull-right']")
    public WebElement active_inactive_options;
    @FindBy(xpath = "//div[@class='breadcrumbs']")
    public WebElement page_text;

    public MasterScreen(WebDriver driver) {

    }
}
