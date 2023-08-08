package com.librerianacional.stepDefinitions;

import com.librerianacional.steps.BusquedaLibroSteps;
import com.librerianacional.steps.DetalleLibroSteps;
import com.librerianacional.steps.LibroSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class BusquedaLibroStepDefinitions {

    @Steps
    BusquedaLibroSteps busquedaLibrostep;

    @Steps
    LibroSteps librostep;

    @Steps
    DetalleLibroSteps detallelibros;



    @Dado("que el usuario abre la pagina de librenacional.com")
    public void queElUsuarioAbreLaPaginaDeLibrenacionalCom() {

            busquedaLibrostep.abrirNavegador();

    }


   @Cuando("el usuario busca un libro")
public void elUsuarioBuscaUnLibro() {


       busquedaLibrostep.buscarLibro();


   }

    @Cuando("de click en un libro")
    public void deClickEnUnLibro() {

        busquedaLibrostep.deClickLibro();

    }
    @Cuando("ingrese la cantidad de libros que desea comprar")
    public void ingreseLaCantidadDeLibrosQueDeseaComprar() {

        librostep.ingreseCantidadLibros();

    }
    @Cuando("de click en añadir al carrito")
    public void deClickEnAñadirAlCarrito() {

        librostep.ClickEnAñadirAlCarrito();

    }
    @Entonces("el usuario verifica los detalles del producto agregado")
    public void elUsuarioVerificaLosDetallesDelProductoAgregado() {

        detallelibros.VerificarDetallesProductoAgregado();

    }

}
