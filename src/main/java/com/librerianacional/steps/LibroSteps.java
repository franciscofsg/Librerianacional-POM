package com.librerianacional.steps;

import com.librerianacional.pageObject.BusquedaLibroPage;
import com.librerianacional.pageObject.LibroPage;
import io.cucumber.java.es.Cuando;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LibroSteps {
    @Page
    LibroPage libro;


    @Step("ingresar cantidad de libros a comprar")
    public void ingreseCantidadLibros() {

        WebDriverWait t = new WebDriverWait(libro.getDriver(), Duration.ofSeconds(10));
        WebElement until = t.until(ExpectedConditions.presenceOfElementLocated(libro.getIconoAumentoCantidad()));

        until.click();
        until.click();



    }



    @Step("dar click en añadir al carrito")
    public void ClickEnAñadirAlCarrito() {

        libro.getDriver().findElement(libro.getBtnAgregarAlCarrito()).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
