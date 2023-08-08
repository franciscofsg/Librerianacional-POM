package com.librerianacional.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaLibroPage extends PageObject {


   //private final By txtBuscarProductouno = By.xpath("//input[@class='form-control form-search ng-pristine ng-invalid ng-untouched']");

   private final By txtBuscarProducto = By.xpath("//input[@class='form-control form-search ng-untouched ng-pristine ng-invalid']");


   private final By txtLibroSeleccionado = By.xpath("//a[@class='d-block w-100 h-100']");

   public By getTxtBuscarProducto() {
      return txtBuscarProducto;
   }

   public By getTxtLibroSeleccionado() {
      return txtLibroSeleccionado;
   }
}
