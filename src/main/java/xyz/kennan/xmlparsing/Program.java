package xyz.kennan.xmlparsing;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program {

    public static final String FILE = "iobject.xml";

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        JAXBContext ctx = JAXBContext.newInstance(IContainer.class);
        Unmarshaller unm = ctx.createUnmarshaller();

        IContainer res = (IContainer) unm.unmarshal(new FileReader(FILE));
        for (IInner datum : res.getLists()) {
            System.out.println(datum.toString());
        }
    }

}
