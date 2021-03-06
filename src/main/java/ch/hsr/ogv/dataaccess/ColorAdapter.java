package ch.hsr.ogv.dataaccess;

import ch.hsr.ogv.util.ColorUtil;
import javafx.scene.paint.Color;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ColorAdapter extends XmlAdapter<String, Color> {

    /*
     * Java => XML
     */
    @Override
    public String marshal(Color val) throws Exception {
        return ColorUtil.colorToWebColor(val);
    }

    /*
     * XML => Java
     */
    @Override
    public Color unmarshal(String val) throws Exception {
        return ColorUtil.webColorToColor(val);
    }
}
