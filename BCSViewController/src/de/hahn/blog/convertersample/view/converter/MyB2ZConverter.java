package de.hahn.blog.convertersample.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class MyB2ZConverter implements Converter {
    public MyB2ZConverter() {
        super();
    }

    public Object getAsObject(FacesContext facesContext, UIComponent uIComponent, String string) {
        return string;
    }

    public String getAsString(FacesContext facesContext, UIComponent uIComponent, Object object) {
        if (object != null) {
            return object.toString().replaceAll("B","Z");
        } else {
            return null;
        }
    }
}
