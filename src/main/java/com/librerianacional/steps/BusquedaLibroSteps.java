package com.librerianacional.steps;


import com.librerianacional.pageObject.BusquedaLibroPage;
import com.librerianacional.utils.Datadriver;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusquedaLibroSteps {
    @Page
    BusquedaLibroPage busquedaLibro;

    @Step("Abrir el navegador")
    public void abrirNavegador() {

        busquedaLibro.openUrl("https://librerianacional.com/");

    }

    @Step("Ingresar nombre del libro en el buscador")
    public void buscarLibro() {


        List<WebElement> elemento = busquedaLibro.getDriver().findElements(busquedaLibro.getTxtBuscarProducto());
        elemento.get(1).sendKeys(Datadriver.getMapData("libro").get("Libro"));
        elemento.get(1).sendKeys(Keys.ENTER);

    }


    @Step("Dar click en el libro")
    public void deClickLibro() {

        List<WebElement> elemento = busquedaLibro.getDriver().findElements(busquedaLibro.getTxtLibroSeleccionado());
        elemento.get(0).click();


       // elemento.get(1).sendKeys(Keys.ENTER);


     //   busquedaLibro.getDriver().findElement(busquedaLibro.getTxtLibroSeleccionado()).click();


    }

}
