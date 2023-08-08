package com.librerianacional.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetalleLibroPage extends PageObject {


   private final By LBLDetallelibro = By.xpath("//div[@class='col-12 text--gray text--sml text--lh-1 px-0 text--semibold']");

   public By getLBLDetallelibro() {
      return LBLDetallelibro;
   }
}
