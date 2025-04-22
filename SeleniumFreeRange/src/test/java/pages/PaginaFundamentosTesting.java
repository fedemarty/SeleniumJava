package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos y Principios Clave del Testing de Software' and @href]";

    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroduccionTestingLink() {
        clickElement(fundamentosTestingLink);
    }

}