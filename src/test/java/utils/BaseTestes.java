package utils;


import static utils.DriverFactory.getDriver;

public class BaseTestes {

    @org.junit.After
    public void TearDown() {
        getDriver().quit();
    }

   
}
