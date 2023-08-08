package com.librerianacional.steps;

import com.librerianacional.pageObject.DetalleLibroPage;
import com.librerianacional.pageObject.LibroPage;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DetalleLibroSteps {
    @Page
    DetalleLibroPage detalleLibro;


    @Step("Verificar los detalles del producto agregado")
    public void VerificarDetallesProductoAgregado () {

        Boolean prueba = detalleLibro.getDriver().findElement(detalleLibro.getLBLDetallelibro()).isDisplayed();

        Assert.assertTrue(prueba);


    }

}
