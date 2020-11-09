package maria.viyuela.busqueda;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Busqueda {

    /**
     * Busca las palabras en una pagina web
     * @return devuelve el numero de elementos con la palabra Fhios
     */
    public int buscarPalabra() {
        // Inicializar navegador
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Abrir navegador
        driver.get("https://www.fhios.es/");

        //Busqueda de la palabra "Fhios"
        List<WebElement> elem = driver.findElements(By.xpath("//body//*[contains(text(),'Fhios')]"));

        // Cerrar navegador
        driver.close();

        return elem.size();
    }
}
