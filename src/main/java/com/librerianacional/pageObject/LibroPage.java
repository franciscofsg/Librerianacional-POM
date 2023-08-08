package com.librerianacional.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LibroPage extends PageObject {

   private final By iconoAumentoCantidad = By.xpath("//button[@class='bg-white p-2 d-flex justify-content-center align-items-center border amount' and @data-dir='up']");
   private final By btnAgregarAlCarrito = By.xpath("//button[@class='btn d-flex align-items-center py-2 px-3 btn-blue-medium border-0 border-radius-0 bs-none outline-0 text-center text--upper text-white text--xl text--extrabold h-100']");

   public By getIconoAumentoCantidad() {
      return iconoAumentoCantidad;
   }

   public By getBtnAgregarAlCarrito() {
      return btnAgregarAlCarrito;
   }
}
