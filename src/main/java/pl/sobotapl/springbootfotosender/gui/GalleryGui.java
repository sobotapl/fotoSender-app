package pl.sobotapl.springbootfotosender.gui;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.sobotapl.springbootfotosender.model.Image;
import pl.sobotapl.springbootfotosender.repo.ImageRepo;


import java.util.List;

@Route("gallery")

public class GalleryGui extends VerticalLayout {

    private ImageRepo imageUpader;

    @Autowired
    public GalleryGui(ImageRepo imageUpader) {
        this.imageUpader = imageUpader;
        List<Image> all = imageUpader.findAll();
        all.stream().forEach(element -> {
            com.vaadin.flow.component.html.Image image =
                    new com.vaadin.flow.component.html.Image(element.getImageAdress(), "brak");
            add(image);
        } );
    }
}
