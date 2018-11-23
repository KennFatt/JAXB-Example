package xyz.kennan.xmlparsing;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IObject")
public class IInner {

    @XmlAttribute
    private String type;

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String path;

    @XmlValue
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IInner{" + "type='" + type + '\'' + ", name='" + name + '\'' + ", path='" + path + '\'' + ", value='" + value + '\'' + '}';
    }
}
