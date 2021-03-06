package day5;


import day4.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

class FirstPOTests extends testBase {
    @Test
    public void firstTest(){
        //given
        FormPO formPO = new FormPO(driver);
        formPO.openMe();
        //when
        formPO.fillName("Bogdan","Wiadro");
        formPO.fillEmail("test@test.com");
        formPO.selectMale();
        formPO.fillAge(45);
        formPO.selectRandomExperience();
        formPO.selectManualTester();
        formPO.selectRandomContinent();
        formPO.selectRandomCommand();
        formPO.fillFileInput();
        formPO.fillAdditionalInformation("Tralalala");
        formPO.submit();
        //then
        Assert.assertEquals(formPO.getValidatorMessageText(),"Form send with success");
    }
@Test
public void alternativeTest(){
        FormAlternativePO formAlternativePO = new FormAlternativePO(driver);
        formAlternativePO.openMe();


    /*    formAlternativePO
                .fillName("Bogdan", "Wiadro")
               .fillEmail()
                .selectMale()
                .fillAge(45)
                .selectRandomExperience()
                .selectManualTester()
                .selectRandomContinent()
                .selectRandomCommand()
                .fillFileInput()
                .fillAdditionalInformation("Tralalala")
                .submit()
                Assert.assertEquals(formAlternativePO.getValidatorMessageText("Form send with success"));
 */
}


    @Test
    public void progressBarTest(){
        ProgressBarPO progressBarPO = new ProgressBarPO(driver);
        progressBarPO.openMe();
        Assert.assertTrue(progressBarPO.progressBarIsComplete());
    }

    @Test
    public void testDelayedAlert(){
        AlertPO alertPO = new AlertPO(driver);
        alertPO.openMe();

        //String actual=alertPO;
       alertPO
        .clickDelayedAlert()
        .waitForAlertAndAccept();

       Assert.assertEquals(alertPO.getDelayedalertLabelText(),"OK button pressed");
    }
}