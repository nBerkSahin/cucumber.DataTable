package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.dataTable;
import utilities.ConfigReader;
import utilities.Driver;

public class stepDefinitions {

    dataTable dataTable = new dataTable();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanıcı {string} sayfasına gider")
    public void kullanıcıSayfasınaGider(String istenenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenURL));
    }


    @Then("new butonuna basar")
    public void newButonunaBasar() {dataTable.logInLink.click();
    }

    @And("editor firstname kutusuna {string} bilgilerini girer")
    public void editorFirstnameKutusunaFirstNameBilgileriniGirer(String fn) {dataTable.firstname.sendKeys(fn);
    }

    @And("editor lastname kutusuna {string} bilgilerini girer")
    public void editorLastnameKutusunaLastNameBilgileriniGirer(String ln) {dataTable.lastname.sendKeys(ln);
    }

    @And("editor position kutusuna {string} bilgilerini girer")
    public void editorPositionKutusunaPositionBilgileriniGirer(String p) {dataTable.position.sendKeys(p);
    }

    @And("editor office kutusuna {string} bilgilerini girer")
    public void editorOfficeKutusunaOfficeBilgileriniGirer(String o) {dataTable.office.sendKeys(o);
    }

    @And("editor extension kutusuna {string} bilgilerini girer")
    public void editorExtensionKutusunaExtensionBilgileriniGirer(String ex) {dataTable.extn.sendKeys(ex);
    }

    @And("editor startdate kutusuna {string} bilgilerini girer")
    public void editorStartdateKutusunaStartDateBilgileriniGirer(String sd) {dataTable.date.sendKeys(sd);
    }

    @And("editor salary kutusuna {string} bilgilerini girer")
    public void editorSalaryKutusunaSalaryBilgileriniGirer(String sl) {dataTable.salary.sendKeys(sl);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {dataTable.btnName.click();
    }

    @And("ilgili kutulara {string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void ilgiliKutularaBilgileriniGirer(String fn, String ln, String p, String o, String ex, String sd, String sl) {

        actions.
                sendKeys(fn).
                sendKeys(Keys.TAB).
                sendKeys(ln).
                sendKeys(Keys.TAB).
                sendKeys(p).
                sendKeys(Keys.TAB).
                sendKeys(o).
                sendKeys(Keys.TAB).
                sendKeys(ex).
                sendKeys(Keys.TAB).
                sendKeys(sd).
                sendKeys(Keys.TAB).
                sendKeys(sl)
                .click(dataTable.btnName).perform();
    }


    @Then("{string} ve {string} girerek kaydin tamamlandiğini test eder")
    public void veGirerekKaydinTamamlandiğiniTestEder(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(2000);
        dataTable.searchbox.sendKeys(arg0," ",arg1 +Keys.ENTER);
        Assert.assertTrue(dataTable.datGrid.isDisplayed());
    }


}
