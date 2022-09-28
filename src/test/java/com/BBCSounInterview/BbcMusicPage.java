package com.BBCSounInterview;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcMusicPage extends BbcBasePage{

    @FindBy(xpath = "//h2[text()='Music']")
    public WebElement BbcSoundMusicVerificationPage;

    @FindBy(xpath = "(//div[@class='sc-c-portrait-card gs-u-display-flex'][1])")
    public WebElement FirstOptionUnderBackToBackSound;

    @FindBy(xpath = "//span[text()='Play all']")
    public WebElement BbcSoundMusicPlayAllLink;

}
