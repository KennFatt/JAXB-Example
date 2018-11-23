package xyz.kennan.xmlparsing;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IContainer")
public class IContainer {

    @XmlElement(name = "IObject")
    private List<IInner> lists;

    public IContainer() { }

    public List<IInner> getLists() {
        return lists;
    }

}
