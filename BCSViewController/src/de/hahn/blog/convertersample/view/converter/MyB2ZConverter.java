package de.hahn.blog.convertersample.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class MyB2ZConverter implements Converter {
    public MyB2ZConverter() {
        super();
    }

    /** Method which get the data from a uiComponent and should return it in the format we like to store in the DB (or elswhere)
     * @param facesContext current facesContext
     * @param uIComponent component which was used to deliver the data
     * @param string data from the ui component
     * @return object to use for further work (e.g. storage in the DB)
     */
    public Object getAsObject(FacesContext facesContext, UIComponent uIComponent, String string) {
        if (string != null) {
            String ret = string.replaceAll("-Z-", "B");
            return ret;
        } else {
            return null;
        }
    }

    /** Method to get the string representation of hte object to use in the UI
     * @param facesContext current facesContext
     * @param uIComponent component which was used to deliver the data
     * @param object data from storage to be converted
     * @return sting to use for in the UI
     */
    public String getAsString(FacesContext facesContext, UIComponent uIComponent, Object object) {
        if (object != null) {
            String ret = object.toString().replaceAll("B", "-Z-");
            return ret;
        } else {
            return null;
        }
    }
}
